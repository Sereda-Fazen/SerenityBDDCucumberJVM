package com.browserstack.cucumber.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://mowdirect.co.uk")
public class LoginPage extends PageObject {

    @FindBy(css="#md_top_links_ul > li:nth-of-type(3) > a:nth-of-type(1)")
    WebElementFacade signIn;

    @FindBy(css= "#email")
    WebElementFacade login;

    @FindBy(css="#pass")
    WebElementFacade pass;

    @FindBy(css="[name='send'] > span > span")
    WebElementFacade send;

    @FindBy(css=".page-title")
    WebElementFacade dashboard;

    public void enterLogin() {
        clickOn(signIn);
        waitForTextToAppear("Already registered?");
    }

    public void getLogin() {
        enter("mowdirect@gmail.com").into(login);
    }
    public void getPass() {
        enter("123456").into(pass);
    }

    public void clickOnButton() { clickOn(send);
    }

    public void assertMyDashboard() {
        element(dashboard).shouldContainOnlyText("My Dashboard");
    }
}
