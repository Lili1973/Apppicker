package com.tieste;

import org.junit.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;

import java.util.NoSuchElementException;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AppickerHomePageTests {

    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://temp:tiernansteve@st.apppicker.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    /*@Before
    public void beforeDriver(){
        TestHelper.setup(TestHelper.url);
        TestHelper.slp(5);
    }*/
    @Test
    public void testCheckHomePage() throws Exception {
        driver.get("http://temp:tiernansteve@st.apppicker.com");
        assertEquals(driver.getTitle(), "iPhone and iPad apps news and reviews");
        assertTrue(isElementPresent(By.xpath("//a[contains(text(),'Sign in')]")));
        assertEquals(driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).getText(), "Sign up");
        assertTrue(isElementPresent(By.cssSelector("a.header-controls-logo")));
        // -------Check Menu-----
        assertEquals(driver.findElement(By.xpath("//a[contains(@href, '/appsale')]")).getText(), "Free\n On Sale");
        try {
            assertEquals(driver.findElement(By.xpath("//a[contains(@href, '/promocodes')]")).getText(), "Promo\n Codes 17");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        assertEquals(driver.findElement(By.xpath("//a[contains(@href, '/reviews')]")).getText(), "Staff\n Reviews");
        assertEquals(driver.findElement(By.xpath("//a[contains(@href, '/news')]")).getText(), "Hot\n News");
        assertEquals(driver.findElement(By.xpath("//a[contains(@href, '/applists')]")).getText(), "Best Of\n Lists");
        assertEquals(driver.findElement(By.xpath("//a[contains(@href, '/developernews')]")).getText(), "Developer\n News");
        assertEquals(driver.findElement(By.xpath("//a[contains(@href, '/apps/hotapps')]")).getText(), "Hot\n Apps");
        assertEquals(driver.findElement(By.xpath("//a[contains(@href, '/topapps')]")).getText(), "appPicker\n Top 100");
        assertEquals(driver.findElement(By.xpath("//a[contains(text(),'Videos')]")).getText(), "Videos");
        assertEquals(driver.findElement(By.linkText("Insider")).getText(), "Insider");
        assertTrue(isElementPresent(By.xpath("//input[@id='js-search-form-desktop']")));
        assertTrue(isElementPresent(By.xpath("//i")));
        // ---------------------
        assertEquals(driver.findElement(By.xpath("//img")).getText(), "");
        assertTrue(isElementPresent(By.xpath("//a[contains(text(),'read more')]")));
        assertEquals(driver.findElement(By.xpath("//a[contains(text(),'Hot Apps')]")).getText(), "Hot Apps");
        assertEquals(driver.findElement(By.cssSelector("img.m-hot-apps-pic__image")).getText(), "");
        // -------Check App Sale-----
        // ---Apps on Sale:----------
        assertTrue(isElementPresent(By.xpath("(//a[contains(@href, '/appsale')])[2]")));
        assertTrue(isElementPresent(By.xpath("//div[2]/div/div/div/a/img")));
        assertTrue(isElementPresent(By.xpath("//div[2]/div/div[2]/div/a/img")));
        assertTrue(isElementPresent(By.xpath("//div[2]/div/div[4]/div/a/img")));
        assertTrue(isElementPresent(By.xpath("(//span[. = 'iPhone apps' ])[1]")));
        assertTrue(isElementPresent(By.xpath("//div[2]/div/div[8]/div/a/img")));
        assertTrue(isElementPresent(By.xpath("//div[9]/div/a/img")));
        assertTrue(isElementPresent(By.xpath("//div[11]/div/a/img")));
        assertTrue(isElementPresent(By.xpath("(//span[. = 'iPad apps' ])[1]")));
        // ---Apps gone Free: ----------
        assertTrue(isElementPresent(By.xpath("(//a[contains(@href, '/appsale')])[5]")));
        assertTrue(isElementPresent(By.xpath("//div[4]/div[2]/div/div/div/a/img")));
        assertTrue(isElementPresent(By.xpath("//div[4]/div[2]/div/div[2]/div/a/img")));
        try {
            assertTrue(isElementPresent(By.xpath("//div[4]/div[2]/div/div[4]/div/a/img")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        assertTrue(isElementPresent(By.xpath("(//span[. = 'iPhone apps' ])[2]")));
        assertTrue(isElementPresent(By.xpath("//div[2]/div/div[7]/div/a/img")));
        assertTrue(isElementPresent(By.xpath("//div[4]/div[2]/div/div[8]/div/a/img")));
        assertTrue(isElementPresent(By.xpath("//div[10]/div/a/img")));
        assertTrue(isElementPresent(By.xpath("(//span[. = 'iPad apps' ])[2]")));
        // ERROR: Caught exception [unknown command []]
        // ERROR: Caught exception [unknown command []]
        assertEquals(driver.findElement(By.linkText("Apps on Sale: 13 May")).getText(), "Apps on Sale: 13 May");
        assertTrue(isElementPresent(By.linkText("Apps on Sale: 13 May")));
        try {
            assertEquals(driver.findElement(By.linkText("Apps on Sale: 13 May")).getText(), "Apps on Sale: 13 May");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.linkText("Apps on Sale: 13 May")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        assertTrue(isElementPresent(By.linkText("Appicker")));
        assertEquals(driver.findElement(By.xpath("//a[contains(@href, '/about.html')]")).getText(), "About us");
        assertEquals(driver.findElement(By.xpath("//a[contains(@href, '/privacy.html')]")).getText(), "Privacy policy");
        assertEquals(driver.findElement(By.xpath("//a[contains(@href, '/new.html')]")).getText(), "What's new");
        assertEquals(driver.findElement(By.xpath("//a[contains(@href, '/press.html')]")).getText(), "Press page");
        assertEquals(driver.findElement(By.xpath("//a[contains(text(),'Contact us')]")).getText(), "Contact us");
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=20665 | ]]
        driver.findElement(By.linkText("Apps gone Free: 27 Jul")).click();
        driver.findElement(By.cssSelector("a.header-controls-logo")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
        driver.findElement(By.id("command-button-pick")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=20665 | ]]
        driver.findElement(By.linkText("Apps gone Free: 27 Jul")).click();
        driver.findElement(By.xpath("//a[contains(@href, '/appsale')]")).click();
        // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
        driver.findElement(By.cssSelector("a.header-controls-logo")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
        driver.findElement(By.cssSelector("span.editor.text > pre")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=toolbox-panel-iframe-inspector | ]]
        driver.findElement(By.cssSelector("span.editor.text > pre")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
        driver.findElement(By.cssSelector("pre")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
        driver.findElement(By.cssSelector("#root > ul > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > div.tag-line.flash-out > div.tag-state")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=toolbox-panel-iframe-inspector | ]]
        driver.findElement(By.cssSelector("#root > ul > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > div.tag-line.flash-out > div.tag-state")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
        driver.findElement(By.cssSelector("#root > ul > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > ul.children > li.child > div.tag-line.flash-out > div.tag-state")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
        driver.findElement(By.cssSelector("span.editor.text > pre")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=toolbox-panel-iframe-inspector | ]]
        driver.findElement(By.cssSelector("span.editor.text > pre")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
        driver.findElement(By.cssSelector("pre")).click();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
