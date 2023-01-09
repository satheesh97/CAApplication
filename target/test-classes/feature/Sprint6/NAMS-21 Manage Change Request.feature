@nams21 @sp6 @reg
Feature:NAMS-21: Manage Change Request
  @test2101
  Scenario Outline: NAMS-21: Manage Change Request
    Given I Enter the "<Username>" and "<Password>"
    Given  wait for "2" seconds
    And I  click the menu "Home"
    Then I click submenu "My Audits"
    And I Search the "AU-" with
    And I select "Audit Phase" with value "Fieldwork"
    Given  wait for "4" seconds
    And I select "Type" with value "Regular Audit"
    Given  wait for "4" seconds
    And I Move to "Summary"
    Then Click the button "Remove from Annual Plan" and Wait
    And Drop the Value "Removed from Plan due to COVID-19" at "Change Request Reason"
    Then I fill TextArea "Justification"
    Then Click the button "Submit" and Wait
    Then Click the button "Manage Removal Change Request" and Wait
    Then Click the button "Deactivate" and Wait

    Examples:
      |Username|Password|
      |AA_test1 |password@1|