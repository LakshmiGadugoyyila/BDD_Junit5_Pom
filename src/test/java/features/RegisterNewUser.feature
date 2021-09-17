Feature: Register new user


  Scenario:Verify register functionality with valid credentials
    Given i navigate to url "https://demo.nopcommerce.com/ "
    Then i should be navigate to homepage
    When i click on register link from the nav bar
    Then i should be navigate to register page
    When i select gender as female radio button
    And i enter <firstName lastName email password confirmpassword>
      | firstName | lastName | email           | password    | confirmpassword |
      | user1     | qa       | userqa1@nop.com | Testing@123 | Testing@123     |
      |user2      |qa        |userqa2@nop.com  |Testing@123  |Testing@123      |
      |user3      |qa        |userqa3@nop.com  |Testing@123  |Testing@123      |
      |user4      |qa        |user4@nop.com    |Testing@123  |Testing@123      |
    And i click on register button
    Then i should see message "your"
