Feature: Verify Tumblr works properly


  Background:
         Given  Check login button is available in blow
         When Click On Login button
         And Click on continu with Email button
         Then Enter Email in Email text field
         When Click on next button
         Then Input The Password in Password field
         When Click on Log in button
         Then Show the Home Page is available in Display


  @Release
     Scenario: Check the Activity button work properly
        Given Check Activity is available in site
        When  Click on Activity button
        Then Show the Activity Page is available in Display

  @Release
    Scenario: explore button
       Given show the explore is display
       When Click On the explore Button
       Then show the Expolore available is display


  @Release
  Scenario:check the Message button is work
    Given Show mesage button  is available in site
    When Click on the message button
    Then Show the message box  is available in Display

  @Release
    Scenario:check the inbox button is work
        Given Show Inbox button  is available in site
        When Click the Inbox button
        Then Show the inbox  is available in Display

  @Release
    Scenario:check the account button is work
        Given Show account button  is available in site
        When Click on the account button
        Then Show the account sub menu is available in Display
  @Release
    Scenario:check the like button is work
       Given Show account button  is available in site
       When Click on the account button
       Then Show the account sub menu is available in Display
       When Click on the like button
       Then  show the all post and like

  @Release
    Scenario:check the following button is work
      Given Show account button  is available in site
      When Click on the account button
      Then Show the account sub menu is available in Display
      When Click on the following button
      Then  show the all following page is available in Display
  @Release
     Scenario:check the setting button is work
       Given Show setting button  is available in site
       When Click on the setting button
       Then Show the setting is available in Display

  @Release
  Scenario:check the TumblrMart is work
    Given Show TumblrMart button  is available in site
    When Click on the TumblrMart button
    Then Show the TumblrMartis available in Display

  @Release
    Scenario:check the Go a domain is work
      Given Show Go a domain button  is available in site
      When Click on the Go a domain button
      Then Show the Go a domain is available in Display
  @Release
    Scenario:check the create button is work
       Given Show the create button  is available in site
       When Click on the create button
       Then Show the post type is available in Display
  @Release
    Scenario:check the GoAdd_free button is work
      Given Show the GoAdd_free button  is available in site
      When Click on the GoAdd_free button
     Then Show the Ad-Free Browsing is available in Display




  Scenario Outline:
    Examples:
      | value  |
      | mobile |
