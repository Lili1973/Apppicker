package com.tieste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestHelper {

    public static String url = "http://temp:tiernansteve@st.apppicker.com";
   // public static String url = "http://www.apppicker.com";
    public static String urlmail = "https://10minutemail.net/";
    public static String url_ukr_net="https://www.ukr.net/";
    public static WebDriver drv;
    public static WebDriver drv1;
    public static String master="//tr[1]/td[2]/input";
    public static String siteName="//tr[2]/td[2]/input";
    public static String buttonGenerate="//*[@value='Generate']";


    public static void setup(String url){
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
                //"/usr/local/bin/chromedriver");
        drv = new ChromeDriver();
        //drv = new FirefoxDriver();
       /* ак запустить Firefox с подключенным плагином Firebug?
       FirefoxProfile profile = new FirefoxProfile();
        profile.addExtension(new  File(Уfirebug-1.8.0.xpiФ));
        WebDriver driver = new  FirefoxDriver(profile);*/

        drv.get(url);
        drv.manage().window().maximize();
    }
    ////////////////////////
    public static void setup1(String urlmail){
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        //"/usr/local/bin/chromedriver");
        drv1 = new ChromeDriver();
        drv1.get(urlmail);
        drv1.manage().window().maximize();
    }
    /******************/
    public static WebElement cyclicElementSearchByXpath(String target) {
        for (int i = 0; i < 50; i++)    {
            if ((drv.findElements(By.xpath(target)).size() > 0) || ((drv.findElement(By.xpath(target)).isDisplayed())))  {
                int a=drv.findElements(By.xpath(target)).size();
                System.out.println("size"+a);
                System.out.println("break"+i);
                break;

            }
            System.out.println(i);
            slp(1);
        }
        return drv.findElement(By.xpath(target));
    }
    public static WebElement cyclicElementSearchByCssSelector(String target) {
        for (int i = 0; i < 50; i++)    {
            if ((drv.findElements(By.cssSelector(target)).size() > 0) || ((drv.findElement(By.cssSelector(target)).isDisplayed())))  {
                System.out.println("break"+i);
                break;

            }
            System.out.println(i);
            slp(1);
        }
        return drv.findElement(By.xpath(target));
    }
    ///////////////////////////
    public static WebElement waitElementByXpath(String target) {
        for (int i = 0; i < 250; i++)    {
            if (drv.findElements(By.xpath(target)).size() != 0) {
                break;
            }
            slp(1);
            System.out.println(i);
        }
        return drv.findElement(By.xpath(target));
    }
    public static WebElement waitElementByXpath1(String target) {
        for (int i = 0; i < 200; i++) {
            if (drv.findElements(By.xpath(target)).size() > 0) {
                for (int c = 0; c < 200; c++) {
                    if (drv.findElement(By.xpath(target)).isDisplayed() &&
                            drv.findElement(By.xpath(target)).isEnabled()) {
                        break;
                    }
                    slp(1);
                }
                break;
            }
            slp(1);
        }
        return drv.findElement(By.xpath(target));
    }




    public static WebElement waitElementnew(String target) {
        for (int i = 0; i < 50; i++)    {
            if (drv.findElement(By.xpath(target)).isDisplayed())  {
                System.out.println("break"+i);
                break;

            }
            System.out.println(i);
            slp(1);
        }
        return drv.findElement(By.xpath(target));
    }
    /*public static WebElement waitElementDisplayedByXpath(String target) {
        for (int i = 0; i < 250; i++)    {
            if (waitElementByXpath(target).isDisplayed()) {
                break;
            }
            slp(1);
        }
        return waitElementByXpath(target);
    }*/
    public static WebElement waitElementDisplayedByXpath(String target) {
        for (int i = 0; i < 250; i++)    {
            if (drv.findElement(By.xpath(target)).isEnabled()) {
                System.out.println(drv.findElement(By.xpath(target)).isEnabled());
                break;
            }
            slp(1);
        }
        return drv.findElement(By.xpath(target));
    }

    public static boolean isElementExist(String target) {
        if (TestHelper.drv.findElement(By.xpath(target)).isDisplayed() &&
                TestHelper.drv.findElement(By.xpath(target)).isEnabled()) {
            return true;
        } else {
            return false;
        }
    }

    public static void quit(){
        drv.quit();
    }
    public static void slp(long sec){
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


/*WebDriver driver = new FirefoxDriver();
  drv.get("http://only-testing-blog.blogspot.in");
  String i = driver.getCurrentUrl();
  System.out.println(i);
  driver.close();*/


/**
 * Private method that acts as an arbiter of implicit timeouts of sorts.. sort of like a Wait For Ajax method.
 *//*
private WebElement waitForElement(By by) {
    int attempts = 0;
    int size = driver.findElements(by).size();

    while (size == 0) {
        size = driver.findElements(by).size();
        if (attempts == MAX_ATTEMPTS) fail(String.format("Could not find %s after %d seconds",
                by.toString(),
                MAX_ATTEMPTS));
        attempts++;
        try {
            Thread.sleep(1000); // sleep for 1 second.
        } catch (Exception x) {
            fail("Failed due to an exception during Thread.sleep!");
            x.printStackTrace();
        }
    }

    if (size > 1) System.err.println("WARN: There are more than 1 " + by.toString() + " 's!");

    return driver.findElement(by);
}
*/