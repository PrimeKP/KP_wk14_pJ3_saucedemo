package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTestClass {

    LoginPage loginPage = new LoginPage();

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){

        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();

        String expectedMessage = "PRODUCTS";
        Assert.assertEquals(loginPage.verifyTheTextProduct(), expectedMessage, "Message not displayed");

    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){

        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();


        int expectedNumberOfProducts = 6;
        Assert.assertEquals(loginPage.getNumberOfProductDisplayed(), expectedNumberOfProducts, "Number of Products not Matching");
    }


}
