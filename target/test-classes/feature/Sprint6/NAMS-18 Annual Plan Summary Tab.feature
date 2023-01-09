@nams18 @sp6 @reg
  Feature: NAMS-18: Annual Plan Summary Tab
    @test1801
    Scenario Outline:NAMS-18: Annual Plan Summary Tab
      Given I Enter the "<Username>" and "<Password>"
      And  wait for "2" seconds
      And I  click the menu "Annual Plan"
      And I click  the Live Year "2022"
      And I capture the "Annual Plan summary"
      And I click menu Button "Audits in Plan"
      And I capture the "Audits in Plan-AnnualPaln"
      Examples:
        |Username|Password|
        |AA_test1 |password@1|