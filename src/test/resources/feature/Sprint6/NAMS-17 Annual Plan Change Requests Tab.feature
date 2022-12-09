@nams17 @sp6 @reg
  Feature: NAMS-17: Annual Plan Change Requests Tab
    @test1701
    Scenario Outline: NAMS-17: Annual Plan Change Requests Tab
      Given I Enter the "<Username>" and "<Password>"
      And  wait for "2" seconds
      And I  click the menu "Audits"
      And Click the button "Create Audit"
      And I fill the Audit form
      Then Click the button "Submit" and Wait
      Examples:
        |Username|Password|
        |AA_test1 |password@1|

    Scenario Outline:NAMS-17: Annual Plan Change Requests Tab
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Summary"
      Then Click the button "Add to Annual Plan" and Wait
      And I click the Radio "2022"
      And Drop the Value "Audit added due to regulatory request" at "Change Request Reason"
      Then I fill TextArea "Justification"
      Then Click the button "Submit" and Wait
      

      Examples:
        |Username|Password|
        |satheesh.kaliappan|Satheesh1|