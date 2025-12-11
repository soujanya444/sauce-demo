package com.fayda.pages;

import org.openqa.selenium.By;

import static com.fayda.utils.ElementUtils.click;

public class CartPage {
    private static final By checkoutButton=By.id("checkout");

    public static void continueToCheckout(){

        click(checkoutButton);
    }
}
