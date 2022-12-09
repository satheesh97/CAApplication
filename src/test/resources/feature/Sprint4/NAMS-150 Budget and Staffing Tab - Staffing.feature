@nams150 @sp4 @reg
  Feature: NAMS-150: Budget and Staffing Tab - Staffing
    @test15001
    Scenario Outline: NAMS-150: Budget and Staffing Tab - Staffing
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Audits"
      And Click the button "Create Audit"
      And I fill the Audit form
      Then Click the button "Submit" and Wait
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Budget and Staffing"
      And I verify the Staff page
      Then I capture the "Staffing page"
      #Then Click the button "Manage Audit Staff" and Wait


      Examples:
        |Username|Password|
        |AA_test1 |password@1|
