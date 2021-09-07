@data_tables
Feature: Room_reservation_with_datatables
  Background: user_goes_to_application_login page
    Given user is on the application_login page

  Scenario: user_should_be_able_to_login_with_manager_profile
    Given user enters manager_username and manager_password
    |manager|Manager1!|
    And clicks on login button
    And verify login "manager" is displayed

    Scenario: TC02_user_should_be_able_to_navigate_reservation
      And user navigates to create_room_reservation_page
  Scenario: TC02_user_should_be_able_to_make_reservation
    And user navigates to create_room_reservation_page