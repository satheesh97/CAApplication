@nams140 @sp3
  Feature: NAMS-140: Audit Tollgates Tab
    Scenario Outline:NAMS-140: Audit Tollgates Tab
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Audits"
      And Click the button "Create Audit"
      And I fill the Audit form Type "Regular Audit"
      Then Click the button "Submit" and Wait
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Tollgates"
      And I  validate "tollgates"
      Then I click the "Planning" for "Add New Entry"
      And I  validate "Planning"
      And I capture the "Planning"
      And Click the button "Cancel" and Wait
      And Click the button "Continue" and Wait
      Then I click the "Reporting" for "Add New Entry"
      And I  validate "Reporting"
      And I capture the "Reporting"
      And Click the button "Cancel" and Wait
      And Click the button "Continue" and Wait
      Then I click the "Fieldwork" for "Add New Entry"
      And I  validate "Fieldwork"
      And I capture the "Fieldwork"
      And Click the button "Cancel" and Wait
      And Click the button "Continue" and Wait

      Examples:
        | Username | Password |
        |AA_test1 |password@1|