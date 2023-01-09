@nams206 @reg @sp6
  Feature: NAMS-206: Audit Document Storage Enhancement
    @test20601
    Scenario Outline: NAMS-206: Audit Document Storage Enhancement
      Given I Enter the "<Username>" and "<Password>"
      And  wait for "2" seconds
      And I  click the menu "Audits"
      And Click the button "Create Audit"
      And I fill the Audit form Without Key Date
      Then Click the button "Submit" and Wait
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Related Actions"
      And click sheet "Manage Documents"
      And I upload the File
      Then Click the button "Confirm" and Wait
      And I Click the "Reminder" to "Confirm"

      Examples:
        |Username|Password|
        |AA_test1 |password@1|