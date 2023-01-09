@nams6 @sp7 @reg
  Feature: NAMS-6: Audit Walkthrough Documents
    @test0601
    Scenario Outline:NAMS-6: Audit Walkthrough Documents
      Given I Enter the "<Username>" and "<Password>"
      And  wait for "2" seconds
      And I  click the menu "Audits"
      And Click the button "Create Audit"
      And I fill the Audit form Type "Regular Audit"
      Then Click the button "Submit" and Wait
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Summary"
      And I click menu Button "Risks and Controls"
      And I click text "Walkthrough Documentation"
      Then Click the button "Manage Documents" and Wait
      And I upload the File
      Then Click the button "Confirm" and Wait
      And I Click the "Reminder" to "Confirm"


      Examples:
        |Username|Password|
        |AA_test1 |password@1|