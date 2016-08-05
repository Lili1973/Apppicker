package com.tieste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;


public class SignUpTests {
    @Before
    public void beforeDriver(){
        TestHelper.setup(TestHelper.url);
        TestHelper.slp(5);
        TestHelper.setup1(TestHelper.urlmail);
    }
    @Test
    public void testTitle() {
        Assert.assertEquals("iPhone and iPad apps news and reviews", TestHelper.drv.getTitle());
        System.out.println(TestHelper.drv.getTitle());
    }
    //-----Positive()-- lsokolova.ua+at@gmail.com/lsokolova.ua+at@gmail.com
    //apppicker_writer@ukr.net/apppicker_writer@ukr.net
    //---------------------------------------------------TEST Email--------------
    //-----Negative01()--apppicker_developerukr.net
    //-----Negative02()--apppicker_developer@
    //-----Negative03()--@@@
    //-BUG-Negative04()--too long email
    //-----Negative05()--a@gmail.com ----------- email exist in DB
    //---------------------------------------------------TEST Password
    //-----Negative06()-- lsokolova.ua+at@gmail.com/1
    //-----Negative07()-- lsokolova.ua+at@gmail.com/" "
    //-BUG-Negative08()-- password consist of from only spase

    @Test
    public void testSignUpDeveloperPositive() throws Exception {
        TestHelper.drv.findElement(By.linkText("Sign up")).click();
        TestHelper.slp(5);
        TestHelper.drv.findElement(By.xpath("//input[@type='e-mail']")).clear();
        TestHelper.drv.findElement(By.xpath("//input[@type='e-mail']")).sendKeys("ghd64625@zasod.com");
        TestHelper.slp(5);
        TestHelper.drv.findElement(By.xpath("//input[@type='password']")).clear();
        TestHelper.drv.findElement(By.xpath("//input[@type='password']")).sendKeys("ghd64625@zasod.com");
        TestHelper.drv.findElement(By.xpath("//button[@class='signup-content-registration-item-input is-button-submit js-signup-submit']")).click();
        TestHelper.slp(5);
        Assert.assertEquals("We just sent you a confirmation email, please\n" +
                "click the link to verify you email and start\n" +
                "to use your features", TestHelper.drv.findElement(By.xpath("//*[@class='signup-text']")).getText());
        TestHelper.slp(3);
        Assert.assertTrue(isElementPresent(By.cssSelector("h2.signup-title")));
        Assert.assertEquals(TestHelper.drv.findElement(By.cssSelector("h2.signup-title")).getText(), "Well done!");
        //Assert.assertTrue(isElementPresent(By.xpath("//button[@onclick=\"window.location='http://st.apppicker.com/' ? decodeURIComponent('http://st.apppicker.com/'):'/'\"]")));
        Assert.assertTrue(isElementPresent(By.xpath("//button[@class='signup-content-registration-item-input is-button-submit js-signup-submit']")));
        Assert.assertTrue(isElementPresent(By.cssSelector("a.signup-logo")));
        TestHelper.drv.findElement(By.xpath("//button[@class='signup-content-registration-item-input is-button-submit js-signup-submit']")).click();
        TestHelper.slp(5);
        TestHelper.drv.quit();
    }
    @Test
    public void testSignUpDeveloperNegative01() throws Exception {
        TestHelper.drv.findElement(By.linkText("Sign up")).click();
        TestHelper.slp(5);
        TestHelper.drv.findElement(By.xpath("//input[@type='e-mail']")).clear();
        TestHelper.drv.findElement(By.xpath("//input[@type='e-mail']")).sendKeys("apppicker_developerukr.net");
        TestHelper.drv.findElement(By.xpath("//button[@class='signup-content-registration-item-input is-button-submit js-signup-submit']")).click();
        Assert.assertEquals(TestHelper.drv.findElement(By.cssSelector("div.form-controls-help-message")).getText(),
                "Please enter a valid email address");
        TestHelper.drv.quit();
    }
    @Test
    public void testSignUpDeveloperNegative02() throws Exception {
        TestHelper.drv.findElement(By.linkText("Sign up")).click();
        TestHelper.slp(5);
        TestHelper.drv.findElement(By.xpath("//input[@type='e-mail']")).clear();
        TestHelper.drv.findElement(By.xpath("//input[@type='e-mail']")).sendKeys("apppicker_developer@");
        TestHelper.drv.findElement(By.xpath("//button[@class='signup-content-registration-item-input is-button-submit js-signup-submit']")).click();
        Assert.assertEquals(TestHelper.drv.findElement(By.cssSelector("div.form-controls-help-message")).getText(),
                "Please enter a valid email address");
        TestHelper.drv.quit();
    }
    @Test
    public void testSignUpDeveloperNegative03() throws Exception {
        TestHelper.drv.findElement(By.linkText("Sign up")).click();
        TestHelper.slp(5);
        TestHelper.drv.findElement(By.xpath("//input[@type='e-mail']")).clear();
        TestHelper.drv.findElement(By.xpath("//input[@type='e-mail']")).sendKeys("@@@");
        TestHelper.drv.findElement(By.xpath("//button[@class='signup-content-registration-item-input is-button-submit js-signup-submit']")).click();
        Assert.assertEquals(TestHelper.drv.findElement(By.cssSelector("div.form-controls-help-message")).getText(),
                "Please enter a valid email address");
        TestHelper.drv.quit();
    }
    /*-----------------------Bug @Test
    public void testSignUpDeveloperNegative04() throws Exception {
        TestHelper.drv.findElement(By.linkText("Sign up")).click();
        TestHelper.slp(5);
        TestHelper.drv.findElement(By.xpath("//input[@type='e-mail']")).clear();
        TestHelper.drv.findElement(By.xpath("//input[@type='e-mail']")).sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaapppicker_developer@ukr.net");
        TestHelper.drv.findElement(By.xpath("//button[@class='signup-content-registration-item-input is-button-submit js-signup-submit']")).click();
        Assert.assertEquals("Please enter a valid email address",TestHelper.drv.findElement(By.cssSelector("div.form-controls-help-message")).getText()
                );
        TestHelper.drv.quit();
    }*/
    @Test
    public void testSignUpDeveloperNegative05() throws Exception {
        TestHelper.drv.findElement(By.linkText("Sign up")).click();
        TestHelper.slp(5);
        TestHelper.drv.findElement(By.xpath("//input[@type='e-mail']")).clear();
        TestHelper.drv.findElement(By.xpath("//input[@type='e-mail']")).sendKeys("a@gmail.com");
        TestHelper.drv.findElement(By.xpath("//input[@type='password']")).clear();
        TestHelper.drv.findElement(By.xpath("//input[@type='password']")).sendKeys("apppicker_developer1");
        TestHelper.drv.findElement(By.xpath("//button[@class='signup-content-registration-item-input is-button-submit js-signup-submit']")).click();
        TestHelper.slp(5);
        Assert.assertEquals("A user with this email already exists",
                TestHelper.drv.findElement(By.xpath("//*[@class='form-controls-help-message']")).getText());
        TestHelper.drv.quit();
    }
    //---------------------------------------------------Password
    //-----------------------------------------------------------
    @Test
    public void testSignUpDeveloperNegative06() throws Exception {
        TestHelper.drv.findElement(By.linkText("Sign up")).click();
        TestHelper.slp(5);
        TestHelper.drv.findElement(By.xpath("//input[@type='e-mail']")).clear();
        TestHelper.drv.findElement(By.xpath("//input[@type='e-mail']")).sendKeys("lsokolova.ua+at@gmail.com");
        TestHelper.slp(5);
        TestHelper.drv.findElement(By.xpath("//input[@type='password']")).clear();
        TestHelper.drv.findElement(By.xpath("//input[@type='password']")).sendKeys("1");
        TestHelper.drv.findElement(By.xpath("//button[@class='signup-content-registration-item-input is-button-submit js-signup-submit']")).click();
        TestHelper.slp(5);
        Assert.assertEquals("Password is too short (minimum 3 characters)",
                TestHelper.drv.findElement(By.xpath("(//*[@class='form-controls-help-message'])[2]")).getText());
        TestHelper.drv.quit();
    }

