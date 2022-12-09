@nams76 @sp4 @reg
  Feature: NAMS-76: Manage Reporting Tollgate
    @test7601
   Scenario Outline: NAMS-76: Manage Reporting Tollgate
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
      And I click menu Button "Tollgates"
      Then I click the "Reporting" for "Add New Entry"
      And  I fill the tollgate entry
      And Click the button "Save" and Wait
      Examples:
        | Username | Password |
        |AA_test1 |password@1|