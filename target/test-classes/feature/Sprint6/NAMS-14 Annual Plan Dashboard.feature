@nams14 @nams15 @sp6 @reg
  Feature: NAMS-14: Annual Plan Dashboard
    @test14
    Scenario Outline: NAMS-14: Annual Plan Dashboard
      Given I Enter the "<Username>" and "<Password>"
      And  wait for "2" seconds
      And I  click the menu "Annual Plan"
      Then Click the button "Create Annual Plan" and Wait
      And i fill the cerate annual Plan
     Then Click the button "Save" and Wait
      Examples:
        |Username|Password|
        |AA_test1 |password@1|


    @nams151
    Scenario Outline: NAMS-15: Annual Plan Lifecycle
      Given I Enter the "<Username>" and "<Password>"
      And  wait for "2" seconds
      And I  click the menu "Annual Plan"
      And I search Annual Plan year
      Then Click the button "Transition To Approved" and Wait
      Then I fill TextArea "Rationale"
      Then I click the Radio "No"
      Then Click the button "Submit" and Wait
      Then Click the button "Continue" and Wait
      Then Click the button "Transition To Live" and Wait
      Then Click the button "Submit" and Wait
      Then Click the button "Continue" and Wait
      And I verify "STATUS" As "Live"
      #Then Click the button "Transition To Closed" and Wait
      And I click menu Button "Activity History"
      And I capture the "Annual Plan Histroy"

      Examples:
        |Username|Password|
        |AA_test1 |password@1|