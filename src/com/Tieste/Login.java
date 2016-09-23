package com.tieste;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.eclipse.jetty.websocket.api.Session;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Properties;
import java.util.UUID;

import static com.tieste.TestHelper.drv;
import static com.tieste.TestHelper.isElementExist;
import static com.tieste.TestHelper.waitElementByXpath;
import static org.testng.Assert.assertTrue;

public class Login {

    /*   Checked      */
    public static String emailField = "//input[@name='email']";
    public static String userPassword = "//input[@name='password']";
    public static String loginButton = "//button";
    public static String developerNick = "//*[@class='mc-header-sign-profile-name']";

    public static String emailFieldPayPal = "//input[@name='email']";
    public static String userPasswordPayPal = "//input[@name='password']";

    /*   Checked      */


   public static void fillPayPal(String email, String password) {

       //TestHelper.slp(5);
       //WebDriverWait wait = new WebDriverWait(drv, 120);
       //wait.until(ExpectedConditions.titleIs(TestHelper.drv.getTitle()));
       TestHelper.slp(15);
       drv.switchTo().frame("injectedUl");
       TestHelper.drv.findElement(By.id("email")).clear();

       //TestHelper.drv.findElement(By.id("email")).sendKeys("lsokolova.ua-1@gmail.com");
       TestHelper.cyclicElementSearchByXpath("//*[@id='email']").sendKeys(email);
       TestHelper.slp(5);
       //TestHelper.drv.findElement(By.xpath("//*[@id='password']")).sendKeys("Apppicker_557799");

       TestHelper.cyclicElementSearchByXpath("//*[@id='password']").clear();
       TestHelper.cyclicElementSearchByXpath("//*[@id='password']").sendKeys(password);
       TestHelper.drv.findElement(By.xpath("//*[@id='btnLogin']")).submit();
       //TestHelper.cyclicElementSearchByXpath("//*[@id='btnLogin']").click();
       TestHelper.slp(15);
       //TestHelper.cyclicElementSearchByXpath("//input[@id='confirmButtonTop']").click();
       System.out.println("View PayPal Policies and your payment method rights.");
       drv.switchTo().defaultContent();
       waitElementByXpath("//*[@id='confirmButtonTop']");
       TestHelper.drv.findElement(By.xpath("//*[@id='confirmButtonTop']")).click();
       TestHelper.slp(10);System.out.println("View PayPal Policies and your payment method rights.");
   }
/*
    public static String signInButton = "(//*[@class='header-controls-menu-item-link'])[1]";

    public static String linkToUkrNetMailBox = "//input[@name='email']";

    //-------------------------------------------
    //public static String signInDropDown = "(//a[@class='head-user-dropdown__link'])[1]";

    public static String userEmailUkrNet = "//div[@class='login']//input[@name='Login']";

    public static String userPasswordUkrNet = "//div[@class='password']//input[@name='Password']";

    public static String loginButtonUkrNet = "//*[@class='submit']";


    public static String recoveryButton = "//a[text()='Recovery password']";
    public static String userRecoverEmail = "//*[@id='UserRecoveryForm_email']";
    public static String RecoverButton = "//*[@class='register-form__button_submit']";
    public static String MessageOk = "//*[@class='flashes__item']";


    public static String errorMessageLogin = "//div[@class='js-alert-message alert alert-error']";

    //public static String signOut = "//a[text()='Sign Out']";
    public static String mailFrom = "(//span[contains(text(), 'appPicker')])[1]";
    public static String mailSubject = "//a[text()='You have requested password reset from appPicker.com ']";*/

    //-------------------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------------
    //--------- buttton Sign in
   /* public static void pressSignIn() {
        TestHelper.slp(3);
        System.out.println(signInButton);
        TestHelper.drv.findElement(By.xpath(signInButton)).click();
        System.out.println(signInButton);
        //TestHelper.drv.findElement(By.xpath(linkToUkrNetMailBox)).click();TestHelper.waitElementnew(emailField).click();
    }*/

