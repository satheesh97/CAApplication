@nams59 @sp2 @reg
  Feature: NAMS-59: Create/Edit Action
    @202211011
    Scenario Outline: NNAMS-59: Create/Edit Action
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name under Audits
      And I Move to "Issues"
      And I click the view Action
      Then Click the button "Create Action" and Wait
      And I fill the Create Action Form

      Examples:
        |Username|Password|
        |AA_test1 |password@1|