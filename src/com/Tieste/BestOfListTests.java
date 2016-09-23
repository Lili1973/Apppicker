package com.tieste;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class BestOfListTests {
    public static String userEmail ="lsokolova.ua+d1@gmail.com";
    public static String userPassword ="159753";
    public static String userNick="lsokolova.ua+d1@gmail.com";
    public static String appTitle ="Britannica Kids: Ancient Egypt";
    public static String appID ="447919187";
    public static String selectedBOL="The best iPhone apps for actors";


   @Before
    public void beforeDriver(){
        TestHelper.setup(TestHelper.url);
    }

    @Test
    public void testOrderBestOfList() {
        Login.pressSignIn(userEmail, userPassword);
        Assert.assertEquals(userNick, Login.getDeveloperNick(Login.developerNick));
        System.out.println(Login.getDeveloperNick(Login.developerNick));
        System.out.println("****************");
        Assert.assertEquals(appTitle, BestOfList.getAppTitle(appTitle));
        System.out.println(BestOfList.getAppTitle(appTitle));
        System.out.println("ok------------");
        BestOfList.pressAccessFeaturesButton(appID);
        System.out.println("ok--------1111----");
        BestOfList.pressBestOfList();
        System.out.println("ok--------2222----");

        BestOfList.selectBestOfList(selectedBOL);
        System.out.println("ok--------3333----");


       /*/ BestOfList.selectPosition("1st - available Oct 10, 2015");*/
    }
    @After
    public void afterDriver(){
        TestHelper.quit();
    }
}
//*[@id="855541857"]/div[1]/div[3]/button[1]