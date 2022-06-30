Feature: Managers should be able to create defects so they can assign them to an employee

    Scenario: As a manager, i want to be able to create defects so i can assign them to an employee
        
        Given   the manager is on their correct home page
        When    the manager enters a defect description
        When    the manager enters a tester username
        When    the manager clicks the submit button
        Then    the manager should see an alert that says defect assigned