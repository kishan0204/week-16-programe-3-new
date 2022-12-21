package com.nopcommerce.cucumber.steps;

import com.nopcommerce.pages.LoginPage;
import com.nopcommerce.pages.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class RegisterSteps {


    @And("^I click on gender tab$")
    public void iClickOnGenderTab() {
        new RegisterPage().setGenderButton();
    }

    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String firstName) {
        new RegisterPage().setFirstName(firstName);
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String lastName) {
        new RegisterPage().setLastName(lastName);
        // Write code here that turns the phrase above into concrete actions


    }

    @And("^i enter dat of birth \"([^\"]*)\"$")
    public void iEnterDatOfBirth(String date) {
        new RegisterPage().setDayOfBirth(date);
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^i enter month of birth \"([^\"]*)\"$")
    public void iEnterMonthOfBirth(String month) {
        new RegisterPage().setMonthOfBirth(month);
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^i enter year of birth \"([^\"]*)\"$")
    public void iEnterYearOfBirth(String year) {
        new RegisterPage().setYearOfBirth(year);
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^i enter email id \"([^\"]*)\"$")
    public void iEnterEmailId(String emailId) {
        new LoginPage().enterEmailId(emailId);
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^i enter company name \"([^\"]*)\"$")
    public void iEnterCompanyName(String companyName) {
        new RegisterPage().setCompanyName(companyName);
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^i enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new RegisterPage().setPasswordField(password);
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^i re enter password \"([^\"]*)\"$")
    public void iReEnterPassword(String reEnterPassword) {
        new RegisterPage().setConformPasswordField(reEnterPassword);
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^i click on set register button$")
    public void iClickOnSetRegisterButton() {
        new RegisterPage().setRegisterButton();
    }

    @Then("^Your registration completed\"([^\"]*)\"Your registration completed$")
    public void yourRegistrationCompletedYourRegistrationCompleted(String arg0) {
        Assert.assertEquals("Register page not diaplayed", "Register",new RegisterPage().getRegisterText());
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I should navigate Register page successfully$")
    public void iShouldNavigateRegisterPageSuccessfully() {
        Assert.assertEquals("Register page not diaplayed", "Register",new RegisterPage().getRegisterText());
    }
}
