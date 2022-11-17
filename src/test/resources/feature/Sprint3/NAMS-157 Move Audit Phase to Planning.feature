@nams157 @sp3
  Feature: NAMS-157 Move Audit Phase to Planning
    @reg
    Scenario Outline: NAMS-157 Move Audit Phase to Planning
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

      Examples:
        |Username|Password|
        |AA_test1 |password@1|
