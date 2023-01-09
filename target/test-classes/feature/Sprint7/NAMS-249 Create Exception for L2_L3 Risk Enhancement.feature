@nams249 @reg @sp7
  Feature: NAMS-249: Create Exception for L2/L3 Risk Enhancement
    @test24901
    Scenario Outline: NAMS-249: Create Exception for L2/L3 Risk Enhancement
      Given I Enter the "<Username>" and "<Password>"
      And  wait for "2" seconds
      And I  click the menu "Audits"
      And Click the button "Create Audit"
      And I fill the Audit form Type "Regular Audit"
      And I fill the Date Field in Audidt Page
      Then Click the button "Submit" and Wait
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Risks and Controls"
      And file the Risk level "2.5"
      Then Click the button "Save" and Wait
      And I file the Level two of risk
      And I file the Level three of risk
      And I  fill  the OT Form to save
      And I click menu Button "Exceptions"
      Then Click the button "Create Exception" and Wait
      Then I fill the create Exception Form
      And  wait for "10" seconds
      Then Click the button "Create Exception" and Wait
      Then I fill the create Exception Form for level two
      Examples:
        | Username | Password |
        |AA_test1 |password@1|