package com.tieste;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.tieste.TestHelper.drv;

/**
 * Created by Rusya on 03.08.2016.
 */
public class DevNewsTest {
    public static String userEmail ="lsokolova.ua+d1@gmail.com";
    public static String userPassword ="159753";
    public static String userNick="lsokolova.ua+d1@gmail.com";
    public static String appTitle ="Britannica Kids: Ancient Egypt";
    public static String appID ="447919187";
    public static String textDevNews="Create interest in and awareness of your apps amongst our 500,000 monthly readers! " +
            "Inform our readers of updates and news about your apps. " +
            "These articles are read by thousands of our readers and are posted to our 10,000+ Twitter, " +
            "3,000+ Facebook and 1,000+ Google+ followers.\\n\\nPRICING: $60 per announcement.";
    public static String userPaypal="lsokolova.ua-1@gmail.com";
    public static String userPwdPayPal="Apppicker_557799";

    public static String selectedBOL="The best iPhone apps for actors";

    @Before
    public void beforeDriver(){
        TestHelper.setup(TestHelper.url);
        TestHelper.slp(5);
    }

    @Test
    public void testTitle() {
        Assert.assertEquals("iPhone and iPad apps news and reviews", TestHelper.drv.getTitle());
        System.out.println(TestHelper.drv.getTitle());
        Login.CheckLinks();
    }

    @Test
    public void testOrderDevNews() {

        Login.pressSignIn(userEmail, userPassword);
        System.out.println("ok--------1111----");
        Assert.assertEquals(userNick, Login.getDeveloperNick(Login.developerNick));
        System.out.println(Login.getDeveloperNick(Login.developerNick));
        Assert.assertEquals(appTitle, DevNews.getAppTitle(appTitle));
        System.out.println(DevNews.getAppTitle(appTitle));
        /* DevNews.pressAccessFeaturesButton(appID);
        //Login.CheckLinks();
        DevNews.pressDevNews();

        Assert.assertEquals(drv.findElement(By.xpath("//a[contains(text(),'Dev news')]")).getText(), "Dev news");
        System.out.println(drv.findElement(By.xpath("//a[contains(text(),'Dev news')]")).getText());
        Assert.assertEquals(drv.findElement(By.xpath("//h6")).getText(), "INSTRUCTIONS");
        Assert.assertEquals(drv.findElement(By.xpath("//form/div/label")).getText(), "NEWS:");
        Assert.assertEquals(drv.findElement(By.xpath("//div[@id='app-" + appID + "']/div[2]/div/section/ng-include/div/div/p")).getText(),
                "Create interest in and awareness of your apps amongst our 500,000 monthly readers! Inform our readers of updates " +
                        "and news about your apps. These articles are read by thousands of our readers and are posted to " +
                        "our 10,000+ Twitter, 3,000+ Facebook and 1,000+ Google+ followers.\n\nPRICING: $60 per announcement.");

        DevNews.enterText(textDevNews);
        System.out.println("****************");
        System.out.println("ok------------");

        System.out.println("ok--------2222----");System.out.println("ok--------3333----");
        Login.fillPayPal(userPaypal, userPwdPayPal);


/*
        BestOfList.selectBestOfList(selectedBOL);
        System.out.println("ok--------3333----");

        //TestHelper.drv.findElement(By.xpath("//*[@id='app-447919187']")).submit();
        //TestHelper.drv.findElement(By.xpath("//*[@id='app-388306550']//div[@class='mc-tabs-content-apps-block-data']")).click();
        /*TestHelper.drv.findElement(By.xpath("//section/div[5]/section[3]")).click();


        TestHelper.drv.findElement(By.xpath("//a[contains(text(),'Dev news')]")).click();

        TestHelper.slp(10);
        System.out.println("ok--------1111----");
        TestHelper.slp(5);
       // Assert.assertEquals(drv.getTitle(), "appPicker - Profile");
        System.out.println("****************");*/
        //Assert.assertEquals(drv.findElement(By.cssSelector("b")).getText(), "SUMMARY");

        /*drv.findElement(By.linkText("Dev news")).click();

        drv.findElement(By.id("dev-news-tab-announcement")).clear();
        drv.findElement(By.id("dev-news-tab-announcement")).sendKeys("Create interest in and awareness of your apps amongst our 500,000 monthly readers! Inform our readers of updates and news about your apps. These articles are read by thousands of our readers and are posted to our 10,000+ Twitter, 3,000+ Facebook and 1,000+ Google+ followers.\n\nPRICING: $60 per announcement.");
        drv.findElement(By.xpath("//button[@type='button']")).click();
        System.out.println("****************");




        System.out.println("ok--------2222----");

        System.out.println("ok--------3333----");*/

    }
    @After
    public void afterDriver() {
        TestHelper.quit();
    }
}
