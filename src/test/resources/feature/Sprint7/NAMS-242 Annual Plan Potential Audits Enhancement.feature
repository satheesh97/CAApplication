@nams242 @sp7 @reg
  Feature: NAMS-242: Annual Plan Potential Audits Enhancement
    @test242001
    Scenario Outline:NAMS-242: Annual Plan Potential Audits Enhancement
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
      And I click menu Button "Summary"
      And I click menu Button "Further Details and Group Strategy"
      Then Click the button "Manage Further Details" and Wait
      And I click the label "Material Legal Entities"
      And I click the label "Regulatory Requirements"
      And I fill the "Material Legal Entities and Regulatory Requirements" section
      And I enter the Data on field "Material Legal Entities"
      And I enter the Data on field "Regulatory Requirements"
      Then Click the button "Submit" and Wait
      And I click menu Button "Summary"
      Then Click the button "Add to Annual Plan" and Wait
      And I click the Radio on user label
      And Drop the Value "Audit added due to regulatory request" at "Change Request Reason"
      Then I fill TextArea "Justification"
      Then Click the button "Submit" and Wait
      And I  click the menu "Annual Plan"
      And I search Annual Plan year
      And I click menu Button "Change Requests"
      Then Click the button "Review Change Requests" and Wait
      And I click the Radio "Approved"
      And I fill TextArea "Rationale"
      And  wait for "4" seconds
      Then Click the button "Submit" and Wait
      And I click menu Button "Summary"
      And I Search the Name
      And I Move to "Summary"
      And I capture the "Annual Plan Year"      
      Examples:
        |Username|Password|
        |AA_test1 |password@1|