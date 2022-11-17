@nams39
Feature: NAMS-39
  @test4 @reg @sp1
  Scenario Outline: Nams39 Proposed Audit Summery
    Given I Enter the "<Username>" and "<Password>"
    Given  wait for "2" seconds
    And I  click the menu "Audits"
    And Click the button "Create Audit"
    And I fill the Audit form
    Then Click the button "Submit" and Wait
    Given  wait for "4" seconds
    And I  click the menu "Home"
    Then I click submenu "My Audits"
    And I Search the Name
    And I validate the "Summary"
    And  I capture the "Summary"


    Examples:
      |Username|Password|
      |satheesh.kaliappan|Satheesh1|
    
  @test3 @reg
  Scenario Outline: Nams39 Summery Validation
    Given I Enter the "<Username>" and "<Password>"
    And I  click the menu "Home"
    Then I click submenu "My Audits"
    And I Search the Name
    And I validate the Audit

    Examples:
      |Username|Password|
      |satheesh.kaliappan|Satheesh1|
