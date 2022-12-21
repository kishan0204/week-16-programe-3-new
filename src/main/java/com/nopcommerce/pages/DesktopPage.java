package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    public DesktopPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[text()='Computers ']")
    WebElement computerTab;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Electronics ']")
    WebElement electronicTab;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Apparel ']")
    WebElement apparalTab;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Digital downloads ']")
    WebElement digitalDownloadTab;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Books ']")
    WebElement booksTab;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Jewelry ']")
    WebElement jeweleryTab;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Gift Cards ']")
    WebElement giftCardsTab;


    public void clickOnComputerTab() {
        clickOnElement(computerTab);
        log.info("Click on the Computer Tab : " + computerTab.toString());
    }

    public void clickOnElectronicTab() {
        clickOnElement(electronicTab);
        log.info("Click on the Electronic Tab : " + electronicTab.toString());
    }

    public void clickOnApparalTab() {
        clickOnElement(apparalTab);
        log.info("Click on the Apparal Tab : " + apparalTab.toString());
    }

    public void clickOnDigitalDownloadTab() {
        clickOnElement(digitalDownloadTab);
        log.info("Click on the Digital Download Tab : " + digitalDownloadTab.toString());
    }

    public void clickOnBooksTab() {
        clickOnElement(booksTab);
        log.info("Click on the Books Tab : " + booksTab.toString());
    }

    public void clickOnJeweleryTab() {
        clickOnElement(jeweleryTab);
        log.info("Click on the Jewelery Tab : " + jeweleryTab.toString());
    }

    public void clickOnGiftCardsTab() {
        clickOnElement(giftCardsTab);
        log.info("Click on the Gift Cards Tab : " + giftCardsTab.toString());
    }
}
