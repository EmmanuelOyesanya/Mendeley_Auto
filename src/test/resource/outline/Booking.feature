Feature:  As a user,
  I want to make new holiday booking
  @booking

  Scenario:  I want to book a 7 days  holiday
    Given  Am on the landing page
    When   I enter my names
    And    Select check-in&check-out date
    Then   should see confirmation


    @booking
    Scenario: booking without deposit
      Given Am on the landing page
      When I enter my First$ Surname
      And I didn't make a deposit nor select date
      Then am unable to make a booking

      @booking
      Scenario:  Booking date validation
        Given Am on the landing page
        And I enter my First$ Surname
        When I select a past date for Check-in and Check-out
        Then I click save








