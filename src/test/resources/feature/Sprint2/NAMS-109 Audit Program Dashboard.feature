@nams109 @sp2 @reg
Feature: NAMS-109: Audit Program Dashboard
  @202211022
  Scenario Outline: NAMS-109: Audit Program Dashboard
    Given I Enter the "<Username>" and "<Password>"
    Given  wait for "2" seconds
    And I  click the menu "Home"
    Then I click submenu "My Audits"
    And I Search the Name under Audits
    And I Move to "Audit Program"
    And  I verify the Audit Program
    And I capture the "Audit Program"
    And  I clik and capture the "Menu Icon Audit Program"

    Examples:
      |Username|Password|
      |AA_test1 |password@1|