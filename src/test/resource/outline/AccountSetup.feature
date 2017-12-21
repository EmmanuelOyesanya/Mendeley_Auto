    Feature:  As a user, I want to create new account


   Scenario Outline: I want to register for a new account
         Given am on the Landing page
         And I click my Account
         And   I enter my  "<Email>" &"<Password>"
         And    Also select "<Title>"
         And    Iinsert   "<Firstname>" and "<Lastname>"
         And   I pick   "<Date>" "<Month>" "<Year>"
         And I insert   "<MobileNumber>"
        When I  click    Continue
         Then my account is setup
        Examples:
           | Email                 | Password |       Title |  Firstname | Lastname | Date | Month | Year | MobileNumber |
           | Baddo@yahoo.com      |  AskMeDotCome12  |  Mr    | Robinson |  Cucumber |  12 |    7   |  1975 |   07400008909 |