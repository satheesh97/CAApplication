@nams193 @sp6 @reg
Feature: NAMS-193: Upload Documents MRCC Indicators Enhancement
  @test1931
  Scenario Outline:NAMS-193: Upload Documents MRCC Indicators Enhancement
    Given I Enter the "<Username>" and "<Password>"
    Given  wait for "2" seconds
    And I  click the menu "Audits"
    And Click the button "Create Audit"
    And I fill the Audit form Without Key Date
    Then Click the button "Submit" and Wait
    And I  click the menu "Home"
    Then I click submenu "My Audits"
    And I Search the Name
    And I Move to "Summary"
    And Click the button "Move to Pre-Planning"
    Then Click the button "Transition Audit" and Wait
    And Click the button "Move to Planning"
    Then Click the button "Transition Audit" and Wait
    And I click menu Button "Budget and Staffing"
    Then Click the button "Manage Audit Staff" and Wait
    And I file the audit lead
    Then Click the button "Save" and Wait
    And I click menu Button "MRCC Reviews"
    Then I click Table "MRCC"
    Then Click the button "Manage MRCC Indicators" and Wait
    And I Select Indicator in MRCC
    Then Click the button "Save" and Wait
    And I upload the "Manage Documents" in Indicators


    Examples:
      | Username | Password |
      |AA_test1 |password@1|