    @Test
    public void testSignUpDeveloperNegative07() throws Exception {
        TestHelper.drv.findElement(By.linkText("Sign up")).click();
        TestHelper.slp(5);
        TestHelper.drv.findElement(By.xpath("//input[@type='e-mail']")).clear();
        TestHelper.drv.findElement(By.xpath("//input[@type='e-mail']")).sendKeys("lsokolova.ua+at@gmail.com");
        TestHelper.slp(5);
        TestHelper.drv.findElement(By.xpath("//input[@type='password']")).clear();
        TestHelper.drv.findElement(By.xpath("//input[@type='password']")).sendKeys(" ");
        TestHelper.drv.findElement(By.xpath("//button[@class='signup-content-registration-item-input is-button-submit js-signup-submit']")).click();
        TestHelper.slp(5);
        Assert.assertEquals("Password is too short (minimum 3 characters)",
                TestHelper.drv.findElement(By.xpath("(//*[@class='form-controls-help-message'])[2]")).getText());
        TestHelper.drv.quit();
    }

    /*-----------------------Bug@Test
    public void testSignUpDeveloperNegative08() throws Exception {
        TestHelper.drv.findElement(By.linkText("Sign up")).click();
        TestHelper.slp(5);
        TestHelper.drv.findElement(By.xpath("//input[@type='e-mail']")).clear();
        TestHelper.drv.findElement(By.xpath("//input[@type='e-mail']")).sendKeys("lsokolova.ua+at@gmail.com");
        TestHelper.slp(5);
        TestHelper.drv.findElement(By.xpath("//input[@type='password']")).clear();
        TestHelper.drv.findElement(By.xpath("//input[@type='password']")).sendKeys("    ");
        TestHelper.drv.findElement(By.xpath("//button[@class='signup-content-registration-item-input is-button-submit js-signup-submit']")).click();
        TestHelper.slp(5);
        Assert.assertEquals("Password is too short (minimum 3 characters)",
                TestHelper.drv.findElement(By.xpath("(//*[@class='form-controls-help-message'])[2]")).getText());
        TestHelper.drv.quit();
    }*/
    private boolean isElementPresent(By by) {
        try {
            TestHelper.drv.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
