package com.fayda.tests;
import com.fayda.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;


public class PlaceOrderTest extends BaseTest{

    @Test
    public void orderTest() {
        LoginPage.login();
        HomePage.addToCart();
        CartPage.continueToCheckout();
        UserPage.submitUserDetails();
        CheckoutPage.finishOrder();
        String message=ConfirmationPage.orderConfirmation();
        Assert.assertEquals(message,"Thank you for your order!");
    }
}
