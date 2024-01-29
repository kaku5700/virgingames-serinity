@Regression
Feature: Verify Currency is GBP, EUR, and SEK

  As a User I Am Verifying Different Currency By Using End Point Bingo

  Scenario Outline: verify currency
    When User Send Get Request to Bingo Endpoint with currency as "<currency>"
    Then I verify currency is in "<currency>"
    Examples:
      | currency |
      | GBP      |
      | EUR      |
      | SEK      |

