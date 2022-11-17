@nams165 @sp3
  Feature: NAMS-165: Attached Documents Tab
    @reg
    Scenario Outline: NAMS-158: Move Audit Phase to Fieldwork
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Audits"
      And Click the button "Create Audit"
      And I fill the Audit form Without Key Date
      Then Click the button "Submit" and Wait
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Document & Stakeholder Comms"
      And I capture the "Document & Stakeholder Comms"
      Examples:
        |Username|Password|
        |AA_test1 |password@1|