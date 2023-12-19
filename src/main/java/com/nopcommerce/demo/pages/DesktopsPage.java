package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage extends Utility {

    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());

    public DesktopsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "(//h1[normalize-space()='Desktops'])[1]")
    WebElement desktopsText;

    @CacheLookup
    @FindBy(css = "body > div:nth-child(7) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")
    WebElement buildYourComputer;

    public String getDesktopText() {
        log.info("Getting desktop page " + desktopsText.toString());
        return getTextFromElement(desktopsText);
    }

    public void clickOnBuildYourComputer() {
        log.info("Click on Build Computer " + buildYourComputer.toString());
        clickOnElement(buildYourComputer);
    }
}

