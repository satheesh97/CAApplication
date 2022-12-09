@nams16 @sp6 @reg
  Feature: NAMS-16: Transition from Fieldwork to Clearance and Report Enhancement
    @test1601
    Scenario Outline:NAMS-16: Transition from Fieldwork to Clearance and Report Enhancement Amgr
      Given I Enter the "<Username>" and "<Password>"
      Given  wait for "2" seconds
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the "AU-" with
      And I select "Audit Phase" with value "Fieldwork"
      Given  wait for "4" seconds
      And I select "Type" with value "Regular Audit"
      Given  wait for "4" seconds
      And I Move to "Summary"
      Then Click the button "Remove from Annual Plan" and Wait
      And Drop the Value "Removed from Plan due to COVID-19" at "Change Request Reason"
      Then I fill TextArea "Justification"
      Then Click the button "Submit" and Wait
      And Click the button "Move to Clearance and Reporting"
      Then Click the button "Transition Audit" and Wait
   And I Click the "Downward Feedback Process" to "Transition Audit"

      Examples:
        |Username|Password|
        |satheesh.kaliappan|Satheesh1|