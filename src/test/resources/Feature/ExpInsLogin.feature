Feature: Verify the API page is logged in successfully

  @192.168.99.141:3000_login_logout
  Scenario Outline: Verify the Login and Logout Funtionality
    Given User should launch web_API browser
    When User should write "<username>" and "<password>"
    And User should click the submit button
    And User should logoff

    Examples: 
      | username      | password |
      |test@test.com|12345|
