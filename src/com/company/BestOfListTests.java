package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BestOfListTests {
    @Before
    public void beforeDriver(){
        TestHelper.setup(TestHelper.url);
    }

    @Test
    public void testOrderBestOfList() {
        Login.pressSignIn();
        Login.emailField("apppicker_developer@ukr.net");
        Login.passwordField("apppicker_developer");
        Login.pressLoginbutton();
        Assert.assertEquals("Lilia_developer", Login.getDeveloperNick(Login.developerNick));
        System.out.println(Login.getDeveloperNick(Login.developerNick));
        Assert.assertEquals("Benjamin Afterburner", Login.getDeveloperNick(Login.appID));
        System.out.println(Login.getDeveloperNick(Login.appID));
        Login.pressAccessFeaturesButton();
        TestHelper.slp(5);
        Login.pressBestOfListMissionControl(Login.bestOfListMC);
        TestHelper.slp(5);
        Login.selectBestOfList();
        TestHelper.slp(5);
    }
    @After
    public void afterDriver(){
        TestHelper.drv.quit();
    }
}
