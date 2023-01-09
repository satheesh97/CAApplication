@nams77 @sp5 @reg
  Feature: NAMS-77: Audit Type Specific Audit Reports
    @test7701
    Scenario Outline:NAMS-77: Audit Type Specific Audit Reports Type Assurance Work Package
      Given I Enter the "<Username>" and "<Password>"
      And  wait for "2" seconds
      And I  click the menu "Audits"
      And Click the button "Create Audit"
      And I fill the Audit form Type "Assurance Work Package"
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

    @test7702
    Scenario Outline:NAMS-77: Audit Type Specific Audit Reports Type Change Audit
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

    @test7703
    Scenario Outline:NAMS-77: Audit Type Specific Audit Reports Type Regular Audit
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

    @test7704
    Scenario Outline:NAMS-77: Audit Type Specific Audit Reports Type Special Review
      Given I Enter the "<Username>" and "<Password>"
      And  wait for "2" seconds
      And I  click the menu "Audits"
      And Click the button "Create Audit"
      And I fill the Audit form Type "Special Review"
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

    @test7705
    Scenario Outline:NAMS-77: Audit Type Specific Audit Reports Type Special Verification Review
      Given I Enter the "<Username>" and "<Password>"
      And  wait for "2" seconds
      And I  click the menu "Audits"
      And Click the button "Create Audit"
      And I fill the Audit form Type "Special Verification Review"
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

    @test7707
    Scenario Outline:NAMS-77: Audit Type Specific Audit Reports Type Specific Control Review
      Given I Enter the "<Username>" and "<Password>"
      And  wait for "2" seconds
      And I  click the menu "Audits"
      And Click the button "Create Audit"
      And I fill the Audit form Type "Specific Control Review"
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

    @test7708
    Scenario Outline:NAMS-77: Audit Type Specific Audit Reports Type Specific Control Review
      Given I Enter the "<Username>" and "<Password>"
      And  wait for "2" seconds
      And I  click the menu "Audits"
      And Click the button "Create Audit"
      And I fill the Audit form Type "Continuous Risk Monitoring"
      Then Click the button "Submit" and Wait
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Document & Stakeholder Comms"
      Then Click the button "Manage Audit Report Data" and Wait

      Examples:
        |Username|Password|
        |AA_test1 |password@1|

    @test7709
    Scenario Outline:NAMS-77: Audit Type Specific Audit Reports Type Specific Control Review
      Given I Enter the "<Username>" and "<Password>"
      And  wait for "2" seconds
      And I  click the menu "Audits"
      And Click the button "Create Audit"
      And I fill the Audit form Type "Standalone Action Verification"
      Then Click the button "Submit" and Wait
      And I  click the menu "Home"
      Then I click submenu "My Audits"
      And I Search the Name
      And I Move to "Document & Stakeholder Comms"
      Then Click the button "Manage Audit Report Data" and Wait
     
      Examples:
        |Username|Password|
        |AA_test1 |password@1|