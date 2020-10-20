Feature: As a user I want to be able to login under different roles
# this is a comment



  Scenario: Login as a sales manager
    Given user is on the login page
    When user logs in
    Then user should see dashboard page


















#Feature: Login
#  User Story: As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
#  Accounts are: librarian, student, admin
#  Scenario: Verify a Librarian should be able to login
#    Given librarian is on the landing (login) page
#    When librarian is enter valid username and password
#    Then librarian click the login button
#    Then librarian should see the dashboard at the new page
#  Scenario: Verify a Student should be able to login
#    Given Student is on the landing (login) page
#    When Student is enter valid username and password
#    Then Student click the login button
#    Then Student should see the dashboard at the new page
#  Scenario: Verify a Admin should be able to login
#    Given Admin is on the landing (login) page
#    When Admin is enter valid username and password
#    Then Admin click the login button
#    Then Admin should see the dashboard at the new page
