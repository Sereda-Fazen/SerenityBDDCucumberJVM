package com.browserstack.cucumber;



import com.browserstack.BrowserStackSerenityDriver;
import com.browserstack.BrowserStackSerenityTest;
import com.browserstack.cucumber.steps.LoginSteps;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/single.feature")
public class SingleTest extends BrowserStackSerenityTest {

    @Steps
    LoginSteps login;

    @Test
    public void loginSuccess() throws Throwable {
        login.homePage();
        login.getSignIn();
        login.getLogin();
        login.getPass();
        login.clickOnLogin();
        login.IseeMyDashboard();
    }
}
