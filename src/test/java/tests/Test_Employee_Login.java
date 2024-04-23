package tests;

import base.Base;

public class Test_Employee_Login extends Base {

	public static void main(String[] args) {
		startup();
		navigate("https://it.microtechlimited.com");
		click("//a[@href='elogin.php']");
		fill("//input[@name='mailuid']","testpilot@gmail.com");
		fill("//input[@name='pwd']","1234");
		click("//input[@name='login-submit']");
		String employeeId=page.locator("//h2[1]").innerText();
		System.out.println(employeeId);
		
		
		

	}

}
