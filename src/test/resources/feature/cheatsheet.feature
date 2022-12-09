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
     And Drop the Value "Audit added due to regulatory request" at "Change Request Reason"
     And I verify "STATUS" As "Live"
     Then I fill TextArea "Rationale"
     Then I click the Radio "No"
     And click sheet "Bulk Deactivate"
     And I validate CheckBoxGroup Visiblity
     And click sheet "Manage Documents"
     And I click "cancel" button icon
     And I Click the "Reminder" to "Confirm"
     And I Search the "Test022022101410" with
     And I select "Audit Phase" with value "Fieldwork"
    And I fill the Date Field in Audidt Page

