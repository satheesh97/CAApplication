@nams268 @sp8 @reg
  Feature: NAMS-268: Confidential Issue Enhancement
    @test26801
    Scenario Outline: NAMS-268: Confidential Issue Enhancement
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Audits"
      And Click the button "Create Audit"
      And I fill the Audit form With "confidential"
      Then Click the button "Submit" and Wait
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Issues"
      Then Click the button "Create Issue" and Wait
      And I click Radio option "Is Confidential Issue?" As "Yes"
      And I click Radio option "Is Confidential Issue?" As "No"
      Then Click the button "Cancel" and Wait
      Then Click the button "Continue" and Wait

      Examples:
        |Username|Password|
        |AA_test1 |password@1|