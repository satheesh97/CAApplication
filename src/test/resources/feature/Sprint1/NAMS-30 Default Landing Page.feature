@nams30
Feature: NAMS-30
  @test1 @reg @sp1
  Scenario Outline: Nams30 crate Level of rsik
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
    And I validate the Auditpage


    Examples:
      |Username|Password|
      |satheesh.kaliappan|Satheesh1|


@test2 @reg @sp1
  Scenario Outline: uservalidate
    Given I Enter the "<Username>" and "<Password>"
    And I  click the menu "Home"
    Then I click submenu "My Audits"
    And I Search the Name
    And I validate the Auditpage

    Examples:
      |Username|Password|
      |satheesh.kaliappan|Satheesh1|
