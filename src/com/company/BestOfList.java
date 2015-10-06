package com.company;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BestOfList {
    //------------Best of List

   // public static String appID ="//*[@id='844280848']/div[1]/div[1]/div[2]/div[1]/div/h2";
   // public static String accessFeaturesButton ="//*[@id='778106621']/div[1]/div[2]/button[1]";
    //public static String bestOfListMC ="//*[@id='778106621']/div[2]/div/ul/li[3]/a";
    //span[text()='Lilia_developer']
//*[@id="855541857"]/div[1]/div[1]/div[2]/div[1]/div/h2
    //---------DEVELOPE PROFILE----------
    // -----------Get App Title
    public static String getAppTitle(String value) {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='"+value+"']/div[1]/div[1]/div[2]/div[1]/div/h2").getText();
        //TestHelper.drv.findElement(By.xpath(value)).getText();
    }

    public static void pressAccessFeaturesButton(String value) {
        TestHelper.drv.findElement(By.xpath("//*[@id='"+value+"']//div[@class='mc-tabs-content-apps-block-improve']/button[1]")).click();
        System.out.println("ok");
    }

    //----------- Order Article BEST OF LIST Order Article
    public static void pressBestOfListMissionControl(String value) {
        // TestHelper.cyclicElementSearchByXpath(value);
        // TestHelper.drv.findElement(By.xpath(value)).click();
        TestHelper.cyclicElementSearchByXpath("//*[@id='"+value+"']/div[2]/div/ul/li[3]/a").click();
    }

    public static void selectBestOfList(String value) {
        WebElement s=TestHelper.cyclicElementSearchByXpath("//*[@id='855541857']/div[2]/div/section/ng-include/div/div[4]/div[1]/select");
        s.click();
        Select sel=new Select(s);
        sel.selectByVisibleText(value);
    }
    public static void selectPosition(String value) {
        //WebElement s=TestHelper.cyclicElementSearchByXpath("select[@ng-model='selectedPosition']");
        Select sel=new Select(TestHelper.cyclicElementSearchByXpath("select[@ng-model='selectedPosition']"));
        sel.selectByVisibleText(value);
    }
}
//a[text()='043 Ъ']/../..//div[@title='Ъѓях']/button
//*[@id='855541857']//div[@class='mc-tabs-content-apps-block-improve']/button[1]
//*[@id='"+value+"']//div[2]/div/ul/li[3]/a
//*[@id='855541857']/div[2]/div/ul/li[3]/a