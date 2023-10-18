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
    When Click on sign me up button
    And  Click on continue with Apple button

  @Release
  Scenario: login with email work properly

    Given  Check login button is available in blow
    When Click On Login button
    And Click on continu with Email button
    Then Enter Email in Email text field
    When Click on next button
    Then Input The Password in Password field
    When Click on Log in button
  @Release
  Scenario: explore button
    Given show the explore is display
    When Click On the Text Button
    Then show the Expolore available is display

  @Release
    Scenario: Check the Activity button work properly
    Given  Check login button is available in blow
    When Click On Login button
    And Click on continu with Email button
    Then Enter Email in Email text field
    When Click on next button
    Then Input The Password in Password field
    When Click on Log in button
    Given Check Activity is available in site
    When  Click on Activity button
    Then Show the Activity Page is available in Display
    When Click on Activity button


  @Release
    Scenario: chack the inbox
      Given  Check login button is available in blow
       When Click On Login button
       And Click on continu with Email button
       Then Enter Email in Email text field
       When Click on next button
       Then Input The Password in Password field
       When Click on Log in button
        Given Check the masage button in site
       When Click on Massage button
        Then  Show the inbox are avaolable
       When  Click on again Massage page is  not available in Display

  Scenario Outline:
    Examples:
      | value  |
      | mobile |
