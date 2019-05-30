package com.xcart.demostore.pageobject;

import com.xcart.demostore.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class HomePage extends Util {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    By signUpButton = By.xpath("//div[contains(@class,'header_bar-sign_in')]//span[contains(text(),'Sign in / sign up')]");
    By hotDeals = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][contains(text(),'Hot deals')]");
    By saleLink = By.xpath("//li[@class='leaf has-sub']//span[contains(text(),'Sale')]");
    By starTrackImage = By.xpath("//img[@alt='Star Trek Command Cycle Jersey']");
    By starTrackPageText = By.xpath("//h1[contains(text(),'Star Trek Command Cycle Jersey')]");

    public void clickSignUp() {
        log.info("Click on Sign Up Link");
        clickOnElement(signUpButton);
    }

    public void mouseOverHotDeals(){
        log.info("Mouse Over Hot Deals");
        mouseOver(hotDeals);
    }

    public void clickOnSaleLink(){
        log.info("Click On Sale Link");
        clickOnElement(saleLink);
    }

    public boolean verifyThatUserIsOnSalePage(){
        log.info("Verify that User Is on Sale Page");
        if(driver.getCurrentUrl().contains("sale_products")){
            return true;
        }
        else return false;
    }

    public void clickOnStarTrackTshirt(){
        log.info("Click on Star Track T-shirt");
        clickOnElement(starTrackImage);
    }

    public boolean verifyThatUserIsOnStarTrackDetailPage(){
        if(getTextFromElement(starTrackPageText).contains("Star Trek Command Cycle Jersey")){
            return true;
        }
        else return false;
    }
}
