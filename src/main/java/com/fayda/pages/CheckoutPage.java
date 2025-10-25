package com.fayda.pages;

import org.openqa.selenium.By;

import static com.fayda.utils.ElementUtils.click;

public class CheckoutPage {
    private static final By finishButton=By.id("finish");

    public static void finishOrder(){
        click(finishButton);
    }
}
