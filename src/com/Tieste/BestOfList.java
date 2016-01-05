package com.tieste;


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
        return TestHelper.cyclicElementSearchByXpath("//*[@id='app-"+value+"']/div[1]/div[1]/div[2]/div[1]/div/h2").getText();
        //TestHelper.drv.findElement(By.xpath(value)).getText();
        //*[@id="app-421838030"]/div/div[1]/div[2]/div[1]/div/h2
    }

    public static void pressAccessFeaturesButton(String value) {
        TestHelper.drv.findElement(By.xpath("//*[@id='"+value+"']")).click();
                //*[@id='"+value+"']//div[@class='mc-tabs-content-apps-block-improve']/button[1]")).click();
                System.out.println("ok");
    }

    //----------- Order Article BEST OF LIST Order Article
    public static void pressBestOfListMissionControl(String value) {
        // TestHelper.cyclicElementSearchByXpath(value);
        // TestHelper.drv.findElement(By.xpath(value)).click();
        TestHelper.slp(3);
        TestHelper.cyclicElementSearchByXpath("//*[@id='"+value+"']/div[2]/div/ul/li[3]/a").click();
    }

    public static void selectBestOfList(String value) {
TestHelper.slp(5);
        WebElement s=TestHelper.drv.findElement(By.xpath("//*[@ng-model='selectedList']"));
        Select sel=new Select(s);

        //WebElement dropdown=TestHelper.cyclicElementSearchByXpath("//a[@class='chosen-single chosen-default']");
                //*[@ng-model='selectedList']");
        //("//span[text()='Select \"Best of\" list']");
        System.out.println("dropdown");
       // dropdown.click();
        //TestHelper.slp(7);
//        Select sel=new Select(dropdown);
        //Select sel=new Select(TestHelper.cyclicElementSearchByXpath("//*[@ng-model='selectedList']"));
        //System.out.println(sel.getFirstSelectedOption().getText());
        //TestHelper.drv.findElement(By.xpath("//td[@id='countTd']/span[text()='" + item + "']")).click();
        //
        sel.selectByVisibleText(value);

//*[@id="855541857"]/div[2]/div/section/ng-include/div/div[4]/div[1]/div[1]/a/span
    }

   /* public static void setVehicle(String value) {
        WebElement selel = TestHelper.driver.findElement(By.id("ts_type"));
        Select sel = new Select(selel);
        sel.selectByVisibleText(value);
    }*/
    public static void selectPosition(String value) {
        //WebElement s=TestHelper.cyclicElementSearchByXpath("select[@ng-model='selectedPosition']");
        Select sel=new Select(TestHelper.cyclicElementSearchByXpath("select[@ng-model='selectedPosition']"));
        sel.selectByVisibleText(value);
    }
}
//a[text()='043 �']/../..//div[@title='����']/button
//*[@id='855541857']//div[@class='mc-tabs-content-apps-block-improve']/button[1]
//*[@id='"+value+"']//div[2]/div/ul/li[3]/a
//*[@id='855541857']/div[2]/div/ul/li[3]/a