Feature: Testers should be able to update defects so they can monitor their progress

    Scenario: As a tester, i want to be able to change assigned defects deemed low priority from pending to declined

        Given   the tester is on their correct home page
        When    the tester selects declined from the status dropdown menu
        When    the tester clicks the update defect button
        Then    A status alert should declare the defect updated from pending to declined
        
    Scenario: As a tester, i want to be able to change assigned defects deemed valid from pending to accepted

        Given   the tester is on their correct home page
        When    the tester selects accepted from the status dropdown menu
        When    the tester clicks the update defect button
        Then    A status alert should declare the defect updated from pending to accepted

    Scenario: As a tester, i want to be able to submit results from accepted defects as rejected

        Given   the tester is on their correct home page
        When    the tester selects rejected from the status dropdown menu
        When    the tester clicks the update defect button
        Then    A status alert should declare the defect updated from accepted to rejected

    Scenario: As a tester, i want to be able to submit results from accepted defects as fixed
        Given   the tester is on their correct home page
        When    the tester selects fixed from the status dropdown menu
        When    the tester clicks the update defect button
        Then    A status alert should declare the defect updated from accepted to fixed

    Scenario: As a tester, i want to be able to submit results from accepted defects as shelved

        Given   the tester is on their correct home page
        When    the tester selects shelved from the status dropdown menu
        When    the tester clicks the update defect button
        Then    A status alert should declare the defect updated from accepted to shelved