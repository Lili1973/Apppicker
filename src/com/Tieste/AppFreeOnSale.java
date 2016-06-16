package com.tieste;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AppFreeOnSale {

   /* public static String appID ="500909640";

    public static String appSaleType="//*[@id='free-on-sale-tab-type']";
    public static String oldPrice = "//input[@id='free-on-sale-tab-old-price']";

    public static String priceDropDateFielld="//*[@id='free-on-sale-tab-old-price-drop-date']";
    public static String appPlace="//*[@id='free-on-sale-tab-place']";
    public static String description="//*[@id='free-on-sale-tab-description']";
    public static String tick="//input[@ng-model='form.confirmed']";

    //---------DEVELOPE PROFILE----------
    //----------- Order Article App Free/on sale Article
    public static void pressFreeOnSaleMissionControl() {
        TestHelper.drv.findElement(By.xpath("//a/i[@class='fa fa-shopping-cart']")).click();
    }
    //----------- Select Article TYPE App Free/on sale
    public static void selectArticleAppsaleType(String value) {
        WebElement dropdown = TestHelper.cyclicElementSearchByXpath(appSaleType);
        Select sel = new Select(dropdown);
        sel.selectByVisibleText(value);
    }
    //----------- Input OLD Price
    public static void enterOldPrice(String value) {
        TestHelper.cyclicElementSearchByXpath(oldPrice).sendKeys(value);
    }
    //*********************************************************************** Select DATE
   /* public static void priceDropDate(String value) {
        WebElement oldPriceDropDate = TestHelper.waitElementDisplayedByXpath("//*[@id='free-on-sale-tab-old-price-drop-date']");
        if (TestHelper.waitElementByXpath("//input[@id='free-on-sale-tab-old-price-drop-date']").isEnabled()){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        oldPriceDropDate.click();
        TestHelper.cyclicElementSearchByXpath("//*[@aria-disabled='false']/..//button/span[(text()='" + value + "')]")
                .click();
    }*/
   /* public static void  priceDropDate(String value) {
        WebElement oldPriceDropDate = TestHelper.waitElementDisplayedByXpath(priceDropDateFielld);
        /*if (oldPriceDropDate.isEnabled()){
                //(TestHelper.waitElementByXpath("//*[@id='free-on-sale-tab-old-price-drop-date']").isEnabled()){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        TestHelper.drv.findElement(By.id("free-on-sale-tab-old-price-drop-date")).click();*/
/*        oldPriceDropDate.click();
        TestHelper.drv.findElement(By.xpath("//span[(contains(text(),"+value+"))][@class='ng-binding']")).click();
        //TestHelper.slp(5);

    }*/
    //********************************************************************
 /*   public static void selectFirstPlace(String value) {
        WebElement place = TestHelper.cyclicElementSearchByXpath(appPlace);
        Select sel = new Select(place);
        sel.selectByVisibleText(value);
    }
    public static void enterDescription(String value) {
        TestHelper.cyclicElementSearchByXpath(description).sendKeys(value);
    }

    public static void setTick() {
        TestHelper.cyclicElementSearchByXpath(tick).click();
    }

    public static void pressButtonPayPal() {
        TestHelper.drv.findElement(By.xpath("//*[@class='btn btn-info btn-block btn-lg']")).click();
       // TestHelper.cyclicElementSearchByXpath("//*[@id='"+appID+"']/div[2]/div/section/ng-include/div/form/div[12]/button/span[1]").click();
        //TestHelper.cyclicElementSearchByXpath("//*[@aria-disabled='false']/..//button/span[(text()='')]").click();
    }

    public static void fillPayPal() {
        TestHelper.cyclicElementSearchByXpath("//*[@id='loadLogin']").click();
        TestHelper.cyclicElementSearchByXpath("//*[@id='login_email']").sendKeys("lsokolova.ua-1@gmail.com");
        TestHelper.cyclicElementSearchByXpath("//*[@id='login_password']").sendKeys("Apppicker_557799");
        TestHelper.cyclicElementSearchByXpath("//*[@id='submitLogin']").click();
        TestHelper.slp(7);
        TestHelper.cyclicElementSearchByXpath("//*[@id='continue']").click();
    }
}


       // String elementDateNumber = "//*[text()='" + dateMonth + " " + dateYear + "']/..//td[text()='" + dateNumber + "']";




        //   "/html/body/div[2]/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td[3]";
        //     "//div[@class=\"rui-re-anchor\"]/div[1]/table/tbody/tr/td[2]/table/tbody/tr/td[text()='" + dateNumber + "']";
        //String elementDateMonthYear = "//div[@class=\"rui-re-anchor\"]/div[1]/table/tbody/tr/td[2]/table/caption[text() = '" + dateMonth + " " + dateYear + "']";
        //String elementDateMonthYear =
        //       "//div[@class=\"rui-re-anchor\"]/div[@class=\"rui-calendar rui-panel\"]/table/tbody/tr/td/table/caption[text() = '" + month + " 2015']";

        //TestHelper.findElement(elementDate).click();
        //TestHelper.findElement(elementDateNumber).click();
        //TestHelper.slpMs(5000);



//*[@id="datepicker-146-2535-27"]/button/span
//*[@id="datepicker-146-2535-27"]/button/span
//*[@aria-disabled='false']/..//button/span[(text()=07)]
/*
//---------------------------------------------
// TestHelper.cyclicElementSearchByXpath(oldPrice).sendKeys(value);
//System.out.println(System.currentTimeMillis());
//Calendar cal = new GregorianCalendar();
//System.out.println(new SimpleDateFormat("dd.MM.yyyy").format(cal.getTime()));
//TestHelper.cyclicElementSearchByXpath(priceDropDate).clear();
TestHelper.cyclicElementSearchByXpath(priceDropDate).getLocation();
        System.out.println("TestHelper.cyclicElementSearchByXpath(priceDropDate).getLocation()");
        TestHelper.slp(5);
        TestHelper.cyclicElementSearchByXpath(priceDropDate).sendKeys(value);*/

        /*Calendar c=Calendar.getInstance();
        System.out.println();
        c.add(Calendar.DATE,+1);
        System.out.println(c.get(c.DAY_OF_MONTH) + "." + (c.get(c.MONTH)+1) + "." + c.get(c.YEAR));*/
//----------------------------------------*/
}