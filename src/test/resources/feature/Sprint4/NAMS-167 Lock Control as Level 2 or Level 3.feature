@nams167 @sp4 @reg
  Feature: NAMS-167: Lock Control as Level 2 or Level 3
 @test16701
 Scenario Outline: NAMS-167: Lock Control as Level 2 or Level 3
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
  # And I file the Level three of risk
   And I Create and Edit the DET or OET Form in L2
   Then I click menu Button "Design Effectiveness Testing"
   Then Click the button "Manage DET" and Wait
   And I  fill the DET Form with Exception
   Then Click the button "Manage DET" and Wait
   And I fill the conclusion of DET or OET with OT save in L2
   Then I navigat to "Audit Program"
   And I click the "Update Control" menu
   And I validate the Risk is Disable
   And I capture the "Risk Level Lock"
   Examples:
     |Username|Password|
     |AA_test1 |password@1|
