@nams148 @sp4 @reg
  Feature: NAMS-148: Generate MRCC Extract
    @test14801
    Scenario Outline:NAMS-148: Send MRCC for MRCC Team Lead Review
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Audits"
      And Click the button "Create Audit"
      And I fill the Audit form Without Key Date
      Then Click the button "Submit" and Wait
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Summary"
      And Click the button "Move to Pre-Planning"
      Then Click the button "Transition Audit" and Wait
      And Click the button "Move to Planning"
      Then Click the button "Transition Audit" and Wait
      And I click menu Button "Budget and Staffing"
      Then Click the button "Manage Audit Staff" and Wait
      And I file the audit lead
      Then Click the button "Save" and Wait
      And I click menu Button "MRCC Reviews"
      Then I click Table "MRCC"
      Then Click the button "Manage MRCC Indicators" and Wait
      And I Select Indicator in MRCC
      Then Click the button "Save" and Wait
      Then I navigat to "MRCC Reviews"
      And I click menu Button "Summary"
      And Click the button "Move to Fieldwork"
      Then Click the button "Transition Audit" and Wait
      And I click menu Button "MRCC Reviews"
      Then I click Table "MRCC"
      Then Click the button "Manage MRCC Ratings" and Wait
      And I fill the Rating Form
      Then Click the button "Submit for review" and Wait

      Examples:
        | Username | Password |
        |AA_test1 |password@1|

    @test148001
    Scenario Outline: NAMS-148: Send MRCC for AM Accept
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name under the "My Task"
      And I Select the Type "Review MRCC" for "Approve" And "Submit"

      Examples:
        |Username|Password|
        |satheesh.kaliappan|Satheesh1|



    @test6702
    Scenario Outline: NAMS-148: MRCC SME Accept
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name under the "My Task"
      And I Select the Type "Review MRCC" for "Approve" And "Submit"

      Examples:
        |Username|Password|
        |AA_test2 |password@2|

    @test67001
    Scenario Outline: NAMS-148: MRCC AM Accept
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name under the "My Task"
      And I Select the Type "Review MRCC" for "Approve" And "Submit"

      Examples:
        |Username|Password|
        |satheesh.kaliappan|Satheesh1|

    Scenario Outline:NAMS148: MRCC Genrate
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Audits"
      And I Search the Name Under Audit
      And I Move to "MRCC Reviews"
      Then Click the button "Generate MRCC Extract" and Wait
      Then Click the button "Cancel" and Wait
      Then Click the button "Continue" and Wait

      Examples:
        |Username|Password|
        |AA_test2 |password@2|
