package Com.Test.Ekansh.StepDefinitions;

import Com.Test.Ekansh.Actions.PersonalInformation_PageActions;
import Com.Test.Ekansh.Utils.PropFileHandler;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PersonalInformation_StepDef
{
	PersonalInformation_PageActions personalInfoPage=new PersonalInformation_PageActions();
	
	
	@When("I enter first name (.*)")
	public void enterFirstName(String expected)
	{
		personalInfoPage.enterFirstName(expected);
	}
	
	
	@When("I enter current password")
	public void enterCurrentPassword()
	{
		personalInfoPage.enterCurrentPassword(PropFileHandler.readProperty("Password"));
	}
	
	
	@When("I click on save button")
	public void clickSaveBtn()
	{
		personalInfoPage.clickSaveBtn();
	}
	
	
	@Then("Verify personal info save success message is displayed")
	public void verifyPersonalInfoSaveSuccessMsg()
	{
		personalInfoPage.verifyPersonalInfoSaveSuccessMsg();
	}
}