package com.fayda.tests;

import com.fayda.pages.HomePage;
import com.fayda.pages.LoginPage;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest{

    @Test
    public void logoutTest(){
        LoginPage.login();
        HomePage.logout();
    }
}
