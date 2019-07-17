

Feature: use the website to find restaurants 
Scenario: just eat website home page

Given user is already on just eat page
When title of login page is just eat
Then user enters <AR51 1AA>
Then user clicks on search button
Then user is on area page
Then Close the browser