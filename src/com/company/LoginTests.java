package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Rusya on 25.09.2015.
 */
public class LoginTests {

    @Before
    public void beforeDriver(){
        TestHelper.setup(TestHelper.url);
    }

    @Test
    public void testTitle() {
        Assert.assertEquals("iPhone and iPad apps news and reviews", TestHelper.drv.getTitle());
        System.out.println(TestHelper.drv.getTitle());

    }
    @Test
    public void testSignInDeveloper() {
        TestHelper.slp(2);
        emailField("apppicker_developer@ukr.net", drv);
        passwordField("apppicker_developer", drv);

    }*/
    @After
    public void afterDriver(){
        TestHelper.drv.quit();
    }
}
