package Com.Test.Ekansh.Actions;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Com.Test.Ekansh.Runner.Initializer;

public class PersonalInformation_PageActions extends Initializer
{
	
	public PersonalInformation_PageActions() 
	{
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="input[id='firstname']")
	WebElement firstName;
	
	@FindBy(css="button[name='submitIdentity']")
	WebElement saveBtn;
	
	@FindBy(css="input[name='old_passwd']")
	WebElement currentPwd;
	
	@FindBy(css="p[class='alert alert-success']")
	WebElement successMsg;
	
	public void enterFirstName(String expected)
	{
		firstName.click();
		firstName.clear();
		firstName.sendKeys(expected);
		logMessage("First name is entered");
	}
	
	
	public void clickSaveBtn()
	{
		saveBtn.click();
		logMessage("Clicked on save button");
	}
	
	
	public void enterCurrentPassword(String pwd)
	{
		currentPwd.click();
		currentPwd.clear();
		currentPwd.sendKeys(pwd);
		logMessage("Current pwd has been entered");
	}
	
	
	public void verifyPersonalInfoSaveSuccessMsg()
	{
		Assert.assertTrue(successMsg.isDisplayed(), "**[ASSERT FAILED]: Personal Info save success message is not displayed");
		logMessage("**[ASSERT PASSED]: Personal info save success message is displayed");
	}
}