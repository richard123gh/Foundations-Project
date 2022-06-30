Feature: Users of my bug catcher application should be able to login to their respective homepages

    Scenario: As a manager, I want to sign in so i can view my custom home page
    
        Given   the employee is on the login page
        When    the manager enters the correct username
        When    the manager enters the correct password
        When    the employee clicks the login button
        Then    the manager should be redirected to the manager home page

    Scenario: As a tester, I want to sign in so i can view my custom home page

        Given   the employee is on the login page
        When    the tester enters the correct username
        When    the tester enters the correct password
        When    the employee clicks the login button
        Then    the tester should be redirected to the tester home page