package com.it.helpers;

import com.it.NewEmail;
import com.it.NewEmailFactory;
import com.it.pages.CreateLetterView;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Locatable;

import java.util.*;

public class NewEmailHelper extends CreateLetterView {
    public NewEmailHelper createLetter(NewEmail newLetter) {
        //NewEmail newEmail = NewEmailFactory.getNewEmail();
        setToField(newLetter.getTo());
        setThemeField(newLetter.getTheme());
        setTextField(newLetter.getText());

        clickOnCreateLetter();
        return this;
    }


}
