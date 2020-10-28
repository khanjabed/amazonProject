Feature: user able to login on amazon

Scenario: user able to login successfully on amazon 
Given user able to open browser
And user navigate to URL "https://www.amazon.com/" 
And able to click on sign btn
And user able to enter email "khanjabed@yahoo.com" 
And user able to click on continue
And user able to enter password "Queens2370$"
Then user able to click on signin btn
And user landed in home page and verify title
