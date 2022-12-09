@nams183 @sp4 @reg
  Feature: NAMS-183: Enhancement for Create Exception workflow
    @test18301
    Scenario Outline: NAMS-183: Enhancement for Create Exception workflow
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
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Summary"
      And I click menu Button "Risks and Controls"
      And I select the Table Row
      And I click the Menu icon in "Manage OT"
      And I click menu Button "Audit Program"
      And I capture the "Audit Program Exception"
      Examples:
        |Username|Password|
        |AA_test1 |password@1|


    #Scenario Outline: NAMS-119: Perform DET
     # Given I Enter the "<Username>" and "<Password>"
   #   Given  wait for "2" seconds
    #  And I  click the menu "Home"
   #   Then I click submenu "My Audits"
    #  And I Search the "Testtoday20221122022607" with
   #   And I Move to "Summary"
    #  And I click menu Button "Risks and Controls"
    #  And I select the Table Row
    #  And I click the Menu icon in "Manage OT"
    #  And I click menu Button "Audit Program"
    #  Examples:
      #  |Username|Password|
    #    |AA_test1 |password@1|