@nams267 @sp9 @reg
  Feature: NAMS-267: Add Level 2 Control Enhancement
    @test26701
    Scenario Outline:NAMS-267: Add Level 2 Control Enhancement
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
      Then Click the button "Add CAF Controls" and Wait
      And clcik the Radio from table
      Given  wait for "3" seconds
      And I select "Selected Controls" table row
      And I select "Available Level 2 Risks" availabel data
      Then Click the button "Save" and Wait

      Examples:
        |Username|Password|
        |satheesh.kaliappan|Satheesh2|