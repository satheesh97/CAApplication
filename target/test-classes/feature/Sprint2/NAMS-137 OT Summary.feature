@nams137
Feature:NAMS-121: Create/Edit Outcome Test
  @test202211033 @sp2
  Scenario Outline: NAMS-120: Create/Edit OET

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
    And I  fill  the OT Form to save
    Examples:
      |Username|Password|
      |AA_test1 |password@1|