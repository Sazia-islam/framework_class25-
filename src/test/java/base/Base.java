package base;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import java.nio.file.Paths;
import java.util.ArrayList;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Base {
	public static Page page;

	public static void startup() {
		String chromepath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
		Playwright playwright = Playwright.create();
		ArrayList<String> arguments = new ArrayList<>();
		arguments.add("--start-maximized");
		LaunchOptions launchOptions = new BrowserType.LaunchOptions().setHeadless(false).setArgs(arguments)
				.setExecutablePath(Paths.get(chromepath));
		Browser browser = playwright.chromium().launch(launchOptions);
		BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
		page = context.newPage();
	}

	public static void navigate(String url) {
		page.navigate(url);
	}

	public static void click(String locator) {
		page.locator(locator).click();
	}

	public static void fill(String locator, String value) {
		page.locator(locator).fill(value);
	}

	public static String innerText(String locator) {
		String s = page.locator(locator).innerText();
		return s;
	}

	public static void p(String b) {
		System.out.println(b);
	}

	public static void assertion(String xpath, String text) {
		assertThat(page.locator(xpath)).hasText(text);
	}

	public static void browserClose() {
		page.close();
	}

	public static void Selection(String path, String value) {
		page.selectOption(path, value);
	}

	public static void arrowdown(String locator) {
		for (int i = 0; i < 2; i++) {
			page.press(locator, "ArrowDown");
		}
	}

	public static void count_Table_Head(String xpath, String xpath2) {// This is how we can count the table rows
		int num = page.locator(xpath).locator(xpath2).count();
		System.out.println("Table head is : " + num);
	}
}
