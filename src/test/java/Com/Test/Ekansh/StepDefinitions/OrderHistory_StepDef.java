package Com.Test.Ekansh.StepDefinitions;

import Com.Test.Ekansh.Actions.OrderHistory_PageActions;
import cucumber.api.java.en.Then;

public class OrderHistory_StepDef
{
	OrderHistory_PageActions orderHistoryPage=new OrderHistory_PageActions();
	
	@Then("I verify if order status in order history is (.*)")
	public void verifyOrderStatusInOrderHistory(String expected)
	{
		orderHistoryPage.verifyOrderStatusInOrderHistory(expected);
	}
}