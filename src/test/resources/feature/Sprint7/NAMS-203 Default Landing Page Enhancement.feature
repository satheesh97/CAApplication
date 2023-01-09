@nams203 @sp7 @reg
  Feature: NAMS-203: Default Landing Page Enhancement
    @test20301
    Scenario Outline:NAMS-6: Audit Walkthrough Documents
      Given I Enter the "<Username>" and "<Password>"
      And  wait for "2" seconds
      And I  click the menu "Home"
      Then I click submenu "My Verifications"
      And Validate the Verification table
      And  I capture the "Verification menu"
      Examples:
        |Username|Password|
        |AA_test1 |password@1|