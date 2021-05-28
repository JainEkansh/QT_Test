package Com.Test.Ekansh.Actions;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Com.Test.Ekansh.Runner.Initializer;

public class Catalogue_PageActions extends Initializer
{
	
	public Catalogue_PageActions() 
	{
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="img[title='Faded Short Sleeve T-shirts']")
	WebElement tShirtImage;
	
	@FindBy(css="a[title='Add to cart']>span")
	WebElement addToCartBtn;
	
	@FindBy(css="a[title='Proceed to checkout']")
	WebElement proceedToCheckoutBtn;
	
	
	public void clickAddToCartBtn()
	{
		mouseHover(tShirtImage);
		waitForElementToBeVisible(addToCartBtn);
		addToCartBtn.click();
		logMessage("Clicked on add to cart button");
	}
	
	
	public void clickProceedToCheckoutBtn()
	{
		proceedToCheckoutBtn.click();
		logMessage("Clicked on proceed to checkout button");
	}
}
