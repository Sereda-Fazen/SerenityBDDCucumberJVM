package com.browserstack.cucumber.steps;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class LoginSteps extends StepsLogin {

    @Steps
    StepsLogin stepsLogin;

    @Given("Go to Main Page.")
    public void homePage()  {
        stepsLogin.homePage();
    }
    @When("Click on the 'Sign in' link in the header.")
    public void getSignIn()  {
        stepsLogin.clickOnSignIn();
    }
    @When("Type 'mowdirect@gmail.com' in the 'Email Address' field.")
    public void getLogin()  {
        stepsLogin.loginEmail();
    }
    @When("Type '123456' in the 'Password' field.")
    public void getPass() {
        stepsLogin.loginPass();
    }
    @When("Click on 'Login' button.")
    public void clickOnLogin(){
        stepsLogin.clickOnLogin();
    }

    @Then("I should see title 'My Dashboard'")
    public void IseeMyDashboard() throws Throwable {
        stepsLogin.assertLocation();
    }

}
