@nams163 @sp3
  Feature: NAMS-163: Manage Audit Staffing
    @reg
    Scenario Outline: NAMS-163: Manage Audit Staffing
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
      Examples:
        | Username | Password |
        |AA_test1 |password@1|