@nams192 @sp5 @reg
  Feature: NAMS-192: Multiple Audit MRCCs Enhancement
    @test19201
    Scenario Outline:NAMS-192: Multiple Audit MRCCs Enhancement
      Given I Enter the "<Username>" and "<Password>"
      And  wait for "2" seconds
      And I  click the menu "Audits"
      And Click the button "Create Audit"
      And I fill the Audit form Type "Change Audit"
      Then Click the button "Submit" and Wait
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Document & Stakeholder Comms"
      Then Click the button "Manage Audit Report Data" and Wait
      And I  verify MRCC rating
      Examples:
        |Username|Password|
        |AA_test1 |password@1|

    @test19202
    Scenario Outline:NAMS-192: Multiple Audit MRCCs Enhancement
      Given I Enter the "<Username>" and "<Password>"
      And  wait for "2" seconds
      And I  click the menu "Audits"
      And Click the button "Create Audit"
      And I fill the Audit form Type "Regular Audit"
      Then Click the button "Submit" and Wait
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Document & Stakeholder Comms"
      Then Click the button "Manage Audit Report Data" and Wait
      And I  verify MRCC rating
      Examples:
        |Username|Password|
        |AA_test1 |password@1|