Feature: Order T-Shirt

@OrderTShirt
Scenario: Launch and login into application
Given Launch the application
When I click on sign in button
And I enter username and password and login to application

@OrderTShirt
Scenario: User should be able to order a tshirt
When I click on t-shirt tab
And Click add to cart button
And Click on proceed to checkout button
When I walk through the checkout process

@OrderTShirt
Scenario: Verify order has been placed in order history
When I click on back to orders link
Then I verify if order status in order history is On backorder