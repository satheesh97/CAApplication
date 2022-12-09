@nams184 @sp51 @reg
  Feature: NAMS-184: Compile Audit Distribution Lists
    @test18401
    Scenario Outline: NAMS-184: Compile Audit Distribution Lists
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
      #And I click menu Button "Document & Stakeholder Comms"
      Then Click the button "Manage Distribution List" and Wait
      And I fill the employee Details
      Then Click the button "Confirm" and Wait
      And I click menu Button "Further Details and Group Strategy"
      Then Click the button "Manage Further Details" and Wait
      And I click the label "Material Legal Entities"
      And I fill the "Material Legal Entities and Regulatory Requirements" section
      And I enter the Data on field "Material Legal Entities"
      Then Click the button "Submit" and Wait
      Examples:
        |Username|Password|
        |AA_test1 |password@1|