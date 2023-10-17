Feature: Verify Tumblr works properly

  @Release
  Scenario: Verify Tumblr logo works properly
   // Given User Click on Tumblr logo
    # Then User return to the home page


 @Release
   Scenario: Sing up with google work properly
     Given Check sing me up button is available in site section
     When Click on sign me up button
     And Click on continue with Google button

 @Release
   Scenario: Sing up with apple work properly
      Given Check sing me up button is available in site section
       When  Click on sign me up button
      And  Click on continue with Apple button

 @Release
   Scenario: login with email work properly

    Given  Check login button is available in blow
       When  Click On Login button
        And  Click on continu with Email button
        Then  Enter Email in Email text field
        When    Click on next button
        Then  Input The Password in Password field
        When  Click on Log in button
        Then  show the home page is display






  Scenario Outline:
    Examples:
      | value  |
      | mobile |
