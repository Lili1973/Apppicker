package com.tieste;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BestOfList {

     //---------DEVELOPE PROFILE----------
    ///////     Checked /////////////

    // -----------Get App Title
    public static String getAppTitle(String value) {
        TestHelper.slp(5);
        return TestHelper.waitElementDisplayedByXpath("//section//h2[contains(text(),'"+value+"')]").getText();
    }
    //------------Best of List
    public static void pressAccessFeaturesButton(String value) {
        TestHelper.drv.findElement(By.xpath("(//*[@id='app-" + value + "']/div)[1]")).click();
        TestHelper.drv.navigate().to("http://st.apppicker.com/profile/apps/" + value);
    }
    public static void pressBestOfList() {
        TestHelper.slp(3);
        TestHelper.drv.findElement(By.xpath("//a/i[@class='fa fa-list-ul']")).click();
        TestHelper.slp(3);
    }



    ///////     Checked /////////////


    //----------- Order Article BEST OF LIST Order Article


    public static void selectBestOfList(String value) {
        //TestHelper.slp(10);
        TestHelper.waitElementByXpath("//*/select[@id='free-on-sale-tab-type']");
        WebElement sel= TestHelper.waitElementByXpath("//*/select[@id='free-on-sale-tab-type']");
        //waitElementByXpath("//*/select[@id='free-on-sale-tab-type']");
                //TestHelper.drv.findElement(By.xpath("//*[@ng-model='selectedList']"));
        //Select sel=new Select(s);
        Select sel1 = new Select(sel);
        sel1.selectByVisibleText(value);
        System.out.println("6666666666");
        //Select sel1 = new Select(TestHelper.drv.findElement(By.xpath("//*/select[@id='free-on-sale-tab-type']")));
        //sel1.selectByVisibleText(value);
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



 /*WebDriverWait wait = new WebDriverWait(TestHelper.drv, 15);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app-"+value+"']/div")));
        element.click();
        int size = TestHelper.drv.findElements(By.xpath("//*[@id='app-"+value+"']/div")).size();
        TestHelper.slp(5);
        System.out.println("size = " + size);*/
//a[text()='043 �']/../..//div[@title='����']/button
//*[@id='855541857']//div[@class='mc-tabs-content-apps-block-improve']/button[1]
//*[@id='"+value+"']//div[2]/div/ul/li[3]/a
//*[@id='855541857']/div[2]/div/ul/li[3]/a