@nams8
  Feature: NAMS-8: Manage Planning Tollgate
    @sp3 @reg
      Scenario Outline:NAMS-8: Manage Planning Tollgate
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Audits"
      And Click the button "Create Audit"
      And I fill the Audit form Without Key Date
      Then Click the button "Submit" and Wait
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Tollgates"
      Then Click the button "Add New Entry" and Wait
      And  I fill the tollgate entry
      And Click the button "Save" and Wait
      Then I click the "Planning" for "Add New Entry"
      And  I fill the tollgate entry
      And Click the button "Save" and Wait


      Examples:
        | Username | Password |
        |AA_test1 |password@1|