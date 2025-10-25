package com.fayda.pages;

import org.openqa.selenium.By;
import static com.fayda.utils.ElementUtils.click;
import static com.fayda.utils.ElementUtils.getText;

public class HomePage {

    private static final By productItem=By.id("add-to-cart-sauce-labs-backpack");
    private static final By cartCount=By.xpath("//span[@data-test='shopping-cart-badge']");
    private static final By cartIcon=By.xpath("//a[@data-test='shopping-cart-link']");
    private static final By menuButton=By.id("react-burger-menu-btn");
    private static final By logoutButton=By.linkText("Logout");

    public static void addToCart(){
        click(productItem);
        int cartCountValue=Integer.parseInt(getText(cartCount));
        if(cartCountValue==1)
            System.out.println("Product added to cart..");
        click(cartIcon);
    }

    public static void logout(){
        click(menuButton);
        click(logoutButton);
    }
}
