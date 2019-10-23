Feature: OrangeHRM Login

  Scenario: Logo presence on OrangeHRM home Page
    Given I launch chrome browser
    When I open orange hrm homepage
    Then I verify the the logo present on page
    And close browser