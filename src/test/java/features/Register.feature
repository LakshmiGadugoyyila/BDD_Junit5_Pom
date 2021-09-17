Feature: Register new User

  Scenario:Verify register functionality with valid credentials
    Given i navigate to url "https://demo.nopcommerce.com/ "
    Then i should be navigate to homepage
    When i click on register link from the nav bar
    Then i should be navigate to register page


