package Com.Test.Ekansh.Actions;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Com.Test.Ekansh.Runner.Initializer;

public class Checkout_PageActions extends Initializer
{
	
	public Checkout_PageActions() 
	{
		super();
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(css="h1[class='page-heading']")
	WebElement checkoutPageHeading;
	
	@FindBy(css="input[type='checkbox']")
	WebElement termAndConditionCheckbox;
	
	@FindBy(css="a[title='Pay by check.']")
	WebElement payByCheck;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement confirmMyOrderBtn;
	
	@FindBy(css="a[title='Back to orders']")
	WebElement backToOrdersLink;
	
	@FindBy(css="a[class='button btn btn-default standard-checkout button-medium']")
	WebElement proceedToCheckoutBtnShoppingCartSummary;
	
	@FindBy(css="button[name='processAddress']")
	WebElement proceedToCheckoutAddress;
	
	@FindBy(css="button[name='processCarrier']")
	WebElement proceedToCheckoutShipping;
	
	
	public void checkoutPageHeading(String expected)
	{
		waitForElementToBeVisible(checkoutPageHeading);
		Assert.assertTrue(checkoutPageHeading.getText().trim().contains(expected), "**[ASSERT FAILED]: Checkout page heading is not "+expected);
		logMessage("**[ASSERT PASSED]: Checkout page heading is "+expected);
	}
	
	
	public void selectTermsAndConditionsCheckbox()
	{
		termAndConditionCheckbox.click();
		logMessage("Selected terms and conditions checkbox");
	}
	
	
	public void clickPayByCheckOption()
	{
		payByCheck.click();
		logMessage("Clicked on pay by check option");
	}
	
	
	public void clickConfirmMyOrderBtn()
	{
		confirmMyOrderBtn.click();
		logMessage("Clicked confirm my order button");
	}
	
	
	public void clickBackToOrdersLink()
	{
		backToOrdersLink.click();
		logMessage("Clicked on back to orders link");
	}
	
	
	public void clickProceedToCheckout()
	{
		proceedToCheckoutBtnShoppingCartSummary.click();
		logMessage("Clicked on proceed to checkout button");
	}
	
	
	public void clickProceedToCheckoutAfterAddress()
	{
		proceedToCheckoutAddress.click();
		logMessage("Clicked on proceed to checkout button after address");
	}
	
	
	public void clickProceedToCheckoutAfterShipping()
	{
		proceedToCheckoutShipping.click();
		logMessage("Clicked on proceed to checkout button after shipping");
	}
}
