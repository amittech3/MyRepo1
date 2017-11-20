$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("gmailLogin.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Amit Sharma"
    },
    {
      "line": 2,
      "value": "#Email: amittech3@gmail.com"
    }
  ],
  "line": 4,
  "name": "Test Gmail validations",
  "description": "",
  "id": "test-gmail-validations",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "User logs in to Gmail",
  "description": "",
  "id": "test-gmail-validations;user-logs-in-to-gmail",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "Gmail login page is open",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters valid \"sapientexcercise\" and click NEXT button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters \"pass@1234\" and click NEXT button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "smokeTest.open_firefox_and_start_Gmail()"
});
formatter.result({
  "duration": 37302566230,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sapientexcercise",
      "offset": 19
    }
  ],
  "location": "smokeTest.user_enters_valid_and_click_NEXT_button(String)"
});
formatter.result({
  "duration": 3304175843,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pass@1234",
      "offset": 13
    }
  ],
  "location": "smokeTest.user_enters_and_click_NEXT_button(String)"
});
formatter.result({
  "duration": 7167835105,
  "status": "passed"
});
formatter.match({
  "location": "smokeTest.user_is_on_home_page()"
});
formatter.result({
  "duration": 10735685604,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User is able to send the email",
  "description": "",
  "id": "test-gmail-validations;user-is-able-to-send-the-email",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "User is on gmail home page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User open Compose box in gmail",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User enters receivers email address",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User enters Subject line",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enters text in the body",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User clicks on Send button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Message on page will display message Your message has been sent.",
  "keyword": "Then "
});
formatter.match({
  "location": "smokeTest.user_is_on_gmail_home_page()"
});
formatter.result({
  "duration": 21880610233,
  "status": "passed"
});
formatter.match({
  "location": "smokeTest.user_open_Compose_box_in_gmail()"
});
formatter.result({
  "duration": 14574746092,
  "status": "passed"
});
formatter.match({
  "location": "smokeTest.user_enters_receivers_email_address()"
});
formatter.result({
  "duration": 1578165023,
  "status": "passed"
});
formatter.match({
  "location": "smokeTest.user_enters_Subject_line()"
});
formatter.result({
  "duration": 3603982125,
  "status": "passed"
});
formatter.match({
  "location": "smokeTest.user_enters_text_in_the_body()"
});
formatter.result({
  "duration": 3852675063,
  "status": "passed"
});
formatter.match({
  "location": "smokeTest.user_clicks_on_Send_button()"
});
formatter.result({
  "duration": 9713883983,
  "status": "passed"
});
formatter.match({
  "location": "smokeTest.message_on_page_will_display_message_Your_message_has_been_sent()"
});
formatter.result({
  "duration": 3358900126,
  "status": "passed"
});
});