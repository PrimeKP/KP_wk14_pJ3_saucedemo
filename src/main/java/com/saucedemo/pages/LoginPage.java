package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage extends Utility {

    By userNameLink = By.id("user-name");
    By passwordLink = By.id("password");
    By loginButton = By.id("login-button");
    By verifyText = By.xpath("//span[@class='title']");

    By noOfProduct = By.xpath("//div[@class='inventory_item_name']");


    public void enterUserName(String userNameText) {
        sendTextToElement(userNameLink, userNameText);
    }

    public void enterPassword(String passwordText){
        sendTextToElement(passwordLink, passwordText);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public String verifyTheTextProduct(){
        return getTextFromElement(verifyText);
    }

    public int getNumberOfProductDisplayed(){
        List<WebElement> list = driver.findElements(noOfProduct);
        System.out.println("Number of Proudcts desplayed = " + list.size());
        return list.size();


    }

}
