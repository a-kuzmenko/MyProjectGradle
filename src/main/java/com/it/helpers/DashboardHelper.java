package com.it.helpers;

import com.it.NewEmail;
import com.it.pages.DashboardView;

import java.util.HashMap;
import java.util.Map;

public class DashboardHelper extends DashboardView {
    public boolean isLetterRecordExists(NewEmail letter) {
        return isLetterRecordPresent(letter);
    }

    public DashboardHelper deleteLetterRecordIfExists(NewEmail letter) {

        boolean letterRecordPresent = isLetterRecordExists(letter);

        if (letterRecordPresent) {

            clickOnDeleteIncomingLetter(letter.getTheme());
        }
        return this;
    }
}
