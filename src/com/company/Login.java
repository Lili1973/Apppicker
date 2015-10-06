package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Login {

    public static String signInButton = "//*[@class='head-user-bar__username']";
    public static String signInDropDown = "(//a[@class='head-user-dropdown__link'])[1]";
    public static String userEmail = "//*[@id='User_email']";
    public static String userPassword = "//*[@id='User_password']";
    public static String loginButton = "//*[@class='button-submit']";


    public static String developerNick = "//*[@class='mc-header-sign-profile-name']";

    public static String errorMessageLogin = "//div[@class='js-alert-message alert alert-error']";




    //public static String //*[@id="778106621"]/div[2]/div/section/ng-include/div/div[4]/div[1]/select

    public static void pressSignIn() {
        //--------- buttton Sign in
        TestHelper.drv.findElement(By.xpath(signInButton)).click();
        // -----------dropdown Link=Sign IN
        TestHelper.drv.findElement(By.xpath(signInDropDown)).click();

    }
    // ------------fill field email
    public static void emailField(String value) {
        TestHelper.cyclicElementSearchByXpath(userEmail).findElement(By.xpath(userEmail)).sendKeys(value);
        //TestHelper.drv.findElement(By.xpath(userEmail)).sendKeys(value);
    }
    // ------------fill field password
    public static void passwordField(String value) {
        TestHelper.drv.findElement(By.xpath(userPassword)).sendKeys(value);
    }

    //----------pressLogin Button
    public static void pressLoginbutton() {
        TestHelper.cyclicElementSearchByXpath(loginButton).click();
       // TestHelper.drv.findElement(By.xpath(loginButton)).click();
    }

    //-----------Get Developer Nick
    public static String getDeveloperNick(String value) {
       // TestHelper.cyclicElementSearchByXpath(value);
        return TestHelper.cyclicElementSearchByXpath(value).getText();
                //TestHelper.drv.findElement(By.xpath(value)).getText();
    }

    //----------Error message
    public static String getErrorMessageLogin(String value) {
        return TestHelper.drv.findElement(By.xpath(value)).getText();
    }

}


//*[@id="778106621"]/div[2]/div/section/ng-include/div/div[4]/div[1]/select






















