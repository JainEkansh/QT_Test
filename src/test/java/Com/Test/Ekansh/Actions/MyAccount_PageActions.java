package Com.Test.Ekansh.Actions;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Com.Test.Ekansh.Runner.Initializer;

public class MyAccount_PageActions extends Initializer
{
	
	public MyAccount_PageActions() 
	{
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
	WebElement tShirtTab;
	
	@FindBy(css="a[title='Information']")
	WebElement myPersonalInfoBtn;
	
	
	public void clickTshirtTab()
	{
		tShirtTab.click();
		logMessage("Clicked on T-Shirt tab");
	}
	
	
	public void clickMyPersonalInfoBtn()
	{
		myPersonalInfoBtn.click();
		logMessage("Clicked on My Personal Information button");
	}
}
