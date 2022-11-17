@nams56 @reg @sp2
  Feature: NAMS-56: Create/Edit Issue

    @test2610221
    Scenario Outline:NAMS-56: Create/Edit Issue create Audit
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

    @test26102211 @2121
    Scenario Outline: NAMS-56: Create/Edit Issue accept DET/OET/OT
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




    @test011122
    Scenario Outline: NAMS-56: Create/Edit Issue
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Exceptions"
      Then Click the button "Create Exception" and Wait
      Then I fill the create Exception Form
      And I move to "Issues" tab
      Then Click the button "Create Issue" and Wait
      And I fill the Create Issue Form

      Examples:
        |Username|Password|
        |AA_test1 |password@1|

    @test26102211
    Scenario Outline: NAMS-65: Accept Review/exception
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name under the My Task
      And I Select the Type "Review Exception" And "Accept"
      Then I click submenu "My Audits"
      And I Search the Name under the My Task
      And I Select the Type "Review Issue" And "Approve"

      Examples:
        |Username|Password|
        |satheesh.kaliappan|Satheesh1|