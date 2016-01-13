package com.tieste;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BestOfList {

    public static String appID ="421838030";
    public static String selectBestOfList="//*/select[@class='form-control ng-pristine ng-untouched ng-valid localytics-chosen']";


    //---------DEVELOPE PROFILE----------
    // -----------Get App Title
    public static String getAppTitle(String value) {
        //return TestHelper.cyclicElementSearchByXpath("//*[@id='app-"+value+"']/div[1]/div[1]/div[2]/div[1]/div/h2").getText();
        return TestHelper.cyclicElementSearchByXpath("//*[@id='app-"+value+"']//div[@class='mc-tabs-content-apps-block-data']" +
                "//div[@class='mc-tabs-content-apps-block-data-info-app-title']").getText();
      }

    //------------Best of List
    public static void pressAccessFeaturesButton(String value) {
        TestHelper.drv.findElement(By.xpath("//*[@id='app-"+value+"']/div")).click();
    }

    //----------- Order Article BEST OF LIST Order Article
    public static void pressBestOfListMissionControl() {
        TestHelper.slp(3);
        TestHelper.drv.findElement(By.xpath("//a/i[@class='fa fa-list-ul']")).click();
    }

    public static void selectBestOfList(String value) {
        TestHelper.slp(5);
        //WebElement s=TestHelper.drv.findElement(By.xpath("//*[@ng-model='selectedList']"));
        //Select sel=new Select(s);
        Select sel1 = new Select(TestHelper.drv.findElement(By.xpath(selectBestOfList)));
        sel1.selectByVisibleText(value);
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
        //sel.selectByVisibleText(value);

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