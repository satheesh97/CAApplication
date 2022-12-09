@nams204 @reg @sp5
  Feature: NAMS-204: Manage Audit Report Data
    @test20401
    Scenario Outline: NAMS-5: Collate Audit Planning Memo Data
      Given I Enter the "<Username>" and "<Password>"
      And  wait for "2" seconds
      And I  click the menu "Audits"
      And Click the button "Create Audit"
      And I fill the Audit form Without Key Date
      Then Click the button "Submit" and Wait
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Document & Stakeholder Comms"
      Then Click the button "Manage Audit Report Data" and Wait
      And  I update the Report Form
      Then Click the button "Submit" and Wait
      Examples:
        |Username|Password|
        |AA_test1 |password@1|