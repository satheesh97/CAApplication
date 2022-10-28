
Feature: launch the CS Application

  @local @reg
  Scenario Outline: log in Application
    Given I Enter the "<Username>" and "<Password>"
    #Given I wait for "20" seconds
    Given  wait for "20" seconds
    And I  click the menu "Audits"
    And Click the button "Create Audit"
    And I fill the Audit form
    Then Click the button "Submit" and Wait
   # Then Click the button "Submit"

    Examples:
      |Username|Password|
      |satheesh.kaliappan|Satheesh1|




  Scenario Outline: log in Application1
    Given I Enter the "<Username>" and "<Password>"
    #Given I wait for "20" seconds
    Given  wait for "20" seconds
    And I  click the menu "Audits"
    And Click the Create "Create Audit"
    And I fill the Audit form

    Examples:
      |Username|Password|
      |satheesh.kaliappan|Satheesh1|