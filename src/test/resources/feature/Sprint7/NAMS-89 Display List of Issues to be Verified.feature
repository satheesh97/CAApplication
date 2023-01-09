@nams89 @sp7 @reg
  Feature: NAMS-89: Display List of Issues to be Verified
    @test8901
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
      And I click menu Button "Verifications"
      Then Click the button "Manage Issue and Action Verification" and Wait
      And I  click Radio Tabel
      Then Click the button "Submit" and Wait
      Then Click the button "Yes" and Wait
      And I capture the "Issue and Verification Table"
      Examples:
        | Username | Password |
        |AA_test1 |password@1|