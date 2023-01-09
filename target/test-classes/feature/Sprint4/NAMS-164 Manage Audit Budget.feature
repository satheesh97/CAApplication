@nams164  @reg
  Feature: NAMS-164: Manage Audit Budget
    @test1641
    Scenario Outline: NAMS-164: Add Action to Low Risk Issue
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Audits"
      And Click the button "Create Audit"
      And I fill the Audit form
      Then Click the button "Submit" and Wait
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Summary"
      Then Click the button "Manage Audit Budget" and Wait
      And I fill the "Pre-planning" Phase
      Given  wait for "2" seconds
      And I fill the "Planning" Phase
      Given  wait for "2" seconds
      And I fill the "Fieldwork" Phase
      Given  wait for "2" seconds
      And I fill the "Clearance and Reporting" Phase
      Given  wait for "2" seconds
      Then Click the button "Submit" and Wait
      Then Click the button "Manage Audit Budget" and Wait

      Examples:
        |Username|Password|
        |AA_test1 |password@1|
