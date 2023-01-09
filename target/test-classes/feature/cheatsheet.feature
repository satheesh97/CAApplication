@testcheat
  Feature: Demo
    Scenario: test
     Then I click the "Planning" for "Add New Entry"
      And I click the "Audit Planning Memorandum" and "Manage APM" menu
      And I click the "Update Control" menu
      And I click menu Button "MRCC Reviews"
      And I click "Generate Print View" on "Audit Planning Memorandum"
      And I clik and capture the "name"
      And I capture the "ing"
      And I Click "MRCC Paragraph" and capture the "Feedback"
      And I fill the "Material Legal Entities and Regulatory Requirements" section
      #radioButton
      And I click the label "Material Legal Entities"
     Then I fill Textinput "Title"
     And Drop the Value "Audit added due to regulatory request" at "Change Request Reason"
     And I verify "STATUS" As "Live"
     Then I fill TextArea "Rationale"
     Then I click the Radio "No"
     And click sheet "Bulk Deactivate"
     And I validate CheckBoxGroup Visiblity
     And click sheet "Manage Documents"
     And I click "cancel" button icon
     And I Click the "Downward Feedback Process" to "Confirm"
     And I Search the "Test022022101410" with
     And I select "Audit Phase" with value "Fieldwork"
    And I fill the Date Field in Audidt Page
     And I click text "Deactivated Operating Effectiveness Tests"
     And I enter the Data on field "Material Legal Entities"
     Then I fill the create Exception Form for level two
     Then I fill the create Exception Form
     And I select "Create New Issue" As "Yes"

     And I Search the Name under the "My Task"
     And I Search the Name under the My Task

   @demo
   Scenario Outline: demo verification link
    Given I Enter the "<Username>" and "<Password>"
    Given  wait for "2" seconds
    Then I click submenu "My Audits"
    And I Search the Name
    And I Move to "Verifications"
    And I click the icon on Table
    Given  wait for "10" seconds
    And I click the menu "Link action to existing control/outcome test" under "Verification Actions"
    And I fill the link Test form
    Then Click the button "Save" and Wait
    And naviagate the to linked Contorl
    And I capture the "Linked Control Audit"
    Examples:
     |Username|Password|
     |AA_test1 |password@1|


