@nams61 @sp2 @reg
Feature: NAMS-61: Issue Actions Tab
  @202211021
  Scenario Outline: NNAMS-61: Issue Actions Tab
    Given I Enter the "<Username>" and "<Password>"
    Given  wait for "2" seconds
    And I  click the menu "Home"
    Then I click submenu "My Audits"
    And I Search the Name under Audits
    And I Move to "Issues"
    And I click the view Action
    Then Click the button "Create Action" and Wait
    And I verify the  Action Form
    And I capture the "Action"

    Examples:
      |Username|Password|
      |AA_test1 |password@1|