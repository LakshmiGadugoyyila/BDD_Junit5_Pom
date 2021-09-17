Feature: click on community pool and vote

  Scenario: verify and print error message when non registered users votes on Community Poll
    Given user navigate to url "https://demo.nopcommerce.com/"
    Then User should be navigate Homepage
    When User click any radio button under Community Poll
    And User clicks on Vote button
    Then user should see the error message
    Then Print the error message to console




