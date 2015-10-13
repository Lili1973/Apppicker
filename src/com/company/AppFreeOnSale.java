package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class AppFreeOnSale {

    //------------Best of List
    public static String oldPrice = "//input[@id='free-on-sale-tab-old-price']";
    public static String priceDropDate = "//input[@id='free-on-sale-tab-old-price-drop-date']";
    public static String description="//*[@id='free-on-sale-tab-description']";
            //textarea[@id='free-on-sale-tab";

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
                //drv.findElement(By.xpath("//*[@id='free-on-sale-tab-old-price-drop-date']"));
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
        WebElement dropdown = TestHelper.waitElementByXpath("//*[@id='free-on-sale-tab-place']/option[text()='"+value+"']");
                //*[@id='free-on-sale-tab-place']");
        dropdown.click();
        Select sel = new Select(dropdown);
        sel.selectByVisibleText(value);
    }
    public static void enterDescription(String value) {
        TestHelper.cyclicElementSearchByXpath(description).sendKeys(value);
    }
    //TestHelper.drv.findElement(By.xpath(userEmail)).sendKeys(value);
    //ng-disabled dt.disabled
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