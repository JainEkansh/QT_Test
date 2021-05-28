package Com.Test.Ekansh.StepDefinitions;

import Com.Test.Ekansh.Actions.Catalogue_PageActions;
import Com.Test.Ekansh.Actions.Checkout_PageActions;
import cucumber.api.java.en.When;

public class Checkout_StepDef
{
	Checkout_PageActions checkoutPage=new Checkout_PageActions();
	Catalogue_PageActions cataloguePage=new Catalogue_PageActions();
	
	@When("I walk through the checkout process")
	public void checkoutCart()
	{
		checkoutPage.checkoutPageHeading("SHOPPING-CART SUMMARY");
		checkoutPage.clickProceedToCheckout();
		checkoutPage.checkoutPageHeading("ADDRESSES");
		checkoutPage.clickProceedToCheckoutAfterAddress();
		checkoutPage.checkoutPageHeading("SHIPPING");
		checkoutPage.selectTermsAndConditionsCheckbox();
		checkoutPage.clickProceedToCheckoutAfterShipping();
		checkoutPage.checkoutPageHeading("PLEASE CHOOSE YOUR PAYMENT METHOD");
		checkoutPage.clickPayByCheckOption();
		checkoutPage.checkoutPageHeading("ORDER SUMMARY");
		checkoutPage.clickConfirmMyOrderBtn();
	}
	
	
	@When("I click on back to orders link")
	public void clickBackToOrdersLink()
	{
		checkoutPage.clickBackToOrdersLink();
	}
}
