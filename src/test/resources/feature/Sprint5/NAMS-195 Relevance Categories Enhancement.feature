@nams195 @sp51 @reg
  Feature: NAMS-195: Relevance Categories Enhancement
    @Test19501
    Scenario Outline: NAMS-195: Relevance Categories Enhancement
      Given I Enter the "<Username>" and "<Password>"
      And  wait for "2" seconds
      And I  click the menu "Audits"
      And Click the button "Create Audit"
      And I fill the Audit form Without Key Date
      Then Click the button "Submit" and Wait
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Summary"
      Then Click the button "Manage Audit Details" and Wait
      Then I populate Multidropdown "Relevance Category" Field
      Then I fill TextArea "Objective"
      Then Click the button "Submit" and Wait
      Examples:
        |Username|Password|
        |AA_test1 |password@1|