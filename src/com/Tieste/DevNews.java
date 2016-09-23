package com.tieste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DevNews {

    // -----------Get App Title
    public static String getAppTitle(String value){
        TestHelper.slp(5);
        return TestHelper.waitElementDisplayedByXpath("//section//h2[contains(text(),'" + value + "')]").getText();
    }
    //------------Dev News
    public static void pressAccessFeaturesButton(String value) {
        TestHelper.drv.findElement(By.xpath("(//*[@id='app-" + value + "']/div)[1]")).click();
        TestHelper.drv.navigate().to("http://st.apppicker.com/profile/apps/" + value);
    }

    public static void pressDevNews() {
        TestHelper.slp(3);
        TestHelper.drv.findElement(By.xpath("//a/i[@class='fa fa-code']")).click();
        TestHelper.slp(3);
    }
    //----------- Input Description
    public static void enterText(String value) {
        WebElement a= TestHelper.cyclicElementSearchByXpath("//textarea[@id='dev-news-tab-announcement']");
        a.clear();
        a.sendKeys(value);
        TestHelper.slp(3);
        TestHelper.drv.findElement(By.xpath("//button[@type='button']")).click();
    }




        /*
        Login.emailFieldUkrNet("apppicker_developer");
        Login.passwordFieldUkrNet("apppicker_developer");
        Login.pressLoginbuttonUkrNet();
        System.out.println("-------");
        Login.pressMailBoxUkrNet();
        System.out.println("************");
        /*WebDriver driver = new FirefoxDriver();
        driver.get("https://www.ukr.net/");
        driver.findElement(By.xpath("")).click();


        // Enter something to search for
        element.sendKeys("Cheese!");

        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheese!");
            }
        });
*/

}

