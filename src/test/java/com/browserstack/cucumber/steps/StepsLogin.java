package com.browserstack.cucumber.steps;


import com.browserstack.cucumber.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class StepsLogin extends ScenarioSteps {
    LoginPage loginPage;

    @Step()
    public void homePage() {
        loginPage.open();
    }
    @Step()
    public void clickOnSignIn(){
        loginPage.enterLogin();
    }

    @Step()
    public void loginEmail() {
        loginPage.getLogin();
    }
    @Step()
    public void loginPass(){
        loginPage.getPass();
    }
    @Step()
    public void clickOnLogin(){
        loginPage.clickOnButton();
    }

    @Step
    public void assertLocation() {
        loginPage.assertMyDashboard();
    }





}
