@nams10, @nams115
Feature:NAMS-10 &NAMS115: Create/Edit Control
  @test6 @local1 @reg
  Scenario Outline: NAMS-10 &NAMS115: Create/Edit Control
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
    And I can see "Audit Program"
    Examples:
      |Username|Password|
      |satheesh.kaliappan|Satheesh1|

  @test7
  Scenario Outline:NAMS-10 &NAMS115: Create/Edit Control
    Given I Enter the "<Username>" and "<Password>"

    And I  click the menu "Home"
    Then I click submenu "My Audits"
    And I Search the Name
    And I Move to "Risks and Controls"
   # And file the Risk level "2.5"
    #Then Click the button "Save" and Wait
    And I file the Level two of risk
    And I file the Level three of risk
    Examples:
      |Username|Password|
      |satheesh.kaliappan|Satheesh1|

    @Test8
  Scenario Outline: Nams39 Proposed Audit Summery
    Given I Enter the "<Username>" and "<Password>"

    And I  click the menu "Home"
    Then I click submenu "My Audits"
    And I Search the Name
    And I Move to "Risks and Controls"
   # And file the Risk level "2.5"
   #Then Click the button "Save" and Wait
   # And I file the Level of risk
    And I file the riskthree level
    Examples:
      |Username|Password|
      |satheesh.kaliappan|Satheesh1|
