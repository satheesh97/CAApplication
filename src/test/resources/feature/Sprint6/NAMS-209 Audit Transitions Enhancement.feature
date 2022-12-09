@nams209 @sp6 @reg
  Feature: NAMS-209: Audit Transitions Enhancement
    @test20901
    Scenario Outline: NAMS-209: Audit Transitions Enhancement
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
      And I click the "Audit Announcement Memorandum" and "Manage AAM Distribution List" menu
      Then Click the button "Confirm" and Wait
      And I click menu Button "Summary"
      And Click the button "Move to Pre-Planning"
      Then Click the button "Transition Audit" and Wait
      And Click the button "Move to Planning"
      Then Click the button "Transition Audit" and Wait

      Examples:
        |Username|Password|
        |AA_test1 |password@1|

    @test20902
    Scenario Outline: NAMS-209: Audit Transitions Enhancement APM
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

    @test20903
    Scenario Outline:NAMS-209: Audit Transitions Enhancement  AAM
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Document & Stakeholder Comms"
      And I click the "Audit Announcement Memorandum" and "Publish AAM" menu
      Then Click the button "Confirm" and Wait
      And I fill the Date Field in Audidt Page
      Then Click the button "Submit" and Wait
      And I upload the File
      Then Click the button "Proceed to publish" and Wait
      Then Click the button "Email distribution list" and Wait
      Then Click the button "OK" and Wait

      Examples:
        |Username|Password|
        |satheesh.kaliappan|Satheesh1|