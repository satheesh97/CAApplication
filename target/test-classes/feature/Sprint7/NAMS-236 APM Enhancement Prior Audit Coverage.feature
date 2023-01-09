@nams236 @sp7 @reg
  Feature: NAMS-236: APM Enhancement Prior Audit Coverage
    @test23601
    Scenario Outline: NAMS-236: APM Enhancement Prior Audit Coverage
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
      And I fill the APM Managemnt Form with Audit coverage
      And I  click label "Add Another Prior Audit"
      And I give input to "Report Reference Number" value "CS-2020-12"
      And Drop the Value "Regular Audit" at "Prior Audit Type"
      And dropdown the question "Prior Report Rating" value "A1"
      And wait for "2" seconds
      And I  click label "Add Another Prior Audit"
      And I give input to "Report Reference Number" value "CS-2020-13"
      And Drop the Value "Regular Audit" at "Prior Audit Type"
      And dropdown the question "Prior Report Rating" value "B2"
      And wait for "2" seconds
      And I  click label "Add Another Prior Audit"
      And I give input to "Report Reference Number" value "CS-2020-13"
      And Drop the Value "Change Audit" at "Prior Audit Type"
      And dropdown the question "Prior Report Rating" value "Medium-Low"
      And wait for "2" seconds
      And I  click label "Add Another Prior Audit"
      And I give input to "Report Reference Number" value "CS-2020-13"
      And Drop the Value "Change Audit" at "Prior Audit Type"
      And dropdown the question "Prior Report Rating" value "High"
      And wait for "2" seconds
      Then Click the button "Save" and Wait
      And I Click the "Reminder" to "Save"

      Examples:
        |Username|Password|
        |AA_test1 |password@1|

