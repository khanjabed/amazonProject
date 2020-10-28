Feature: user able to select desire product

Scenario: 

Given user able to open browser
And user navigate to URL "https://www.amazon.com/" 
And user able to click on todays deal
And user able to click on electronics
When user able to select the 7th product
And user able to click on add to cart
Then user able to click on proceed to checkout
And user able to verify page title

