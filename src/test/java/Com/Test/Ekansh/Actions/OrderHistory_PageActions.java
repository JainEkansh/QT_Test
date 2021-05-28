package Com.Test.Ekansh.Actions;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Com.Test.Ekansh.Runner.Initializer;

public class OrderHistory_PageActions extends Initializer
{
	
	public OrderHistory_PageActions() 
	{
		super();
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(css="tr[class='first_item ']>td:nth-child(5)>span")
	WebElement orderStatus;
	
	public void verifyOrderStatusInOrderHistory(String expected)
	{
		Assert.assertTrue(orderStatus.getText().trim().equals(expected),"**[ASSERT FAILED]: Order status is not "+expected);
		logMessage("**[ASSERT PASSED]: Order status in order history is "+expected);
	}
}