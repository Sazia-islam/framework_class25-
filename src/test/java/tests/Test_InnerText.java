package tests;

import base.Base;

public class Test_InnerText extends Base {

	public static void main(String[] args) {
		startup();
		navigate("https://datatables.net");
		String Text = innerText("//div[@class='nav-item active']/a");
		System.out.println(Text);
		//vanen96415@mcenb.com
		click("//a[@class='register-action follow-link login']");
		//fill("//input[@id='DTE_Field_register-username']","Sazia");
		//fill("//input[@id='DTE_Field_register-email']","vanen96415@mcenb.com");
		//fill("//input[@id='DTE_Field_register-password1']","38233823");
		//fill("//input[@id='DTE_Field_register-password2']","38233823");
		//click("//button[@class='btn']");
		fill("//input[@id='DTE_Field_signin-username']","vanen96415@mcenb.com");
		fill("//input[@id='DTE_Field_signin-password']","38233823");
		click("//button[@class='btn']");
		//fill("//input[@id='DTE_Field_signin-username']", "Sazia");
		//fill("//input[@id='DTE_Field_signin-password']", "38233823");
		//click("//button[@class='btn']");
		count_Table_Head("//table", "//tr[1]/th");
		// click("//select[@name='example_length']");
		// we clicked in the menu bar
		click("#example_length > label > select");
		// before clicking we need to find the select the div- meaning the main area at
		// the beginning of code
		arrowdown("div.dt-demo-selector__options");

	}

}
