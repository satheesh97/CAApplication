@nams181 @sp4 @reg
  Feature: NAMS-181: Automatically add Group Strategies from Intersections
    @test18101
    Scenario Outline:NAMS-181: Manage Key Dates
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
      Then Click the button "Manage Risk Assessment Intersections" and Wait
      And file the Risk level "3"
      And I filter the intersection field "05. Pension Risk"
      And I capture the "InterSection"
      Then Click the button "Save" and Wait
     
      Examples:
        |Username|Password|
        |AA_test1 |password@1|