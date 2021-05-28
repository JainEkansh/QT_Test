package Com.Test.Ekansh.StepDefinitions;

import Com.Test.Ekansh.Actions.Catalogue_PageActions;
import cucumber.api.java.en.When;

public class Catalogue_StepDef
{
	Catalogue_PageActions cataloguePage=new Catalogue_PageActions();
	
	
	@When("Click add to cart button")
	public void clickAddToCartBtn()
	{
		cataloguePage.clickAddToCartBtn();
	}
	
	
	@When("Click on proceed to checkout button")
	public void clickProceedToCheckoutBtn()
	{
		cataloguePage.clickProceedToCheckoutBtn();
	}
}
