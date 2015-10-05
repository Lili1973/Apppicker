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
    //------------Best of List

    public static String appID ="//*[@id='844280848']/div[1]/div[1]/div[2]/div[1]/div/h2";
    public static String accessFeaturesButton ="//*[@id='778106621']/div[1]/div[2]/button[1]";
    public static String bestOfListMC ="//*[@id='778106621']/div[2]/div/ul/li[3]/a";



    //public static String //*[@id="778106621"]/div[2]/div/section/ng-include/div/div[4]/div[1]/select

    public static void pressSignIn() {
        //--------- buttton Sign in
        TestHelper.drv.findElement(By.xpath(signInButton)).click();
        TestHelper.cyclicElementSearchByXpath(signInDropDown);
        // dropdown Link=Sign IN
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
        TestHelper.drv.findElement(By.xpath(loginButton)).click();
    }

    //-----------Get Developer Nick
    public static String getDeveloperNick(String value) {
        TestHelper.cyclicElementSearchByXpath(value);
        return TestHelper.drv.findElement(By.xpath(value)).getText();
    }

    //----------Error message
    public static String getErrorMessageLogin(String value) {
        return TestHelper.drv.findElement(By.xpath(value)).getText();
    }
    //---------DEVELOPE PROFILE----------
    // -----------Get App Title
    public static String getAppTitle(String value) {
        TestHelper.cyclicElementSearchByXpath(value);
        return TestHelper.drv.findElement(By.xpath(value)).getText();
    }
    public static void pressAccessFeaturesButton() {
        TestHelper.drv.findElement(By.xpath(accessFeaturesButton)).click();
    }
    public static void pressBestOfListMissionControl(String value) {
        TestHelper.cyclicElementSearchByXpath(value);
        TestHelper.drv.findElement(By.xpath(value)).click();
    }
    public static void selectBestOfList() {
        WebElement s=TestHelper.drv.findElement(By.xpath("//*[@id='778106621']/div[2]/div/section/ng-include/div/div[4]/div[1]/select"));
                s.click();
        Select sel=new Select(s);
        TestHelper.slp(2);
        sel.selectByVisibleText("The best 4th of July apps for iPhone and iPad");
    }
}


//*[@id="778106621"]/div[2]/div/section/ng-include/div/div[4]/div[1]/select






















