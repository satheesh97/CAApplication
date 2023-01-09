@nams190 @sp6 @reg
  Feature: NAMS-190: Publish APM
    @test19001
    Scenario Outline: NAMS-190: Publish APM
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

      Examples:
        |Username|Password|
        |AA_test1 |password@1|

    @test19002
    Scenario Outline: NAMS-190: Publish APM manger User
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Document & Stakeholder Comms"
      And I click the "Audit Planning Memorandum" and "Publish APM" menu
      And I upload the File
      Then Click the button "Confirm" and Wait
      And I Click the "Reminder" to "Confirm"

      Examples:
        |Username|Password|
        |satheesh.kaliappan|Satheesh1|

    Scenario Outline:NAMS-190: Publish APM
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Document & Stakeholder Comms"
      And I capture the "APM published info"
      Examples:
        |Username|Password|
        |AA_test1 |password@1|