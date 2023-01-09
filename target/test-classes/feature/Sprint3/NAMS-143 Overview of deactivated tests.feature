@nams143 @sp3
  Feature: NAMS-143: Overview of deactivated tests
    @test0911221
    Scenario Outline: NAMS-143: Overview of deactivated tests
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
      And I Create and Edit the DET or OET Form
      Then I click menu Button "Design Effectiveness Testing"
      Then Click the button "Manage DET" and Wait
      And I  fill the DET Form
      Then Click the button "Manage DET" and Wait
      And I fill the conclusion of DET or OET
      Then I click menu Button "Operating Effectiveness Testing"
      Then Click the button "Manage OET" and Wait
      And I fill the OET form
      Then Click the button "Manage OET" and Wait
      And I fill the conclusion of DET or OET
      Then I click menu Button "Summary"
      Then Click the button "Update Control" and Wait
      Then I fill the Control in "Summary"
      Examples:
        |Username|Password|
        |AA_test1 |password@1|

    @test0911222 @2121
    Scenario Outline: NAMS-143: Create/Edit Issue accept DET/OET/OT
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name under the "My Task"
      And I Select the Type "Review DET" And "Accept"
      Then I click submenu "My Audits"
      And I Search the Name under the "My Task"
      And I Select the Type "Review OT" And "Accept"
      Then I click submenu "My Audits"
      And I Search the Name under the "My Task"
      And I Select the Type "Review OET" And "Accept"

      Examples:
        |Username|Password|
        |satheesh.kaliappan|Satheesh1|

    @test10112221 @2121
    Scenario Outline: NAMS-143: Create/Edit Issue Deactivate DET/OET/OT
      Given I Enter the "<Username>" and "<Password>"
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Audit Program"
      And I move to "Deactivate OT" Page
      Then Click the button "Deactivate" and Wait
      Then Click the button "Confirm" and Wait
      And I move to "Deactivate OET&DET" Page
      Then I click menu Button "Design Effectiveness Testing"
      Then Click the button "Deactivate DET" and Wait
      And I fill the deactivate form
      Then button click for "Deactivate"
      Then Click the button "Confirm" and Wait
      Then I click menu Button "Operating Effectiveness Testing"
      Then Click the button "Deactivate OET" and Wait
      And I fill the deactivate form
      Then button click for "Deactivate"
      Then Click the button "Confirm" and Wait

      Examples:
        |Username|Password|
        |AA_test1 |password@1|

    @test10112221
    Scenario Outline: NAMS-143: Create/Edit Issue Reactivate DET/OET/OT
      Given I Enter the "<Username>" and "<Password>"
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Audit Program"
      And I click text "Deactivated Tests"
      And I click text "Deactivated Design Effectiveness Tests"
      Then Click the button "Reactivate DET" and Wait
      Then button click for "Reactivate"
      And I click text "Deactivated Operating Effectiveness Tests"
      Then Click the button "Reactivate OET" and Wait
      Then button click for "Reactivate"
      And I click text "Deactivated Outcome Tests"
      Then Click the button "Reactivate OT" and Wait
      Then button click for "Reactivate"
      Examples:
        |Username|Password|
        |AA_test1 |password@1|