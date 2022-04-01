@stories
Feature: Reto Choucair
    As a user, I want to make a new register in Utest.com platform
  @scenario1
  Scenario Outline: Make a new register
    Given than Andres wants to make a new register at Utest.com platform
    When he goes at register form on Utest.com platform
      | firstName | lastName | email | language | password | confirmPassword |
      |<firstName>|<lastName>|<email>|<language>|<password>|<confirmPassword>|
    Then he fills and save all data provided
      | messageConfirm |
      |<messageConfirm>|

    Examples:
      | firstName | lastName | email        | language | password        | confirmPassword | messageConfirm                                                          |
      | Andres    | Burgos   | abf@mail.com | Spanish  | hNsJmS7wm8HiBjr | hNsJmS7wm8HiBjr | Welcome to the world's largest community of freelance software testers! |