@nams174 @sp5 @reg
  Feature: NAMS-174: Manage Further Details
    @test17401
    Scenario Outline:NAMS-174: Manage Further Details
      Given I Enter the "<Username>" and "<Password>"
      And  wait for "2" seconds
      And I  click the menu "Audits"
      And Click the button "Create Audit"
      And I fill the Audit form Type "Regular Audit"
      Then Click the button "Submit" and Wait
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Further Details and Group Strategy"
      Then Click the button "Manage Further Details" and Wait
      And I click the label "Material Legal Entities"
      And I click the label "Regulatory Requirements"
      And I fill the "Material Legal Entities and Regulatory Requirements" section
      And I enter the Data on field "Material Legal Entities"
      And I enter the Data on field "Regulatory Requirements"
      And I click the label "Applications"
      And I click the label "Models"
      And I fill the "Applications and Models" section
      And I enter the Data on field "Applications"
      And I enter the Data on field "Models"
      And I click the label "External Third party Risks"
      And I click the label "Intra-Group Risks"
      And I fill the "External and Internal Third Parties" section
      And I enter the Data on field "Intra-Group Third Parties (Critical)"
      And I enter the Data on field "External Third Parties (Critical)"
      And I click the label "Change Programs"
      And I fill the "Change Programs" section
      And I fill the "Change Programs" table
      Then Click the button "Submit" and Wait

      Examples:
        |Username|Password|
        |AA_test1 |password@1|