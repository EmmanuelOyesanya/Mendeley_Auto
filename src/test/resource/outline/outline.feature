Feature:  As a user,I want to make new holiday booking


  Scenario Outline:  I want to book a 7 days  holiday
    Given  Am on the booking page
    When   I enter my "<Firstname>"
    And    Also enter "<Surname>"
    And    Iinsert  "<Price>"
    And    enter  "<Deposit>"
    And    Select "<Check-in>"
    And    enter the  "<Check-out>" Date
    Then   should save booking
    Examples:
      | Firstname   |Surname    | Price    |   Deposit    |Check-in  | Check-out|
      |Tom          |Bull       |1000      |  true        |17/01/2017|18/01/2017|
      |Tommy        |Java       |1200      |  false       |11/01/2017|13/02/2017|
      |Ayu          |Bulluard   |3000      |  true        |17/01/2017|18/03/2017|
      |Tofi         |scala      |4200      |  false       |19/01/2017|28/05/2017|
      |Aja          |scada      |          |  false       |19/01/2017|28/05/2017|










