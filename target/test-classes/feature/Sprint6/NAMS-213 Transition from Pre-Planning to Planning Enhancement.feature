@nams213 @sp6 @reg
  Feature: NAMS-213: Transition from Pre-Planning to Planning Enhancement
    @test21301
    Scenario Outline: NAMS-213: Transition from Pre-Planning to Planning Enhancement
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
      And Click the button "Move to Fieldwork"
      Then Click the button "Transition Audit" and Wait
      And I click menu Button "Related Actions"
      And I capture the "Moved information under the RealtedAction"
      Then I click function "Move back to Planning"
      And Click the button "Transition Audit" and Wait
      And I click menu Button "Summary"

      Examples:
        |Username|Password|
        |AA_test1 |password@1|