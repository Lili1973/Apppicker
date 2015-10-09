package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AppFreeOnSaleTests {

    public static String appID ="855541857";

    @Before
    public void beforeDriver(){
        TestHelper.setup(TestHelper.url);
        }

    @Test
    public void testOrderAppFreeOnSale() {
        Login.pressSignIn();
        Login.emailField("apppicker_developer@ukr.net");
        Login.passwordField("apppicker_developer");
        Login.pressLoginbutton();

        Assert.assertEquals("Lilia_developer", Login.getDeveloperNick(Login.developerNick));
        System.out.println(Login.getDeveloperNick(Login.developerNick));

        Assert.assertEquals("Benjamin Afterburner HD", BestOfList.getAppTitle(appID));
        System.out.println(BestOfList.getAppTitle(appID));

        BestOfList.pressAccessFeaturesButton(appID);

        AppFreeOnSale.pressFreeOnSaleMissionControl(appID);

        AppFreeOnSale.selectArticleAppsaleType("On sale iPhone apps");
        AppFreeOnSale.enterOldPrice("20");
        //AppFreeOnSale.priceDropDate("11/10/2015");
        AppFreeOnSale.setDate(31);
        TestHelper.slp(5);
      //  BestOfList.selectPosition("1st - available Oct 10, 2015");
        }

    @After
    public void afterDriver(){
        TestHelper.quit();
    }
}

