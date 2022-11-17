@nams74 @sp4 @reg
  Feature: NAMS-74: Manage Fieldwork Tollgate

    @test1711221
    Scenario Outline: NAMS-74: Manage Fieldwork Tollgate
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Audits"
      And Click the button "Create Audit"
      And I fill the Audit form Without Key Date
      Then Click the button "Submit" and Wait
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Move to "Summary"

  Examples:
      Examples:
        | Username | Password |
        |AA_test1 |password@1|