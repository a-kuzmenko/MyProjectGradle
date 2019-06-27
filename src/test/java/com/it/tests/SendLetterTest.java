package com.it.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SendLetterTest extends BaseTest {
    //отправить письмо самому себе и проверить что она пришло
    @Test
    public void login() throws InterruptedException {
        app.login.loginValidUser();

        Thread.sleep(2);
        app.dashboard.clickOnCreateLetter();

        app.newEmail.createLetter();

        Assert.assertEquals(app.dashboard.getConfirmation(), "Письмо успешно отправлено адресатам");

        app.dashboard.clickOnIncomingEmail();

        app.dashboard.clickOnIncomingLetter();

        Assert.assertEquals(app.dashboard.getIncomingTheme(), validEmail.getTheme());
        Assert.assertEquals(app.dashboard.getIncomingMessageBody(), validEmail.getText());
    }
}
