package com.fayda.pages;

import org.openqa.selenium.By;
import static com.fayda.utils.ElementUtils.getText;

public class ConfirmationPage {
    private static final By confirmationMessage=By.xpath("//h2[@data-test='complete-header']");

    public static String orderConfirmation(){
        return getText(confirmationMessage);
    }
}
