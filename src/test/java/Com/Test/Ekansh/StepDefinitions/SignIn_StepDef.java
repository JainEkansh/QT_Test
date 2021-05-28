package Com.Test.Ekansh.StepDefinitions;

import Com.Test.Ekansh.Actions.SignIn_PageActions;
import Com.Test.Ekansh.Runner.Initializer;
import Com.Test.Ekansh.Utils.PropFileHandler;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SignIn_StepDef extends Initializer
{
	
	SignIn_PageActions signInPage=new SignIn_PageActions();
	
	@Given("Launch the application")
	public void launchApp()
	{
		launchApplication(PropFileHandler.readProperty("ApplicationUrl"));
	}
	
	
	@When("I click on sign in button")
	public void clickSignInBtn()
	{
		signInPage.clickSignInBtn();
	}
	
	
	@When("I enter username and password and login to application")
	public void enterCredentialsAndLogin()
	{
		signInPage.enterCredentialsAndLogin(PropFileHandler.readProperty("Username"), PropFileHandler.readProperty("Password"));
	}
}
