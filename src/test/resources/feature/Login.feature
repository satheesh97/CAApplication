
Feature: launch the CS Application

@reg @log
  Scenario Outline: log in Application
    Given I Enter the "<Username>" and "<Password>"

    Examples:
    |Username|Password|
    |satheesh.kaliappan|Satheesh1|

 # @demoo2reg1
 # Scenario Outline: log in Application2
 #   Given User Enter the "<Username>" and "<Password>"
 #   #Given I wait for "20" seconds
 #   And I click the SignIN
 #   #Given I wait for "20" seconds
 #   And I click the Create Auidt
 #   Examples:
  #    |Username|Password|
  #    |satheesh.kaliappan|Satheesh1|

