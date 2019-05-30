package com.xcart.demostore.pageobject;

import com.xcart.demostore.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class MyAccount extends Util {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    By myAccountTitle = By.xpath("//h1[@class='title']");

    public boolean verifyThatUserIsNavigatedToMyAccountPage() {
        if (getTextFromElement(myAccountTitle).contains("My account")) {
            return true;
        } else return false;
    }
}
