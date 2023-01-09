@nams377 @sp9 @reg
  Feature: NAMS-377: Remove Level 3 Risk (Basic Functionality)

    Scenario Outline: NAMS-377: Remove Level 3 Risk (Basic Functionality)
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Audits"
      And Click the button "Create Audit"
      And I fill the Audit form
      Then Click the button "Submit" and Wait
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Risks and Controls"
      And file the Risk level "2.5"
      Then Click the button "Save" and Wait
      And I file the Level two of risk
      And I file the Level three of risk
      And I  fill  the OT Form
      Then Click the button "Remove Level 3 Risk" and Wait
      Then I fill TextArea "Rationale for removal"
      Then button click for "Remove"
      Then Click the button "Confirm" and Wait
      Examples:
        |Username|Password|
        |AA_test1 |password@1|