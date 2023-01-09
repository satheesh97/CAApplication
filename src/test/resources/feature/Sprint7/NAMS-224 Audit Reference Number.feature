@nams224 @sp7 @reg
  Feature: NAMS-224: Audit Reference Number
    @test22401
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
      Then Click the button "Add to Annual Plan" and Wait
      And I click the Radio on user label
      And Drop the Value "Audit added due to regulatory request" at "Change Request Reason"
      Then I fill TextArea "Justification"
      Then Click the button "Submit" and Wait
      And I  click the menu "Annual Plan"
      And I search Annual Plan year
      And I click menu Button "Change Requests"
      Then Click the button "Review Change Requests" and Wait
      And I click the Radio "Approved"
      And I fill TextArea "Rationale"
      And  wait for "4" seconds
      Then Click the button "Submit" and Wait
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Summary"
      And I Validate the Audit Name
      Examples:
        |Username|Password|
        |AA_test1 |password@1|