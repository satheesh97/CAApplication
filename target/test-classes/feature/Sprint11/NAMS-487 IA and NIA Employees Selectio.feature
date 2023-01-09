@nams487 @sp11 @reg
  Feature: NAMS-487: Internal Audit and Non-Internal Audit Employees Selection Enhancement
    @test4871
Scenario Outline: Internal Audit and Non-Internal Audit Employees Selection Enhancement
      Given I Enter the "<Username>" and "<Password>"
      And  wait for "2" seconds
      And I  click the menu "Audits"
      And Click the button "Create Audit"
      And I fill the Audit form Type "Regular Audit"
      And I fill the Date Field in Audidt Page
      Then Click the button "Submit" and Wait
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Budget and Staffing"
      Then Click the button "Manage Audit Staff" and Wait
      And I file the audit lead
      Then Click the button "Save" and Wait
      And I click menu Button "Tollgates"
      Then I click the "Planning" for "Add New Entry"
      And  I fill the tollgate entry
      And Click the button "Save" and Wait
      Then I click the "Reporting" for "Add New Entry"
      And  I fill the tollgate entry
      And Click the button "Save" and Wait
      Then I click the "Fieldwork" for "Add New Entry"
      And  I fill the tollgate entry
      And Click the button "Save" and Wait

      Examples:
        |Username|Password|
        |satheesh.kaliappan|Satheesh2|