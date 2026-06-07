Feature: PHPTravels Login Module

@Smoke

Scenario Outline: Login Validation

Given user launches browser
When user enters "<username>" and "<password>"
And clicks on login button
Then validate login result

Examples:
| username         | password |
| invalid@gmail.com| invalid  |
| test@gmail.com   | test123  |
| hello@gmail.com  | hello123 |