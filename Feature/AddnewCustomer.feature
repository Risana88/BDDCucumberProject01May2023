Feature:Customer

@smoke
Scenario Outline: Add New Customer
Given User Launch Chrome Browser
 When  User open url "https://admin-demo.nopcommerce.com/login"
 And  User enter Email as "<email>" and password as "<password>"
 And   User click on Login button
 Then  user can view Dashboard
 When user clicks on  customers menu
 And user clicks on  customers menu item
  And user clicks on new add button
  Then user can view add new customer page
  When user enter customer info as "<newEmail>" and "<newPass>" and "<fname>" and "<lname>" and "<gender>" and "<comName>" and "<AdminComment>"
  And user click on save button
  Then user can view confirmation msg "The new customer has been added successfully"
  And close browser
  
  Examples:
  |email|password|newEmail|newPass|fname|lname|gender|comName|AdminComment|
  |admin@yourstore.com|admin|risana88@gmail.com|12345|Risana|Jassim|female|ABC|Check|
   |admin@yourstore.com|admin|j.latheef@gmail.com|99845|Jassim|Latheef|male|AXYZ|Hub|
   |admin@yourstore.com|admin|alesha@gmail.com|889998|Alesha|Jassim|female|ghdgh|mol|
   |admin@yourstore.com|admin|risana88@gmail.com|895492|Ayrin|Jassim|female|jdghwjs|mol|