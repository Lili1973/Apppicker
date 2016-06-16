package com.tieste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DevNews  {
    public static void main(String[] args) {
        /*TestHelper.setup(TestHelper.url_ukr_net);
        TestHelper.slp(5);
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

        // Should see: "cheese! - Google Search"
        System.out.println("Page title is: " + driver.getTitle());

        //Close the browser
        //driver.quit();*/
    }
}