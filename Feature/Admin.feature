Feature:Admin

@smoke
Scenario: Login with valid Credential
Given User Launch Chrome Browser
 When  User open url "https://admin-demo.nopcommerce.com/login"
 And  User enter Email as "admin@yourstore.com" and password as "admin"  
 And   User click on Login button
 Then  close browser
 
 @sanity
 Scenario Outline: Login Data Driven
	 Given User Launch Chrome Browser
	 When  User open url "https://admin-demo.nopcommerce.com/login"
	 And  User enter Email as "<Email>" and password as "<Password>"
	 And   User click on Login button
	 Then  close browser
	 Examples:
	 |Email                          |Password    |
	 |admin@yourstore.com            |admin       |
	 |admin@yourstore.com            |admin12     |
	 

 