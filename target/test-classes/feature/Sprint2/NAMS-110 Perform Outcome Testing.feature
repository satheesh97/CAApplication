@nams110 @reg @sp2
  Feature: NAMS-110: Perform Outcome Testing
@test202211023
Scenario Outline: NAMS-110: Perform Outcome Testing
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
  And I  fill  the OT Form with exception

  Examples:
    |Username|Password|
    |AA_test1 |password@1|