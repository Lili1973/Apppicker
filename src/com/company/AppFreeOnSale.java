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

    //---------DEVELOPE PROFILE----------


    //----------- Order Article BEST OF LIST Order Article
    public static void pressFreeOnSaleMissionControl(String value) {
        TestHelper.cyclicElementSearchByXpath("//*[@id='" + value + "']/div[2]/div/ul/li[5]/a").click();
    }

    public static void selectArticleAppsaleType(String value) {
        WebElement dropdown = TestHelper.cyclicElementSearchByXpath("//*[@id='free-on-sale-tab-type']");
        System.out.println("dropdown");
        dropdown.click();
        Select sel = new Select(dropdown);
        System.out.println(sel.getFirstSelectedOption().getText());
        sel.selectByVisibleText(value);
    }

    public static void enterOldPrice(String value) {
        TestHelper.cyclicElementSearchByXpath(oldPrice).sendKeys(value);
    }
    public static void priceDropDate(String value) {
       // TestHelper.cyclicElementSearchByXpath(oldPrice).sendKeys(value);
        //System.out.println(System.currentTimeMillis());
        //Calendar cal = new GregorianCalendar();
        //System.out.println(new SimpleDateFormat("dd.MM.yyyy").format(cal.getTime()));
        TestHelper.cyclicElementSearchByXpath(priceDropDate).clear();
        TestHelper.slp(5);
        TestHelper.cyclicElementSearchByXpath(priceDropDate).sendKeys(value);

        /*Calendar c=Calendar.getInstance();
        System.out.println();
        c.add(Calendar.DATE,+1);
        System.out.println(c.get(c.DAY_OF_MONTH) + "." + (c.get(c.MONTH)+1) + "." + c.get(c.YEAR));*/
    }
    //TestHelper.drv.findElement(By.xpath(userEmail)).sendKeys(value);

    static void setDate(int value) {

       // String elementDateNumber = "//*[text()='" + dateMonth + " " + dateYear + "']/..//td[text()='" + dateNumber + "']";


        TestHelper.waitElementByXpath("//input[@id='free-on-sale-tab-old-price-drop-date']").click();
        TestHelper.waitElementDisplayedByXpath("//*[@aria-disabled='false']/..//button/span[(text()="+value+")]")
                .click();
    }
        //   "/html/body/div[2]/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td[3]";
        //     "//div[@class=\"rui-re-anchor\"]/div[1]/table/tbody/tr/td[2]/table/tbody/tr/td[text()='" + dateNumber + "']";
        //String elementDateMonthYear = "//div[@class=\"rui-re-anchor\"]/div[1]/table/tbody/tr/td[2]/table/caption[text() = '" + dateMonth + " " + dateYear + "']";
        //String elementDateMonthYear =
        //       "//div[@class=\"rui-re-anchor\"]/div[@class=\"rui-calendar rui-panel\"]/table/tbody/tr/td/table/caption[text() = '" + month + " 2015']";

        //TestHelper.findElement(elementDate).click();
        //TestHelper.findElement(elementDateNumber).click();
        //TestHelper.slpMs(5000);
    }


//*[@id="datepicker-146-2535-27"]/button/span
//*[@id="datepicker-146-2535-27"]/button/span
//*[@aria-disabled='false']/..//button/span[(text()=07)]