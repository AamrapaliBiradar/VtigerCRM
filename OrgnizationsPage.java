package Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrgnizationsPage {

	//Identify create organization..(+)
	@FindBy(xpath = "//img[@alt='Create Organization...']")
	private WebElement createorganization;

	public WebElement getCreateorganization() {
		return createorganization;
	}

	public WebElement getCreateorganization1() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
