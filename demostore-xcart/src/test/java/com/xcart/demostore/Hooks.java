package com.xcart.demostore;

import com.xcart.demostore.basepage.BasePage;
import com.xcart.demostore.browserselector.BrowserSelector;
import com.xcart.demostore.properties.LoadProperty;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String browser = loadProperty.getProperty("browser");
    String baseUrl = loadProperty.getProperty("baseUrl");

    @Before
    public void setUP(){
        browserSelector.selectBrowser(browser);
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
