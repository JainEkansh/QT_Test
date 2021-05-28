package Com.Test.Ekansh.StepDefinitions;

import Com.Test.Ekansh.Actions.MyAccount_PageActions;
import cucumber.api.java.en.When;

public class MyAccount_StepDef
{
	MyAccount_PageActions myAccPage=new MyAccount_PageActions();
	
	
	@When("I click on t-shirt tab")
	public void clickTshirtTab()
	{
		myAccPage.clickTshirtTab();
	}
	
	
	@When("I click on my personal information button")
	public void clickMyPersonalInfoBtn()
	{
		myAccPage.clickMyPersonalInfoBtn();
	}
}
