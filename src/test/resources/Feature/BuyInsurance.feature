Feature: Verify the new insurance is added successfully

  @New_Insurance
  Scenario Outline: Verify the New Insurance Funtionality
    Given User should launch web_API browser
    When User should write "<username>" and "<password>"
    And User should click the submit button
    Then User should select New Insurance
    And Fill the required details
    And Click on submit button

    Examples: 
      | username      | password |
      | test@test.com |12345|
