@nams119
  Feature:NAMS-119: Perform DET
    @test220211024
    Scenario Outline: NAMS-119: Perform DET
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
      Examples:
        |Username|Password|
        |AA_test1 |password@1|