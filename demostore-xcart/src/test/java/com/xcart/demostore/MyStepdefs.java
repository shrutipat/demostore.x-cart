package com.xcart.demostore;

import com.xcart.demostore.pageobject.HomePage;
import com.xcart.demostore.pageobject.MyAccount;
import com.xcart.demostore.pageobject.SignUpPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    SignUpPage signUpPage = new SignUpPage();
    MyAccount myAccount = new MyAccount();

    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on sign in or sign up link$")
    public void iClickOnSignInOrSignUpLink() throws InterruptedException {
        homePage.clickSignUp();
        Thread.sleep(2000);
    }

    @Then("^Sign in window should open successfully$")
    public void signInWindowShouldOpenSuccessfully() {
        signUpPage.verifyThatSignUpWindowIsOpen();
    }

    @Given("^I am on sign in window$")
    public void iAmOnSignInWindow() {
        homePage.clickSignUp();
    }

    @When("^I click on create new account link$")
    public void iClickOnCreateNewAccountLink() throws InterruptedException {
        signUpPage.clickCreateAccountLink();
        Thread.sleep(1000);
    }

    @Then("^New Account window should open successfully$")
    public void newAccountWindowShouldOpenSuccessfully() {
        signUpPage.verifyThatNewAccountWindowIsOpen();
    }

    @Given("^I am on new account window$")
    public void iAmOnNewAccountWindow() throws InterruptedException {
        homePage.clickSignUp();
        Thread.sleep(100);
        signUpPage.clickCreateAccountLink();
    }

    @When("^I enter email address \"([^\"]*)\"$")
    public void iEnterEmailAddress(String email) {
        signUpPage.enterEmail(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        signUpPage.enterPassword(password);
    }

    @And("^I enter confirm password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String confirm) {
        signUpPage.enterConfirmPassword(confirm);
    }

    @And("^I click on create button$")
    public void iClickOnCreateButton() {
        signUpPage.clickCreateButton();
    }

    @Then("^I should navigate to My Account Page successfully$")
    public void iShouldNavigateToMyAccountPageSuccessfully() {
        myAccount.verifyThatUserIsNavigatedToMyAccountPage();
    }

    @When("^I mouse over on Hot Deals in top menu$")
    public void iMouseOverOnHotDealsInTopMenu() throws InterruptedException{
        homePage.mouseOverHotDeals();
        Thread.sleep(100);
    }

    @And("^I click on sale Link$")
    public void iClickOnSaleLink() {
        homePage.clickOnSaleLink();
    }

    @Then("^I should navigate to sale page successfully$")
    public void iShouldNavigateToSalePageSuccessfully() {
        Assert.assertTrue(homePage.verifyThatUserIsOnSalePage());
    }

    @Given("^I am on sale page$")
    public void iAmOnSalePage() {
        homePage.mouseOverHotDeals();
        homePage.clickOnSaleLink();
    }

    @When("^I click on Star Trek Command Cycle Jersey$")
    public void iClickOnStarTrekCommandCycleJersey() {
        homePage.clickOnStarTrackTshirt();
    }

    @Then("^I should navigate to Star Trek Command Cycle Jersey Successfully$")
    public void iShouldNavigateToStarTrekCommandCycleJerseySuccessfully() {
        homePage.verifyThatUserIsOnStarTrackDetailPage();
    }
}
