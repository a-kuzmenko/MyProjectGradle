package com.it.tests;

import com.it.*;
import org.testng.annotations.AfterSuite;

public abstract class BaseTest {
    Users validUser = UserFactory.getValidUser();
    NewEmail validEmail = NewEmailFactory.getNewEmail();

    App app = new App();

    @AfterSuite
    public void tearDown() {
        app.commonHelper.stopApp();
    }
}
