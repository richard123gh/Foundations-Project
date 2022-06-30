Feature: Testers should be able to view defects so they can begin working on them

    Scenario: As a tester, i want to view defects assigned to me so i can begin working on them

        Given   the tester is on their correct home page
        When    the tester looks at the table
        Then    the tester should see pending defects assigned to them