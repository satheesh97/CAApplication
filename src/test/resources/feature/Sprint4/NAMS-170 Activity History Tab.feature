@nams170 @sp4 @reg
  Feature: NAMS-170: Activity History Tab
    @test1701
    Scenario Outline: NAMS-170:: Manage Group Strategies
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Audits"
      And Click the button "Create Audit"
      And I fill the Audit form Without Key Date
      Then Click the button "Submit" and Wait
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Activity History"
      And I Verify Activity History
      And I capture the "Activity History"
      Examples:
        |Username|Password|
        |AA_test1 |password@1|

