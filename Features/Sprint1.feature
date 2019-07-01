Feature: Registration Module
	In order to Register a new user
	I want to naigate to register module
	
@Chrome
Scenario: New User Registration
    Given Launch the "chrome" browser
    |https://demo.nopcommerce.com|
    Then click on the "register" link
    Then verify the home is displayed
    And Fill the mandatory details as below
    
    
    
@FireFox    
Scenario: User Details modification
    Given Launch the "ff" browser
    |https://demo.nopcommerce.com|
    Then click on the "login" link
    Then verify the home is displayed
    And modify the details
    Then Verify that details are updated sucessfully