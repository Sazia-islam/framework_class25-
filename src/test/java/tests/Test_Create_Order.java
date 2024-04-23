package tests;

import base.Base;

public class Test_Create_Order extends Base {

	public static void main(String[] args) {
		startup();
		navigate("https://it.microtechlimited.com");
		click("//a[@href='elogin.php']");
		page.locator("//input[@name='mailuid']").fill("testpilot@gmail.com");

		page.locator("//input[@name='pwd']").fill("1234");

		page.locator("//input[@name='login-submit']").click();

		page.locator("//a[text()='Product Order']").click();

		page.selectOption("//select[@name='prodId']", "Camera");

		page.locator("//input[@name='ordDate']").fill("11/21/2023");

		page.locator("//button[@type='submit']").click();

		System.out.println("Order Done");

	}

}
