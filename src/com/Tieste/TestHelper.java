package com.tieste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHelper {

    public static String url = "http://temp:tiernansteve@st.apppicker.com";
    public static String url_ukr_net="https://www.ukr.net/";
    public static WebDriver drv;

    public static String master="//tr[1]/td[2]/input";
    public static String siteName="//tr[2]/td[2]/input";
    public static String buttonGenerate="//*[@value='Generate']";


    public static void setup(String url){
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
                //"/usr/local/bin/chromedriver");
        drv = new ChromeDriver();
        drv.get(url);
        drv.manage().window().maximize();
    }

    public static WebElement cyclicElementSearchByXpath(String target) {
        for (int i = 0; i < 50; i++)    {
            if ((drv.findElements(By.xpath(target)).size() > 0) || ((drv.findElement(By.xpath(target)).isDisplayed())))  {
                System.out.println("break"+i);
                break;

            }
            System.out.println(i);
            slp(1);
        }
        return drv.findElement(By.xpath(target));
    }
    public static WebElement waitElementByXpath(String target) {
        for (int i = 0; i < 250; i++)    {
            if (drv.findElements(By.xpath(target)).size() != 0) {
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
                break;
            }
            slp(1);
        }
        return drv.findElement(By.xpath(target));
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