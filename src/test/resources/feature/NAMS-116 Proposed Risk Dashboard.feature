@nams116
Feature:NAMS-116: Proposed Risk Dashboard

  @test9 @local1 @reg
  Scenario Outline: NAMS-116: Proposed Risk Dashboard
    Given I Enter the "<Username>" and "<Password>"
    Given  wait for "2" seconds
    And I  click the menu "Audits"
    And Click the button "Create Audit"
    And I fill the Audit form
    Then Click the button "Submit" and Wait
    And I  click the menu "Home"
    Then I click submenu "My Audits"
    And I Search the Name
    And I Move to "Risks and Controls"
    And I click Evidenc of "Risk and Color"
    And  I Validate the image color for Risk Dashboard
    Examples:
      |Username|Password|
      |satheesh.kaliappan|Satheesh1|

  @demo
  Scenario Outline: NAMS-116: Proposed Risk Dashboard
    Given I Enter the "<Username>" and "<Password>"
    Given  wait for "2" seconds
    And I  click the menu "Home"
    Then I click submenu "My Audits"
    And I Search the "Test022022101410" with
    And I Move to "Risks and Controls"
    And I click Evidenc of "Risk and Color"
    And  I Validate the image color for Risk Dashboard


    Examples:
      |Username|Password|
      |satheesh.kaliappan|Satheesh1|