@nams205 @sp6 @reg
Feature: NAMS-205: Non-MICOS Issue Enhancement
  @test20501
  Scenario Outline:NAMS-205: Non-MICOS Issue Enhancement audit form
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
    And file the Risk level "2.5"
    Then Click the button "Save" and Wait
    And I file the Level two of risk
    And I file the Level three of risk
    And I  fill  the OT Form
    Given  wait for "7" seconds
    And I click menu Button "Exceptions"
    Then Click the button "Create Exception" and Wait
    Then I fill the create Exception Form
    And I move to "Issues" tab
    Then Click the button "Create Issue" and Wait
    And I fill the Create Issue Form verify


    Examples:
      |Username|Password|
      |AA_test1 |password@1|




