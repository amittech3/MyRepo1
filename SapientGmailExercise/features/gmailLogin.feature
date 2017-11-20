#Author: Amit Sharma
#Email: amittech3@gmail.com

Feature: Test Gmail validations
  
  Scenario: User logs in to Gmail
    Given Gmail login page is open
    When User enters valid "sapientexcercise" and click NEXT button
    And User enters "pass@1234" and click NEXT button
    Then User is on home page 
    
  Scenario: User is able to send the email
    Given User is on gmail home page
    When User open Compose box in gmail
    And User enters receivers email address
    And User enters Subject line
    And User enters text in the body
    And User clicks on Send button
    Then Message on page will display message Your message has been sent.

