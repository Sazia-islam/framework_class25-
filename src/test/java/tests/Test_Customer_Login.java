package tests;

import base.Base;

public class Test_Customer_Login extends Base {

	public static void main(String[] args) {
		startup();
		navigate("https://it.microtechlimited.com");
		click("//a[@href='elogin.php']");
		click("//a[@href='clogin.php']");
		fill("//input[@name='mailuid']", "david@gmail.com");

		fill("//input[@name='pwd']", "1234");

		click("//input[@name='login-submit']");

		String welcomeMessage = innerText("//h2[2]");

		System.out.println(welcomeMessage);
		p("Test customer login is pass");
		browserClose();
	}

}
