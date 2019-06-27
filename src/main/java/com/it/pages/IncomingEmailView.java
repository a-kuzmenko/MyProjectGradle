package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IncomingEmailView extends BasePage {
    @FindBy(xpath="//span[@class='frm'][1]")
    private WebElement incomingLetter;

    public IncomingEmailView clickOnIncomingLetter() {
        incomingLetter.click();
        return this;
    }
}
