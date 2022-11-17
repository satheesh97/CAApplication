@nams166 @sp3
  Feature:NAMS-166: MRCC Indicative Rating
    @reg 
    Scenario Outline:NAMS-166: MRCC Indicative Rating
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
      And I click menu Button "MRCC Reviews"
      Then I click Table "MRCC"
      Then Click the button "Manage MRCC Indicators" and Wait
      Then Click the button "Save" and Wait
      Then I navigat to "MRCC Reviews"
      And I click menu Button "Summary"
      And Click the button "Move to Fieldwork"
      Then Click the button "Transition Audit" and Wait
      And I click menu Button "MRCC Reviews"
      Then I click Table "MRCC"
      Then Click the button "Manage MRCC Ratings" and Wait
      And I fill the Rating Form
      And I capture the "Manage MRCC Ratings"
      Then Click the button "Submit for review" and Wait
      Examples:
        | Username | Password |
        |AA_test1 |password@1|