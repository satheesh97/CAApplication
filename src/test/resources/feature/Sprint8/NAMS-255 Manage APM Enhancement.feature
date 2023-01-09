@nams255 @sp8 @reg
  Feature: NAMS-255: Manage APM Enhancement
    @test25501
    Scenario Outline: NAMS-255: Manage APM Enhancement
      Given I Enter the "<Username>" and "<Password>"
      And  wait for "2" seconds
      And I  click the menu "Audits"
      And Click the button "Create Audit"
      And I fill the Audit form Type "Regular Audit"
      And I fill the Date Field in Audidt Page
      Then Click the button "Submit" and Wait
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Risks and Controls"
      And file the Risk level "2.5"
      Then Click the button "Save" and Wait
      And I click menu Button "Document & Stakeholder Comms"
      And I click the "Audit Planning Memorandum" and "Manage APM" menu
      And I fill the APM Managemnt Form for validation
      And I click Radio option "Are Group Risk Themes relevant to this Audit?" As "Yes"
      And  wait for "10" seconds
     # And Verify the lnked text "Add Group Risk Theme" visible
      And I click Radio option "Are Group Risk Themes relevant to this Audit?" As "No"
      And  wait for "10" seconds
      And Verify the lnked text "Add Group Risk Theme" visible
      And I click Radio option "Add prior audit coverage?" As "Yes"
     # And Verify the lnked text "Add Another Prior Audit" visible
      And I click Radio option "Add prior audit coverage?" As "No"
      And  wait for "10" seconds
      And Verify the lnked text "Add Another Prior Audit" visible
      And  wait for "10" seconds
      Then Click the button "Cancel" and Wait
      Then Click the button "Continue" and Wait
      Examples:
        |Username|Password|
        |AA_test1 |password@1|