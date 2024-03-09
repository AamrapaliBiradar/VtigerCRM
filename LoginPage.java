package Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	//Identify Username textfield
	@FindBy(name="user_name")
	private WebElement Usernametf;
	
	//Identify Password textfield
	@FindBy(name="user_password")
	private WebElement passwordtf;
	
	//Identify Login button
	@FindBy(id="submitButton")
	private WebElement loginbtn;

	
	//Getters selected
	public WebElement getUsernametf() {
		return Usernametf;
	}

	public WebElement getPasswordtf() {
		return passwordtf;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
	
}
