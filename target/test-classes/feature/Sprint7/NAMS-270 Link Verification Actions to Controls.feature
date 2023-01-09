@nams270 @sp7 @reg
Feature: NAMS-270: Link Verification Actions to Controls
  @test27001
  Scenario Outline: NAMS-270: Link Verification Actions to Controls
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
    And I Create and Edit the DET or OET Form
    Then I click menu Button "Design Effectiveness Testing"
    Then Click the button "Manage DET" and Wait
    And I  fill the DET Form with Exception
    Then Click the button "Manage DET" and Wait
    And I fill the conclusion of DET or OET with OT save
    Then I click menu Button "Operating Effectiveness Testing"
    Then Click the button "Manage OET" and Wait
    And I  fill the DET Form with Exception
    Then Click the button "Manage OET" and Wait
    And I fill the conclusion of DET or OET with OT save
    Then I navigat to "Risks and Controls"
    And I select the Table Row
    And I click the Menu icon in "Manage OT"
    And I click menu Button "Verifications"
    Then Click the button "Manage Issue and Action Verification" and Wait
    And clcik the Radio from table
    Then Click the button "Submit" and Wait
    Then Click the button "Yes" and Wait
    And I click the icon on Table
    Given  wait for "10" seconds
    And I click the menu "Link action to existing control/outcome test" under "Verification Actions"
    And I fill the link Test form
    Then Click the button "Save" and Wait
    And naviagate the to linked Contorl
    And I capture the "Linked Control Audit"
    Examples:
      |Username|Password|
      |AA_test1 |password@1|

