@nams172 @sp5 @reg
  Feature: NAMS-172: Manage Audit Planning Memo Data
    @test17201
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
      And I Move to "Risks and Controls"
      And file the Risk level "2.5"
      Then Click the button "Save" and Wait
      And I click menu Button "Document & Stakeholder Comms"
      And I click the "Audit Planning Memorandum" and "Manage APM" menu
      And I fill the APM Managemnt Form
      And I click "Generate Print View" on "Audit Planning Memorandum"
      #And print the APM Page
      #And  I click Print button

      #And I click the "Manage APM" menu
      Examples:
        |Username|Password|
        |AA_test1 |password@1|