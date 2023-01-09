@nams286 @sp8 @reg
  Feature: NAMS-286: Review Issues Task

    @test2860
    Scenario Outline: NAMS-286: Review Issue Task Create/Edit Exception
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
      And I move to "Issues" tab
      Then Click the button "Create Issue" and Wait
      And I fill the Create Issue Form
      Examples:
        |Username|Password|
        |AA_test1 |password@1|

    @test28601
    Scenario Outline: NAMS-286:  Accept Review/exception
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name under the "My Task"
      And I Select the Type "Review Exception" And "Accept"
      Then I click submenu "My Audits"
      And I Search the Name under the My Task
      And I Select the Type "Review Issue" And "Reject"
      Examples:
        |Username|Password|
        |satheesh.kaliappan|Satheesh2|

    @test28602
    Scenario Outline:NAMS-286:Review Exception Task Create/Edit Exception
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Issues"
      And I click the "Manage Issue" menu
      And I Validate Warning visible
      Then Click the button "Submit for Review" and Wait
      Examples:
        |Username|Password|
        |AA_test1 |password@1|

    @test28601
    Scenario Outline: NAMS-286:  Accept Review/exception
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name under the "My Task"
      And I Select the Type "Review Issue" And "Approve"
      Examples:
        |Username|Password|
        |satheesh.kaliappan|Satheesh2|

    @test28602
    Scenario Outline: NAMS-286: Review Exception Task Create/Edit Exception
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Issues"
      And I click the "Manage Issue" menu
      And I Validate Warning visible
      Then Click the button "Submit for Review" and Wait
      And Validate the Status as "Reviewd"
      Examples:
        |Username|Password|
        |AA_test1 |password@1|
