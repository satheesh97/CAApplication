@nams237 @sp7 @reg
  Feature: NAMS-237: Group Strategies Fieldwork Enhancement
    @test23701
    Scenario Outline: NAMS-168: Manage Group Strategies
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Audits"
      And Click the button "Create Audit"
      And I fill the Audit form Without Key Date
      Then Click the button "Submit" and Wait
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Further Details and Group Strategy"
      Then Click the button "Manage Group Strategy" and Wait
      And I manage the GroupStratgy
     Then Click the button "Save" and Wait
      Examples:
        |Username|Password|
        |AA_test1 |password@1|