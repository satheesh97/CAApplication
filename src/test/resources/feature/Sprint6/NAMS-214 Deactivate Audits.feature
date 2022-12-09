@nams214 @sp6 @reg
  Feature: NAMS-214: Deactivate Audits
    @testnams214
    Scenario Outline: NAMS-14: Annual Plan Dashboard
      Given I Enter the "<Username>" and "<Password>"
      And  wait for "2" seconds
      And I  click the menu "Annual Plan"
      Then Click the button "Deactivate Audits" and Wait
      And click sheet "Bulk Deactivate"
      And I validate CheckBoxGroup Visiblity
      Then Click the button "Go Back" and Wait
      And click sheet "Manual Deactivate"
      And I validate CheckBoxGroup Visiblity
      Then Click the button "Go Back" and Wait
      Examples:
        |Username|Password|
        |AA_test1 |password@1|