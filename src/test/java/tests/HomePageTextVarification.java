package tests;

import base.Base;

public class HomePageTextVarification extends Base{

	public static void main(String[] args) {
	
		startup();
		navigate("https://it.microtechlimited.com");
		assertion("//h1[text()='Welcome to MicroTech NA.']","Welcome to MicroTech NA.");
		
		

	
	}
}
