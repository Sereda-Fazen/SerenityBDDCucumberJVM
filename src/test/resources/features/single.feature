Feature: Log In in Account Mowdirect
    User must be created
    As a user I have an account
    I want to log in

    Scenario: Log In in Account Mowdirect
        Given Go to Main Page.
        When Click on the 'Sign in' link in the header.
        When Type 'mowdirect@gmail.com' in the 'Email Address' field.
        When Type '123456' in the 'Password' field.
        When Click on 'Login' button.
        Then I should see title 'My Dashboard'
