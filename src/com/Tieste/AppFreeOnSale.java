package com.tieste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AppFreeOnSale {

    //------------Best of List
    public static String oldPrice = "//input[@id='free-on-sale-tab-old-price']";
    public static String priceDropDate = "//input[@id='free-on-sale-tab-old-price-drop-date']";
    public static String description="//*[@id='free-on-sale-tab-description']";
    public static String tick="//input[@ng-model='form.confirmed']";

    //---------DEVELOPE PROFILE----------


    //----------- Order Article App Free/on sale Article
    public static void pressFreeOnSaleMissionControl(String value) {
        TestHelper.cyclicElementSearchByXpath("//*[@id='" + value + "']/div[2]/div/ul/li[5]/a").click();
    }
    //----------- Select Article TYPE App Free/on sale
    public static void selectArticleAppsaleType(String value) {
        WebElement dropdown = TestHelper.cyclicElementSearchByXpath("//*[@id='free-on-sale-tab-type']");
        Select sel = new Select(dropdown);
        sel.selectByVisibleText(value);
    }
    //----------- Input OLD Price
    public static void enterOldPrice(String value) {
        TestHelper.cyclicElementSearchByXpath(oldPrice).sendKeys(value);
    }
    //----------- Select DATE
    public static void priceDropDate(String value) {
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
    }
    public static void selectFirstPlace(String value) {
       /* WebElement dropdown = TestHelper.waitElementByXpath("//*[@id='free-on-sale-tab-place']");

        dropdown.click();
        Select sel = new Select(dropdown);
        sel.selectByValue(value);
        //selectByVisibleText(value);*/

        Select dropdown = new Select(TestHelper.drv.findElement(By.id("free-on-sale-tab-place")));
        dropdown.selectByValue(value);

    }
    public static void enterDescription(String value) {
        TestHelper.cyclicElementSearchByXpath(description).sendKeys(value);
    }

    public static void setTick() {
        TestHelper.cyclicElementSearchByXpath(tick).click();
    }

    public static void pressButtonPayPal() {
        TestHelper.cyclicElementSearchByXpath("//*[@id='"+AppFreeOnSaleTests.appID+"']/div[2]/div/section/ng-include/div/form/div[12]/button/span[1]").click();
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

//---------------------------------------------
/*// TestHelper.cyclicElementSearchByXpath(oldPrice).sendKeys(value);
//System.out.println(System.currentTimeMillis());
//Calendar cal = new GregorianCalendar();
//System.out.println(new SimpleDateFormat("dd.MM.yyyy").format(cal.getTime()));
//TestHelper.cyclicElementSearchByXpath(priceDropDate).clear();
TestHelper.cyclicElementSearchByXpath(priceDropDate).getLocation();
        System.out.println("TestHelper.cyclicElementSearchByXpath(priceDropDate).getLocation()");
        TestHelper.slp(5);
        TestHelper.cyclicElementSearchByXpath(priceDropDate).sendKeys(value);

        /*Calendar c=Calendar.getInstance();
        System.out.println();
        c.add(Calendar.DATE,+1);
        System.out.println(c.get(c.DAY_OF_MONTH) + "." + (c.get(c.MONTH)+1) + "." + c.get(c.YEAR));*/
//----------------------------------------