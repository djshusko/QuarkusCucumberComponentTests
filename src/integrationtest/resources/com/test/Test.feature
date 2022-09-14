Feature: Test

  Scenario: ToUpper
    When I pass the values to the toUpper method
      | test |
      | Test |
      | TEST |
    Then the values are converted to upper case