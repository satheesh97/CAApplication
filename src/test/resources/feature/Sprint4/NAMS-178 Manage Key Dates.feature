@nams178 @sp4 @reg
  Feature: NAMS-178: Manage Key Dates
    @test17801
    Scenario Outline:NAMS-178: Manage Key Dates
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Audits"
      And Click the button "Create Audit"
      And I fill the Audit form Without Key Date
      Then Click the button "Submit" and Wait
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Summary"
      Then Click the button "Manage Audit Details" and Wait
      And  I fill the Date Field in Audidt Page
      Then Click the button "Submit" and Wait

      Examples:
        |Username|Password|
        |AA_test1 |password@1|