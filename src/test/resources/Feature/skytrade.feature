Feature: Sky Trade Website Functionality

  Scenario: User visits the Sky Trade website
    Given User wants to explore Sky Trade
    When User visits Skytrade url
    Then User lands on home page

  Scenario: Validate Products Dropdown
    Given User is in the Sky Trade Home Page
    When User clicks on Products dropdown
    Then User should see all the 4 options in the Products drop down

  Scenario: Validate Products Dropdown when no options are available
    Given User is in the Sky Trade Home Page
    When User clicks on Products dropdown
    Then User cannot see any options in the Products drop down

  Scenario: Validate Solutions Dropdown
    Given User is in the Sky Trade Home Page
    When User clicks on Solutions dropdown
    Then User should see all the 4 options in the Solutions drop down

  Scenario: Validate Solutions Dropdown when no options are available
    Given User is in the Sky Trade Home Page
    When User clicks on Solutions dropdown
    Then User cannot see any options in the Solutions drop down

  Scenario: Validate Login icon
    Given User is in the Sky Trade Home Page
    When User clicks on Login icon
    Then User gets navigated to the login page

  Scenario: Validate Login icon should not navigate to login page
    Given User is in the Sky Trade Home Page
    When User clicks on Login icon
    Then User should not be navigated to the login page

  Scenario: Validate "Claim Airspace" icon
    Given User is in the Sky Trade Home Page
    When User clicks on "Claim Airspace" icon
    Then User gets navigated to the login page

  Scenario: Validate "Claim Airspace" icon should not navigate to login page
    Given User is in the Sky Trade Home Page
    When User clicks on "Claim Airspace" icon
    Then User stays on the same page

  Scenario: Choose Buy Airspace option from Products dropdown
    Given User is in the Sky Trade Home Page
    When User clicks on Products dropdown
    And User clicks on "Buy Airspace" option
    Then User gets scrolled to the Buy Airspace icon

  Scenario: Choose "Buy Airspace" icon
    Given User is in the Sky Trade Home Page
    When User chooses Buy Airspace from the Products dropdown
    And User clicks on "Buy Airspace" option
    Then User gets navigated to the login page

  Scenario: Check user registration functionality
    Given User is in the Sky Trade Home Page
    When User clicks on Register icon
    Then User gets navigated to the Register page

  Scenario: Check user login functionality with valid email address
    Given User is on Login Page
    When User enters valid email address and clicks "Continue with Email" button
    Then User should be able to Login Successfully

  Scenario: Check user registration using Google account
    Given User is in Login page
    When User clicks Google icon
    And User chooses the gmail account
    Then User gets navigated to the Individual or Corporate option page

  Scenario: Check user able to choose Individual option
    Given User chooses the google account to login
    When User clicks Individual option
    Then User gets navigated to the personal details page

  Scenario: Check user can enter account details
    Given User chooses Individual option
    When User enters valid Name and Phone Number and clicks submit
    Then User gets navigated to the Sky Trade Dashboard page

  Scenario: Check user able to view the Account Balance
    Given User is in the Dashboard Page
    When User clicks Balance square box
    Then User gets navigated to the Wallet Page

  Scenario: Check user able to choose My Airspace option
    Given User is in the Dashboard Page
    When User clicks "My Airspace"
    Then User gets navigated to the Airspace page

  Scenario: Check user able to view User Geographics pie chart
    Given User is in the Dashboard Page
    When User scrolls down the dashboard page
    Then User able to see the User Geographics pie chart
