@nams162 @sp4 @reg
  Feature: NAMS-162: Add Action to Low Risk Issue
    @Test1711221622
    Scenario Outline: NAMS-162: Add Action to Low Risk Issue
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
      And file the Risk level "1"
      Then Click the button "Save" and Wait
      And I file the Level two of risk
      And I file the Level three of risk
      And I  fill  the OT Form
      And I click menu Button "Exceptions"
      Then Click the button "Create Exception" and Wait
      Then I fill the create Exception Form
      And I move to "Issues" tab
      Then Click the button "Create Issue" and Wait
      And I fill the Create Issue Form
      Examples:
        |Username|Password|
        |AA_test1 |password@1|

