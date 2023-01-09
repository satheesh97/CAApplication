@E2E @SpecialReview
Feature: Special Review End 2 End Application
  @testas
  Scenario Outline: Audit Reports Type Special Review
    Given I Enter the "<Username>" and "<Password>"
    And  wait for "2" seconds
    And I  click the menu "Audits"
    And Click the button "Create Audit"
    And I fill the Audit form Type "Special Review"
    And I fill the Date Field in Audidt Page
    Then Click the button "Submit" and Wait
    And I  click the menu "Home"
    Then I click submenu "My Audits"
    And I Search the Name
    And I Move to "Risks and Controls"
    And file the Risk level "2.5"
    Then Click the button "Save" and Wait
    And I click menu Button "Summary"
    Then Click the button "Manage Audit Budget" and Wait
    And I fill the "Pre-planning" Phase
    Given  wait for "2" seconds
    And I fill the "Planning" Phase
    Given  wait for "2" seconds
    And I fill the "Fieldwork" Phase
    Given  wait for "2" seconds
    And I fill the "Clearance and Reporting" Phase
    Given  wait for "2" seconds
    Then Click the button "Submit" and Wait
    Given  wait for "20" seconds
    And I click menu Button "Further Details and Group Strategy"
    Then Click the button "Manage Further Details" and Wait
    And I click the label "Material Legal Entities"
    And I click the label "Regulatory Requirements"
    And I fill the "Material Legal Entities and Regulatory Requirements" section
    And I enter the Data on field "Material Legal Entities"
    And I enter the Data on field "Regulatory Requirements"
    Then Click the button "Submit" and Wait
    And I click menu Button "Summary"
    Then Click the button "Add to Annual Plan" and Wait
    And I click the Radio on user label
    And Drop the Value "Audit added due to regulatory request" at "Change Request Reason"
    Then I fill TextArea "Justification"
    Then Click the button "Submit" and Wait
    And I click menu Button "Budget and Staffing"
    Then Click the button "Manage Audit Staff" and Wait
    And I file the audit lead
    Then Click the button "Save" and Wait
    And I  click the menu "Annual Plan"
    And I search Annual Plan year
    And I click menu Button "Change Requests"
    Then Click the button "Review Change Requests" and Wait
    And I click the Radio "Approved"
    And I fill TextArea "Rationale"
    And  wait for "4" seconds
    Then Click the button "Submit" and Wait
    And I  click the menu "Home"
    Then I click submenu "My Audits"
    And I Search the Name
    And I Move to "Summary"
    And Click the button "Move to Pre-Planning" and Wait
    Then Click the button "Transition Audit" and Wait
    And I click menu Button "Tollgates"
    Then I click the "Planning" for "Add New Entry"
    And  I fill the tollgate entry
    And Click the button "Save" and Wait
    And I click menu Button "Summary"
    And Click the button "Move to Planning" and Wait
    Then Click the button "Transition Audit" and Wait
    #And I click menu Button "Summary"
    Then Click the button "Manage Audit Scope" and Wait
    And I fill the "Audit Scope"
    Then Click the button "Submit" and Wait
      #And I Move to "Further Details and Group Strategy"
    Then Click the button "Manage Group Strategy" and Wait
    And I manage the GroupStratgy
    Then Click the button "Save" and Wait
    Then Click the button "Manage Group Strategy" and Wait
    Then Click the button "Submit for Review" and Wait
    Then Click the button "Continue" and Wait
    And I click menu Button "Risks and Controls"
    And I file the Level two of risk
    And I file the Level three of risk
    And I  fill  the OT Form
    And I Create and Edit the DET or OET Form
    Then I click menu Button "Design Effectiveness Testing"
    Then Click the button "Manage DET" and Wait
    And I  fill the DET Form
    Then Click the button "Manage DET" and Wait
    And I fill the conclusion of DET or OET
    Then I click menu Button "Operating Effectiveness Testing"
    Then Click the button "Manage OET" and Wait
    And I fill the OET form
    Then Click the button "Manage OET" and Wait
    And I fill the conclusion of DET or OET
    Then I click menu Button "Summary"
    Then Click the button "Update Control" and Wait
    Then I fill the Control in "Summary"
    Examples:
      |Username|Password|
      |AA_test1 |password@1|

  @testas
  Scenario Outline:Special Review End 2 End Application Accept
    Given I Enter the "<Username>" and "<Password>"
    Given  wait for "2" seconds
    And I  click the menu "Home"
    Then I click submenu "My Audits"
    And I Search the Name under the "My Task"
    And I Select the Type "Review Group Strategies" for "Approve" And "Submit"
    Then I click submenu "My Audits"
    And I Search the Name under the "My Task"
    And I Select the Type "Review DET" And "Accept"
    Then I click submenu "My Audits"
    And I Search the Name under the "My Task"
    And I Select the Type "Review OT" And "Accept"
    Then I click submenu "My Audits"
    And I Search the Name under the "My Task"
    And I Select the Type "Review OET" And "Accept"
    Examples:
      |Username|Password|
      |satheesh.kaliappan|Satheesh1|

  @testas
  Scenario Outline:  Assurance Work Package Send Group Strategies for Group Strategy Team Review accept
    Given I Enter the "<Username>" and "<Password>"
    Given  wait for "2" seconds
    And I  click the menu "Home"
    Then I click submenu "My Audits"
    And I Search the Name under the "My Task"
    And I Select the Type "Review Group Strategies" for "Approve" And "Submit"
    Examples:
      |Username|Password|
      |AA_test2 |password@2|

  @testas
  Scenario Outline: Special Review AWP APM,AAM Relase/update the user
    Given I Enter the "<Username>" and "<Password>"
    Given  wait for "2" seconds
    And I  click the menu "Home"
    Then I click submenu "My Audits"
    And I Search the Name
    And I Move to "Document & Stakeholder Comms"
    And I click the "Audit Planning Memorandum" and "Manage APM" menu
    And I fill the APM Managemnt Form
    And I click the "Audit Announcement Memorandum" and "Manage AAM Distribution List" menu
    Then Click the button "Confirm" and Wait
    Examples:
      |Username|Password|
      |AA_test1 |password@1|

  @testas
  Scenario Outline: Special Review Publish APM Manager Accept
    Given I Enter the "<Username>" and "<Password>"
    Given  wait for "2" seconds
    And I  click the menu "Home"
    Then I click submenu "My Audits"
    And I Search the Name
    And I Move to "Document & Stakeholder Comms"
    And I click the "Audit Planning Memorandum" and "Publish APM" menu
    And I upload the File
    Then Click the button "Confirm" and Wait
    And I Click the "Reminder" to "Confirm"
    Examples:
      |Username|Password|
      |satheesh.kaliappan|Satheesh1|

  @testas
  Scenario Outline:Special Review Publish AAM Manager Accpet
    Given I Enter the "<Username>" and "<Password>"
    Given  wait for "2" seconds
    And I  click the menu "Home"
    Then I click submenu "My Audits"
    And I Search the Name
    And I Move to "Document & Stakeholder Comms"
    And I click the "Audit Announcement Memorandum" and "Publish AAM" menu
    Then Click the button "Confirm" and Wait
    Then Click the button "Submit" and Wait
    And I upload the File
    Then Click the button "Proceed to publish" and Wait
    Then Click the button "Email distribution list" and Wait
    Then Click the button "OK" and Wait
    Examples:
      |Username|Password|
      |satheesh.kaliappan|Satheesh1|


  @testas
  Scenario Outline: Special Review Exception and Issue indicator update
    Given I Enter the "<Username>" and "<Password>"
    Given  wait for "2" seconds
    And I  click the menu "Home"
    Then I click submenu "My Audits"
    And I Search the Name
    And I Move to "Summary"
    And Click the button "Move to Fieldwork" and Wait
    Then Click the button "Transition Audit" and Wait
    And I click menu Button "Tollgates"
    Then I click the "Fieldwork" for "Add New Entry"
    And  I fill the tollgate entry
    And Click the button "Save" and Wait
    And I click menu Button "Exceptions"
    Then Click the button "Create Exception" and Wait
    Then I fill the create Exception Form
    And I move to "Issues" tab
    Then Click the button "Create Issue" and Wait
    And I fill the Create Issue Form
    Given  wait for "20" seconds
    And I click menu Button "Summary"
    And Click the button "Move to Clearance and Reporting" and Wait
    Then Click the button "Transition Audit" and Wait
    And I Click the "Downward Feedback Process" to "Transition Audit"
    Examples:
      | Username | Password |
      |AA_test1 |password@1|

  @testas
  Scenario Outline:Special Review Issue and Exception Accept
    Given I Enter the "<Username>" and "<Password>"
    Given  wait for "2" seconds
    And I  click the menu "Home"
    Then I click submenu "My Audits"
    And I Search the Name under the "My Task"
    And I Select the Type "Review Exception" And "Accept"
    Then I click submenu "My Audits"
    And I Search the Name under the "My Task"
    And I Select the Type "Review Issue" And "Approve"
    Then I click submenu "My Audits"
    And I Search the Name
    And I Move to "Document & Stakeholder Comms"
    And I click the "Audit Report" and "Publish Audit Report" menu
    And I click the Radio "Draft"
    Then Click the button "Submit" and Wait
    Then Click the button "Confirm" and Wait
    And I upload the File
    And I upload the File
    Then Click the button "Proceed to publish" and Wait
    Then Click the button "Email distribution list" and Wait
    Then Click the button "OK" and Wait
    And I click the "Audit Report" and "Publish Audit Report" menu
    And I fill the publish Audit Form
    Then Click the button "OK" and Wait

    Examples:
      |Username|Password|
      |satheesh.kaliappan|Satheesh1|

  @testas
  Scenario Outline: Special Review move to archive
    Given I Enter the "<Username>" and "<Password>"
    Given  wait for "2" seconds
    And I  click the menu "Home"
    Then I click submenu "My Audits"
    And I Search the Name
    And I Move to "Summary"
    And I click menu Button "Tollgates"
    Then I click the "Reporting" for "Add New Entry"
    And  I fill the tollgate entry
    And Click the button "Save" and Wait
    And I click menu Button "Summary"
    And Click the button "Move to Archived" and Wait
    And I click the Radio "Yes"
    Then Click the button "Transition Audit" and Wait
    Then Click the button "Confirm" and Wait

    Examples:
      | Username | Password |
      |AA_test1 |password@1|


