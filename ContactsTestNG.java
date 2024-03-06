package VtigerCRM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import CommonUtils.BaseClass;
import CommonUtils.ExcelUtil;
import CommonUtils.JavaUtil;
import CommonUtils.PropertyFileUtil;
import CommonUtils.WebDriverUtil;

public class ContactsTestNG extends BaseClass{
	
	public WebDriver driver;

	PropertyFileUtil putil = new PropertyFileUtil();
	WebDriverUtil wutil = new WebDriverUtil();
	ExcelUtil eutil = new ExcelUtil();
	JavaUtil jutil = new JavaUtil();

	@Test
	public void ContactsTest() throws IOException, InterruptedException {


		// To read the data from Contacts of excel sheet
		String FIRSTNAME = eutil.getDataFromExcel("Contacts", 0, 1);
		String LASTNAME = eutil.getDataFromExcel("Contacts", 1, 1);
		String GROUP = eutil.getDataFromExcel("Contacts", 2, 1);
		String ORGNAME = eutil.getDataFromExcel("Contacts", 3, 1);

		// Click on contacts
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();

		// Click on plus icon or create contacts..
		driver.findElement(By.cssSelector("img[alt='Create Contact...']")).click();

		// Click on assignedto click on group
		driver.findElement(By.xpath("(//input[@name='assigntype'])[2]")).click();

		// Enter a First Name
		driver.findElement(By.name("firstname")).sendKeys(FIRSTNAME);
		driver.findElement(By.name("lastname")).sendKeys(LASTNAME);

//		//I want to fail tehe testscript
//		String actualurl = driver.getCurrentUrl();
//		String expectedurl = "http://localhost:8888/pune/index.php?module=Contacts&action=EditView&return_action=DetailView&parenttab=Marketing";
//		Assert.assertEquals(actualurl, expectedurl);

		// In the droupdown select support group
		WebElement dropdown = driver.findElement(By.name("assigned_group_id"));
		wutil.handledropdown(dropdown, GROUP);

		// Click on select(+) in orgnization name text)
		driver.findElement(By.xpath("(//img[@alt='Select'])[1]")).click();

		// Transfer the driver control from parent window to child window
		wutil.switchWindow(driver,
				"http://localhost:8888/index.php?module=Accounts&action=Popup&popuptype=specific_contact_account_address&form=TasksEditView&form_submit=false&fromlink=&recordid=");

		// To enter organization name in searchtf
		driver.findElement(By.id("search_txt")).sendKeys(ORGNAME);

		// To click on search now button
		driver.findElement(By.name("search")).click();

		// Click on orgnization name
		driver.findElement(By.xpath("//a[text()='Intel']")).click();

		// To transfer the control from child window to parent window
		wutil.switchWindow(driver,
				"http://localhost:8888/index.php?module=Contacts&action=EditView&return_action=DetailView&parenttab=Marketing");

		// Click on save button
		driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();

//		Thread.sleep(2000);
//		//To Take screenshot of contact
//		wutil.screenshot(driver, "Contacts");

//		Thread.sleep(2000);
//		// Mouse hoven on image
//		WebElement image = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
//		wutil.mousehover(driver, image);
//
//		// Click on signout button
//		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();

	}
}
