package com.tieste;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BestOfListTests {
    public static String appID ="421838030";
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
        System.out.println("****************");
        Assert.assertEquals("Advanced System Monitor", BestOfList.getAppTitle(appID));
        System.out.println("----------------");
        System.out.println(BestOfList.getAppTitle(appID));
        BestOfList.pressAccessFeaturesButton(appID);
        BestOfList.pressBestOfListMissionControl(appID);

        BestOfList.selectBestOfList("Best brownies apps for iPhone and iPad");


                TestHelper.slp(7);
        BestOfList.selectPosition("1st - available Oct 10, 2015");
    }
    @After
    public void afterDriver(){
        TestHelper.quit();
    }
}
//*[@id="855541857"]/div[1]/div[3]/button[1]