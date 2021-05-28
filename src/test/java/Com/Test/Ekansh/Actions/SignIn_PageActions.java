package Com.Test.Ekansh.Actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Test.Ekansh.Runner.Initializer;

public class SignIn_PageActions extends Initializer
{
	
	public SignIn_PageActions() 
	{
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="a[class='login']")
	WebElement signInHomeBtn;
	
	@FindBy(css="input[id='email']")
	WebElement emailTextBox;
	
	@FindBy(css="input[id='passwd']")
	WebElement passwordTextBox;
	
	@FindBy(css="button[id='SubmitLogin']")
	WebElement signInBtn;
	
	public void clickSignInBtn()
	{
		signInHomeBtn.click();
		logMessage("Clicked on Sign In button");
	}
	
	
	public void enterCredentialsAndLogin(String username, String pwd)
	{
		emailTextBox.click();
		emailTextBox.clear();
		emailTextBox.sendKeys(username);
		logMessage("Username entered");
		passwordTextBox.click();
		passwordTextBox.clear();
		passwordTextBox.sendKeys(pwd);
		logMessage("Password entered");
		signInBtn.click();
		logMessage("Clicked on sign in button to login into the application");
	}
}