    public static void pressSignIn(String email, String password) {
        TestHelper.drv.findElement(By.linkText("Sign in")).click();
        // fill field in login form: email
        TestHelper.cyclicElementSearchByXpath(emailField).clear();
        TestHelper.cyclicElementSearchByXpath(emailField).sendKeys(email);
        // fill field in login form:  password
        TestHelper.cyclicElementSearchByXpath(userPassword).clear();
        TestHelper.cyclicElementSearchByXpath(userPassword).sendKeys(password);
        //press Login Button
        TestHelper.cyclicElementSearchByXpath(loginButton).click();
    }

    //-----------Get Developer Nick
    public static String getDeveloperNick(String value) {
        return TestHelper.cyclicElementSearchByXpath(value).getText();
    }


    public static void CheckLinks() {

        //Find total No of links on page and print In console.
        List<WebElement> total_links = drv.findElements(By.tagName("a"));
        System.out.println("Total Number of links found on page = " + total_links.size());
        //for loop to open all links one by one to check response code.
        boolean isValid = false;
        for (int i = 0; i < total_links.size(); i++) {
            String url = total_links.get(i).getAttribute("href");

            if (url != null) {

                //Call getResponseCode function for each URL to check response code.
                isValid = getResponseCode(url);

                //Print message based on value of isValid which Is returned by getResponseCode function.
                if (isValid) {
                    System.out.println("Valid Link:" + url);
                    System.out.println("----------XXXX-----------XXXX----------XXXX-----------XXXX----------");
                    System.out.println();
                } else {
                    System.out.println("Broken Link ------> " + url);
                    System.out.println("----------XXXX-----------XXXX----------XXXX-----------XXXX----------");
                    System.out.println();
                }
            } else {
                //If <a> tag do not contain href attribute and value then print this message
                System.out.println("String null");
                System.out.println("----------XXXX-----------XXXX----------XXXX-----------XXXX----------");
                System.out.println();
                continue;
            }
        }
    }

            //Function to get response code of link URL.
            //Link URL Is valid If found response code = 200.
            //Link URL Is Invalid If found response code = 404 or 505.
    public static boolean getResponseCode(String chkurl) {
        boolean validResponse = false;
        try {
            //Get response code of URL
            HttpResponse urlresp = new DefaultHttpClient().execute(new HttpGet(chkurl));
            int resp_Code = urlresp.getStatusLine().getStatusCode();
            System.out.println("Response Code Is : "+resp_Code);
            if ((resp_Code == 404) || (resp_Code == 505)) {
                validResponse = false;
            } else {
                validResponse = true;
            }
            } catch (Exception e) {
            }
            return validResponse;
        }

    /* DELETEDDELETEDDELETEDDELETEDDELETEDDELETEDDELETEDDELETEDDELETEDDELETEDDELETEDDELETEDDELETEDDELETED */

/* DELETEDDELETEDDELETEDDELETEDDELETEDDELETEDDELETEDDELETEDDELETEDDELETEDDELETEDDELETEDDELETEDDELETED */

/*public static void pressMailBoxUkrNet() {
    public static void emailFieldUkrNet(String value) {
        TestHelper.cyclicElementSearchByXpath(userEmailUkrNet).sendKeys(value);
        //TestHelper.drv.findElement(By.xpath(userEmail)).sendKeys(value);
    }*/


  /*public static void passwordFieldUkrNet(String value) {
        TestHelper.drv.findElement(By.xpath(userPasswordUkrNet)).sendKeys(value);
    }*/


   /* public static void pressLoginbuttonUkrNet() {
        TestHelper.cyclicElementSearchByXpath(loginButtonUkrNet).click();
        // TestHelper.drv.findElement(By.xpath(loginButton)).click();
    }*/


    private static String randomEmail() {
        return "random-" + UUID.randomUUID().toString() + "@example.com";
    }
}




















