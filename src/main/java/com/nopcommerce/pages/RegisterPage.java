package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(css = "div[class='page-title'] h1")
    WebElement registerText;

    @CacheLookup
    @FindBy(id = "gender-male")
    WebElement genderButton;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement dayOfBirthField;

    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement monthOfBirthField;

    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement yearOfBirthField;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Company")
    WebElement companyNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField1;

    @CacheLookup
    @FindBy(name = "ConfirmPassword")
    WebElement conformPasswordField;

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;


    public String getRegisterText() {
        String message = getTextFromElement(registerText);
        log.info("Get register text: " + registerText.toString());
        return message;
    }

    public void setGenderButton() {
        clickOnElement(genderButton);
        log.info("Enter Gender : " + genderButton.toString());
    }

    public void setFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
        log.info("Enter Firstname : " + firstNameField.toString());
    }

    public void setLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
        log.info("Enter last name : " + lastNameField.toString());
    }

    public void setDayOfBirth(String dayOfBirth) {
        sendTextToElement(dayOfBirthField, dayOfBirth);
        log.info("Enter day of birth : " + dayOfBirthField.toString());
    }

    public void setMonthOfBirth(String monthOfBirth) {
        sendTextToElement(monthOfBirthField, monthOfBirth);
        log.info("Enter month of birth : " + monthOfBirthField.toString());
    }

    public void setYearOfBirth(String yearOfBirth) {
        sendTextToElement(yearOfBirthField, yearOfBirth);
        log.info("Enter year of birth : " + yearOfBirthField.toString());
    }

    public void setCompanyName(String companyName) {
        sendTextToElement(companyNameField, companyName);
        log.info("Enter company name  : " + companyNameField.toString());
    }

    public void setPasswordField(String passwordField) {
        sendTextToElement(passwordField1, passwordField);
        log.info("Enter password : " + passwordField1.toString());
    }

    public void setConformPasswordField(String conformPassword) {
        sendTextToElement(conformPasswordField, conformPassword);
        log.info("Enter pasword : " + conformPasswordField.toString());
    }

    public void setRegisterButton() {
        clickOnElement(registerButton);
        log.info("Click on register button : " + registerButton.toString());
    }

}