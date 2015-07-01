Feature: Login1 checkout

  @PBSLogin
  Scenario: User should be able to log-in
    Given I am on Product builder log-in screen
    When Enter valid credential
      | Fields   | value            |
      | username | ikumar           |
      | password | V2VzdGVybkAwMDg= |
    And Click on login button
    Then User is logged in successfully "Cengage Tools"
