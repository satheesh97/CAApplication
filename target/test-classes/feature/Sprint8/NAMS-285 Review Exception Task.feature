@nams285 @sp8 @reg
  Feature: NAMS-285: Review Exception Task

    @test2850
    Scenario Outline: NAMS-285: Review Exception Task Create/Edit Exception
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Audits"
      And Click the button "Create Audit"
      And I fill the Audit form Type "Regular Audit"
      Then Click the button "Submit" and Wait
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Exceptions"
      Then Click the button "Create Exception" and Wait
      Then I fill the create Exception Form
      Examples:
        |Username|Password|
        |AA_test1 |password@1|

    @test2850
    Scenario Outline: NAMS-285: Accept Review/exception
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name under the "My Task"
      And I Select the Type "Review Exception" And "Reject"
      Examples:
        |Username|Password|
        |satheesh.kaliappan|Satheesh2|
    @test2850
    Scenario Outline: NAMS-285: Review Exception Task Create/Edit Exception
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Exceptions"
      And I click the "Manage Exception" menu
      And I Validate Warning visible
      Then Click the button "Submit for Review" and Wait

      Examples:
        |Username|Password|
        |AA_test1 |password@1|
    @test2850
    Scenario Outline: NAMS-285: Accept Review/exception
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name under the "My Task"
      And I Select the Type "Review Exception" And "Accept"
      Examples:
        |Username|Password|
        |satheesh.kaliappan|Satheesh2|
    @test2850
    Scenario Outline: NAMS-285: Review Exception Task Create/Edit Exception
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Exceptions"
      And I click the "Manage Exception" menu
      And I Validate Warning visible
      And  I capture the "Warning Message at Exception"
      Then Click the button "Submit for Review" and Wait
      And Validate the Status as "Draft"

      Examples:
        |Username|Password|
        |AA_test1 |password@1|