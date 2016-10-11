package com.browserstack.cucumber;

import com.browserstack.cucumber.steps.LoginSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.io.IOException;


public class BeforeTest {


    @Managed(driver = "chrome")

    public WebDriver driver;
    public String ChromePath = "/home/alex/IdeaProjects/serenity-browserstack/chromedriver";

    @Steps
    LoginSteps login;

    @Before
    public void myTest() throws Exception {

        System.setProperty("webdriver.chrome.driver", ChromePath);

    }
    @After
    public void close() throws IOException {
        driver.close();
    }
}

