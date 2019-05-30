package com.xcart.demostore.basepage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

public class BasePage {
    public static WebDriver driver;

    public BasePage(){
        PropertyConfigurator.configure(System.getProperty("user.dir") + "\\src\\test\\java\\resources\\propertiesfiles\\log4j.properties");
       // PageFactory.initElements(driver, this);
    }
}
