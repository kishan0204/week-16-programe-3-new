package com.nopcommerce.cucumber.steps;

import com.nopcommerce.pages.HomePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;


public class LoginSteps {

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on register link$")
    public void register() {
        new HomePage().clickOnRegisterLink();
    }

    @And("^I enters following users details$")
    public void iEntersFollowingUsersDetails(DataTable dataTable) {
       List<List<String>> userList = dataTable.asLists(String.class);
        for (List<String> e: userList ) {
            System.out.println(e);
            System.out.println(e.get(0));

        }
    }

    @Then("^registration successful$")
    public void registrationSuccessful() {
    }
}
