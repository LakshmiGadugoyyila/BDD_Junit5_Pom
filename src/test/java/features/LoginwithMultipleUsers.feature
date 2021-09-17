Feature: Login to nop commerce
  In order to login to nop commerce
  As a user
  I should provide email and password

  Scenario Outline:Verify login functionality with valid credentials
    Given i navigate to url "https://demo.nopcommerce.com/ "
    Then i should be navigate to homepage
    When i click on login link from the nav bar
    Then i should be navigate to login page
    When i enter email as "<email>"
    And  i enter password as "<password>"
    And  i click on login button
    Then i should be logged in successfully
    Examples:
      | email           | password    |
      | userqa1@nop.com | Testing@123 |
      | userqa2@nop.com | Testing@123 |
      | userqa3@nop.com | Testing@123 |
