package com.xcart.demostore.utility;

import com.xcart.demostore.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Util extends BasePage {

    //click on element
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    //click on element
    public void clickOnElement(WebElement element) {
        element.click();
    }

    //send text to element
    public void sendTextToElement(By by, String str) {
        driver.findElement(by).sendKeys(str);
    }

    //send text to element
    public void sendTextToElement(WebElement element, String str) {
        element.sendKeys(str);
    }

    //get text from element
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    //get text from element
    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    // select by index
    public void select_By_Index(By by, int i) {
        Select s = new Select(driver.findElement(by));
        s.selectByIndex(i);
    }

    //select by index
    public void select_By_Index(WebElement element, int i) {
        Select s = new Select(element);
        s.selectByIndex(i);
    }

    // select by value
    public void select_By_Value(By by, String str) {
        Select s = new Select(driver.findElement(by));
        s.selectByValue(str);
    }

    //select by value
    public void select_By_Value(WebElement element, String str) {
        Select s = new Select(element);
        s.selectByValue(str);
    }

    //select by visible text
    public void select_By_Visible_Text(By by, String txt) {
        Select s = new Select(driver.findElement(by));
        s.selectByVisibleText(txt);
    }

    //select by visible text
    public void select_By_Visible_Text(WebElement element, String txt) {
        Select s = new Select(element);
        s.selectByVisibleText(txt);
    }

    //do mouseover
    public void mouseOver(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }

    //do mouseover
    public void mouseOver(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    //scroll up and down
    public void scrollUpDown(int i) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + i + ")");
    }

    //scroll left and right
    public void scrollLeftRight(int i) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(" + i + ",0)");
    }

    //method to generate random number
    public static int generateRandomNumber() {
        return (int) (Math.random() * 5000 + 1);
    }

    //mouse over on element
    public void mouseOverElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    //click and hold on element
    public void clickAndHold(By by) {
        Actions actions = new Actions(driver);
        actions.clickAndHold(driver.findElement(by)).build().perform();
    }

    //click and hold on element
    public void clickAndHold(WebElement element) {
        Actions actions = new Actions(driver);
        actions.clickAndHold(element).build().perform();
    }

    //drag and drop an element
    public void dragAndDropElement(WebElement fromElement, WebElement toElement) {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(fromElement, toElement).release().perform();
    }

    //drag and drop an element
    public void dragAndDropElement(WebElement element) {
        Actions actions = new Actions(driver);
        driver.switchTo().frame(1);
        actions.dragAndDropBy(element, 135, 40).build().perform();
    }

    //verify that element is displayed
    public boolean verifyThatElementIsDisplayed(By by) {
        WebElement element = driver.findElement(by);
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    //verify that element is displayed
    public boolean verifyThatElementIsDisplayed(WebElement element) {
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    //verify that text is displayed
    public boolean verifyThatTextIsDisplayed(By by, String text) {
        WebElement element = driver.findElement(by);
        if (text.equals(element.getText())) {
            return true;
        } else {
            return false;
        }
    }

    //verify that text is displayed
    public boolean verifyThatTextIsDisplayed(WebElement element, String text) {
        if (text.equals(element.getText())) {
            return true;
        } else {
            return false;
        }
    }

    /*public void waitUntilPresenceOfElementLocated(By by, int timeout) {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
    public void waitUntilPresenceOfElementClickable(By by, int timeout) {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public void waitUntilVisibilityOfElementLocated(By by, int timeout) {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
*/
}