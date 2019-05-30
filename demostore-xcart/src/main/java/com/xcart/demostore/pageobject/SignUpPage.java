package com.xcart.demostore.pageobject;

import com.xcart.demostore.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class SignUpPage extends Util {

    private static final Logger log = LogManager.getLogger(SignUpPage.class.getName());

    By signUpTitle = By.xpath("//span[@class='ui-dialog-title']");
    By newAccountTitle = By.xpath("//span[@id='ui-id-8']");
    By email = By.id("login");
    By password = By.id("password");
    By confirmPassword = By.id("password-conf");
    By createButton = By.xpath("//div[contains(@class,'button submit')]//button[contains(@class,'submit')]");
    By createAccountLink = By.xpath("//a[contains(@class,'popup-button default-popup-button create-account-link')]");

    public boolean verifyThatSignUpWindowIsOpen() {
        if ((getTextFromElement(signUpTitle).contains("Sign in"))) {
            return true;
        } else return false;
    }

    public boolean verifyThatNewAccountWindowIsOpen() {
        if ((getTextFromElement(newAccountTitle).contains("New account"))) {
            return true;
        } else return false;
    }

    public void clickCreateAccountLink() {
        log.info("Click On Create On My Account Tab");
        clickOnElement(createAccountLink);
    }

    public void enterEmail(String str) {
        log.info("Enter Email");
        sendTextToElement(email, str);

    }

    public void enterPassword(String str) {
        log.info("Enter Password");
        sendTextToElement(password, str);
    }

    public void enterConfirmPassword(String str) {
        log.info("Enter Confirm password");
        sendTextToElement(confirmPassword, str);
    }

    public void clickCreateButton() {

        log.info("Click on Create Button");
        clickOnElement(createButton);
    }

}

