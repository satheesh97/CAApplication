@nams180 @sp5 @reg
  Feature: NAMS-180: Send Group Strategies for Group Strategy Team Review
    @tes18001
    Scenario Outline: NAMS-180: Send Group Strategies for Group Strategy Team Review
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Audits"
      And Click the button "Create Audit"
      And I fill the Audit form Without Key Date
      Then Click the button "Submit" and Wait
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Further Details and Group Strategy"
      Then Click the button "Manage Group Strategy" and Wait
      And I manage the GroupStratgy
      Then Click the button "Save" and Wait
      Then Click the button "Manage Group Strategy" and Wait
      Then Click the button "Submit for Review" and Wait
      Then Click the button "Continue" and Wait

      Examples:
        |Username|Password|
        |AA_test1 |password@1|

    @test1803
    Scenario Outline:  NAMS-180: Send Group Strategies for Group Strategy Team Review Manager Accept
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name under the "My Task"
      And I Select the Type "Review Group Strategies" for "Approve" And "Submit"

      Examples:
        |Username|Password|
        |satheesh.kaliappan|Satheesh1|


    @test1804
    Scenario Outline:  NAMS-180: Send Group Strategies for Group Strategy Team Review accept
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name under the "My Task"
      And I Select the Type "Review Group Strategies" for "Approve" And "Submit"

      Examples:
        |Username|Password|
        |AA_test2 |password@2|

    Scenario Outline:NAMS-180: Send Group Strategies for Group Strategy Team Review
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Activity History"
      And I capture the "Group Strategies Lead Activity"
      Examples:
        | Username | Password |
        |AA_test1 |password@1|