@nams171 @sp4 @reg
  Feature: NAMS-171: Manage Audit Scope
    @test1711
    Scenario Outline: NAMS-171: Manage Audit Scope
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
      Then Click the button "Manage Audit Scope" and Wait
      And I fill the "Audit Scope"
      Then Click the button "Submit" and Wait
      Then I capture the "Audit Scope"

      Examples:
        |Username|Password|
        |AA_test1 |password@1|