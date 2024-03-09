package Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrgnizationInformationPage {

	//Identify organization name
	@FindBy(name="accountname")
	 private WebElement orgnizationnametf;
	
	//Identify group radio button
	@FindBy(xpath = "(//input[@name='assigntype'])[2]")
	private WebElement groupbtn;
	
	//identify the dropdown
	@FindBy(name="assigned_group_id")
	private WebElement dropdown;
	
	//Identify save button
	@FindBy(xpath = "(//input[@name='button'])[1]")
	private WebElement savebtn;
	

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getGroupbtn() {
		return groupbtn;
	}

	public WebElement getOrgnizationnametf() {
		return orgnizationnametf;
	}
	
	
	
	
}
