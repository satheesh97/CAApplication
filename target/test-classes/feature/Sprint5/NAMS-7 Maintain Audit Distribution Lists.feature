@nams7 @sp5 @reg
  Feature: NAMS-7: Maintain Audit Distribution Lists
    @test0701
    Scenario Outline: NAMS-5: Collate Audit Planning Memo Data
      Given I Enter the "<Username>" and "<Password>"
      And  wait for "2" seconds
      And I  click the menu "Admin"
      And I click the admin division information Only COO account

      Examples:
        |Username|Password|
        |AA_test1 |password@1|