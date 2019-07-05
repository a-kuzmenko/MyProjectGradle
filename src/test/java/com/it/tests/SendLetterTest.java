package com.it.tests;

import com.it.NewEmail;
import com.it.NewEmailFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SendLetterTest extends BaseTest {
    NewEmail newEmail = NewEmailFactory.getNewEmail();
    //отправить письмо самому себе и проверить что она пришло
    @Test
    public void sendLetter() throws InterruptedException {
        app.login.loginValidUser();

        Thread.sleep(2);
        app.dashboard.clickOnCreateLetter();

        app.newEmail.createLetter(newEmail);

        Assert.assertEquals(app.dashboard.getConfirmation(), "Письмо успешно отправлено адресатам");

        app.dashboard.clickOnIncomingEmail();

        app.dashboard.clickOnIncomingLetter();

        Assert.assertEquals(app.dashboard.getIncomingTheme(), validEmail.getTheme());
        Assert.assertEquals(app.dashboard.getIncomingMessageBody(), validEmail.getText());
    }

    @BeforeTest
    public void deleteLetter(){
        app.dashboard.clickOnIncomingEmail();

        app.dashboard.deleteLetterRecordIfExists(newEmail);
        //Assert.assertFalse(letterRecord, "Letter record should be deleted");

    }
}
