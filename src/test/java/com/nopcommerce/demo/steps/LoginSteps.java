package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {

    @Then("verify that {string} message display")
    public void verifyThatMessageDisplay(String message) {

    }

    @Given("Click on login link")
    public void clickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Given("I open the application")
    public void iOpenTheApplication() {
    }

    @When("I click on the login link")
    public void iClickOnTheLoginLink() {
    }

    @And("I enter {string} in the email field")
    public void iEnterInTheEmailField(String email) {
        new LoginPage().enterEmailId(email);

    }

    @And("I enter {string} in the password field")
    public void iEnterInThePasswordField(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on the login button")
    public void iClickOnTheLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should see the {string} error message")
    public void iShouldSeeTheErrorMessage(String errorMessage) {
        Assert.assertEquals(new LoginPage().getErrorMessage(),errorMessage);
    }

    @Then("I should see the logout link")
    public void iShouldSeeTheLogoutLink() {
        new LoginPage().clickOnLoginButton();
    }

    @When("I click on the logout link")
    public void iClickOnTheLogoutLink() {
    }

    @Then("I should see the login link")
    public void iShouldSeeTheLoginLink() {
    }

    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
    }

    @Then("I should navigate to login page successfully")
    public void iShouldNavigateToLoginPageSuccessfully() {
    }

    @And("I enter email {string}")
    public void iEnterEmail(String arg0) {
    }

    @And("I enter password {string}")
    public void iEnterPassword(String arg0) {
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
    }

    @Then("I should verify the error message {string}")
    public void iShouldVerifyTheErrorMessage(String arg0) {
    }

    @Then("I should verify logout link is display")
    public void iShouldVerifyLogoutLinkIsDisplay() {
    }

    @And("I click on logout button")
    public void iClickOnLogoutButton() {
    }

    @Then("I should verify login link is display")
    public void iShouldVerifyLoginLinkIsDisplay() {
    }

    @Then("Navigate to LoginPage")
    public void navigateToLoginPage() {
    }

    @And("Enter EmailId {string}")
    public void enterEmailId(String arg0) {
    }

    @And("Enter Password {string}")
    public void enterPassword(String arg0) {
    }

    @And("Click on Login Button")
    public void clickOnLoginButton() {
    }

    @Then("Verify that the Error message")
    public void verifyThatTheErrorMessage() {
    }

    @Then("Verify that LogOut link is display")
    public void verifyThatLogOutLinkIsDisplay() {
    }

    @And("Click on LogOut Link")
    public void clickOnLogOutLink() {
    }

    @Then("Verify that LogIn Link Display")
    public void verifyThatLogInLinkDisplay() {
    }
}

