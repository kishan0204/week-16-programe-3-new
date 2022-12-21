package com.nopcommerce.cucumber.steps;

import com.nopcommerce.pages.DesktopPage;
import com.nopcommerce.pages.RegisterPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class DesktopSteps {
    @When("^I click on Books Page$")
    public void iClickOnBooksPage() {
        new DesktopPage().clickOnBooksTab();
    }

    @When("^I click on Computer Tab$")
    public void iClickOnComputerTab() {
        new DesktopPage().clickOnComputerTab();
    }

    @Then("^I should navigate to computer page successfully$")
    public void iShouldNavigateToComputerPageSuccessfully() {
        Assert.assertEquals("Computers", "Computers",new RegisterPage().getRegisterText());
    }

    @When("^I click on Electronic page$")
    public void iClickOnElectronicPage() {
        new DesktopPage().clickOnElectronicTab();
    }

    @Then("^I should navigate to Electronic page successfully$")
    public void iShouldNavigateToElectronicPageSuccessfully() {
        Assert.assertEquals("Electronics", "Electronics",new RegisterPage().getRegisterText());
    }

    @When("^I click on Apparel page$")
    public void iClickOnApparelPage() {
        new DesktopPage().clickOnApparalTab();
    }

    @Then("^I should navigate to Apparel page successfully$")
    public void iShouldNavigateToApparelPageSuccessfully() {
        Assert.assertEquals("Apparel", "Apparel",new RegisterPage().getRegisterText());
    }

    @When("^I click on Digital Downloads Page$")
    public void iClickOnDigitalDownloadsPage() {
        new DesktopPage().clickOnDigitalDownloadTab();
    }

    @Then("^I should navigate to Digital download page successfully$")
    public void iShouldNavigateToDigitalDownloadPageSuccessfully() {
        Assert.assertEquals("Digital downloads", "Digital downloads",new RegisterPage().getRegisterText());
    }

    @Then("^I should navigate to Books page successfully$")
    public void iShouldNavigateToBooksPageSuccessfully() {
        Assert.assertEquals("Books", "Books",new RegisterPage().getRegisterText());
    }

    @When("^I click on Jewelry page$")
    public void iClickOnJewelryPage() {
        new DesktopPage().clickOnJeweleryTab();
    }

    @Then("^I should navigate to Jewelry page successfully$")
    public void iShouldNavigateToJewelryPageSuccessfully() {
        Assert.assertEquals("Jewelry", "Jewelry",new RegisterPage().getRegisterText());
    }


    @When("^I click on Gifts cards$")
    public void iClickOnGiftsCards() {
        new DesktopPage().clickOnGiftCardsTab();
    }

    @Then("^I should navigate to Gift Cards successfully$")
    public void iShouldNavigateToGiftCardsSuccessfully() {
        Assert.assertEquals("Gift Cards", "Gift Cards",new RegisterPage().getRegisterText());
    }
}
