package com.tieste;

import org.eclipse.jetty.websocket.api.Session;
import org.openqa.selenium.By;

import java.util.Properties;

public class Login {

    public static String signInButton = "//*[@class='header-controls-menu-item-link fa fa-sign-in is-sign-in']";
    //public static String signInDropDown = "(//a[@class='head-user-dropdown__link'])[1]";
    public static String userEmail = "//*[@id='User_email']";
    public static String userEmailUkrNet = "//div[@class='login']//input[@name='Login']";
    public static String userPassword = "//*[@id='User_password']";
    public static String userPasswordUkrNet = "//div[@class='password']//input[@name='Password']";
    public static String loginButton = "//*[@class='button-submit']";
    public static String loginButtonUkrNet = "//*[@class='submit']";
    public static String linkToUkrNetMailBox ="//*[@class='mails']";

    public static String recoveryButton="//a[text()='Recovery password']";
    public static String userRecoverEmail = "//*[@id='UserRecoveryForm_email']";
    public static String RecoverButton = "//*[@class='register-form__button_submit']";
    public static String MessageOk = "//*[@class='flashes__item']";

    public static String developerNick = "//*[@class='mc-header-sign-profile-name']";
    public static String errorMessageLogin = "//div[@class='js-alert-message alert alert-error']";

    public static String signOut="//a[text()='Sign Out']";
    public static String mailFrom="(//span[contains(text(), 'appPicker')])[1]";
    public static String mailSubject="//a[text()='You have requested password reset from appPicker.com ']";

    //-------------------------------------------------------------------------------------------------
    //--------- buttton Sign in
    public static void pressSignIn() {
        TestHelper.drv.findElement(By.xpath(signInButton)).click();
    }
    public static void pressMailBoxUkrNet() {
        TestHelper.drv.findElement(By.xpath(linkToUkrNetMailBox)).click();
    }
    //++++++++++++++++++++++++++++     fill field in login form: email
    public static void emailField(String value) {
        TestHelper.cyclicElementSearchByXpath(userEmail).sendKeys(value);
        //TestHelper.drv.findElement(By.xpath(userEmail)).sendKeys(value);
    }
    public static void emailFieldUkrNet(String value) {
        TestHelper.cyclicElementSearchByXpath(userEmailUkrNet).sendKeys(value);
        //TestHelper.drv.findElement(By.xpath(userEmail)).sendKeys(value);
    }
    // ------------fill field in login form:  password
    public static void passwordField(String value) {
        TestHelper.drv.findElement(By.xpath(userPassword)).sendKeys(value);
    }
    public static void passwordFieldUkrNet(String value) {
        TestHelper.drv.findElement(By.xpath(userPasswordUkrNet)).sendKeys(value);
    }
    //----------press Login Button
    public static void pressLoginbutton() {
        TestHelper.cyclicElementSearchByXpath(loginButton).click();
       // TestHelper.drv.findElement(By.xpath(loginButton)).click();
    }
    public static void pressLoginbuttonUkrNet() {
        TestHelper.cyclicElementSearchByXpath(loginButtonUkrNet).click();
        // TestHelper.drv.findElement(By.xpath(loginButton)).click();
    }
    //------------------------------------------------------------------------
    //------------Recovery Link
    public static void pressRecoveryPassword() {
        TestHelper.cyclicElementSearchByXpath(recoveryButton).click();
    }
    public static void recoveryEemailField(String value) {
        TestHelper.cyclicElementSearchByXpath(userRecoverEmail).sendKeys(value);
        TestHelper.cyclicElementSearchByXpath(RecoverButton).click();
        TestHelper.slp(5);
    }
    //----------Recovery  message OK
    public static String getMessageOk(String value) {
        return TestHelper.drv.findElement(By.xpath(value)).getText();
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
    public static void signOut() {
        TestHelper.cyclicElementSearchByXpath(signOut).click();
    }
}


//*[@id="778106621"]/div[2]/div/section/ng-include/div/div[4]/div[1]/select






















