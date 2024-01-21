package com.prayersconnect;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class browserSetUp {

    public static WebDriver driver;
    private static final String mainURL = "https://prayersconnect.com/";
    String className = "MuiGrid-root MuiGrid-item css-1wxaqej";

    public void CommonDriver (String browserType) throws Exception {
        //Log.info("Browser is Open");
        if (browserType.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
            //Log.info("Chrome driver is open");
        } else if (browserType.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
            //Log.info("Edge driver is open");
        } else if (browserType.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
            //Log.info("Firefox driver is open");
        } else if (browserType.equalsIgnoreCase("safari")) {
            driver = new SafariDriver();
            //Log.info("Safari driver is open");
        } else {throw new Exception("Unknown browser type: " + browserType);}
    }

    public static void firefoxSetUp() {
        driver = new FirefoxDriver();
        System.out.println("Firefox Driver is ready");
        //Log.info("Firefox Driver is ready");
    }
    public static void chromeSetUp() {
        driver = new ChromeDriver();
        System.out.println("Chrome Driver is ready");
        //Log.info("Chrome Driver is ready");
        //Assert.assertEquals(driver.getTitle(), "Prayers Connect");
    }
    public static void edgeSetup() {
        driver = new EdgeDriver();
        System.out.println("Edge Driver is open");
        //Log.info("Edge driver is open");
    }
    public static void safariSetUp() {
        driver = new SafariDriver();
        System.out.println("Safari driver is ready");
        //Log.info("Safari driver is ready");
    }

    public static void openMainURL() {
        driver.get(mainURL);
        System.out.println("Prayers Connect is opened");
        String expectedUrl = mainURL;
        //Log.info("Prayers Connect is opened");
        //Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
        sleep();
    }

    public static void quitBrowser() {
        driver.quit();
        System.out.println("Browser is closed");
        //Log.info("Browser quit successfully");
    }
    public static void closeBrowser() {
        driver.close();
        System.out.println("Browser is closed");
        //Log.info("Browser close successfully");
    }

    public static void acceptcookies1() {
        driver.manage().deleteAllCookies();
        System.out.println("Cookies are accepted");
        //Log.info("Cookies accepted");
    }

    public static void acceptcookie() {
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/button[1]")).click();
        System.out.println("Cookies are accepted");
        //Log.info("Cookies are accepted");
    }

    public static void timeout() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        System.out.println("Timeout is set");
        //Log.info("Timeout is set for driver for 3 seconds");
    }

    public static void sleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread is sleeping for  seconds");
        //Log.info("Thread is sleeping for 3 seconds");

    }
    public static void maximizeWindow() {
        driver.manage().window().maximize();
        System.out.println("Window is now maximized");
        //Log.info("Window is now maximized");
    }


    public static void testDonate() {
        chromeSetUp();
        openMainURL();
        driver.findElement(By.xpath("//*[@id=__next]/div[1]/header/div/div/div[2]/div")).click();
        System.out.println("Donate button is clicked");
        /*try {
            driver.switchTo().frame("new_donation");
        }
        catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }*/
        driver.switchTo().frame("donorbox");
        System.out.println("Donation frame is opened");
        sleep();
        Assert.assertTrue(driver.findElement(By.id("donorbox")).isDisplayed());
        if (driver.findElement(By.id("donorbox")).isDisplayed()) {
            System.out.println("Donation frame is displayed");
        } else {
            System.out.println("Donation frame is not displayed");
        }

        driver.findElement(By.id("plan_duration_one_time")).click();
        System.out.println("One time donation is clicked");
        sleep();
        Assert.assertTrue(driver.findElement(By.id("plan_duration_one_time")).isDisplayed());
        if (driver.findElement(By.id("plan_duration_one_time")).isDisplayed()) {
            System.out.println("One time donation is displayed");
        } else {
            System.out.println("One time donation is not displayed");
        }

        driver.findElement(By.id("plan_duration_monthly")).click();
        System.out.println("Monthly donation is clicked");
        sleep();
        Assert.assertTrue(driver.findElement(By.id("plan_duration_monthly")).isDisplayed());
        if (driver.findElement(By.id("plan_duration_monthly")).isDisplayed()) {
            System.out.println("Monthly donation is displayed");
        } else {
            System.out.println("Monthly donation is not displayed");
        }

        driver.findElement(By.id("plan_duration_annual")).click();
        System.out.println("Annually donation is clicked");
        Assert.assertTrue(driver.findElement(By.id("plan_duration_annual")).isDisplayed());
        if (driver.findElement(By.id("plan_duration_annual")).isDisplayed()) {
            System.out.println("Annually donation is displayed");
        } else {
            System.out.println("Annually donation is not displayed");
        }

        driver.findElement(By.id("other_currency")).click();
        System.out.println("Other currency is clicked");
        sleep();
        Assert.assertTrue(driver.findElement(By.id("other_currency")).isDisplayed());
        if (driver.findElement(By.id("other_currency")).isDisplayed()) {
            System.out.println("Other currency is displayed");
        } else {
            System.out.println("Other currency is not displayed");
        }

        driver.findElement(By.id("other_currency__option--0")).click();
        System.out.println("US Dollars is clicked");
        sleep();
        Assert.assertTrue(driver.findElement(By.id("other_currency__option--0")).isDisplayed());
        if (driver.findElement(By.id("other_currency__option--0")).isDisplayed()) {
            System.out.println("US Dollars is displayed");
        } else {
            System.out.println("US Dollars is not displayed");
        }

        driver.findElement(By.id("other_currency__option--1")).click();
        System.out.println("Australian Dollars is clicked");
        sleep();
        Assert.assertTrue(driver.findElement(By.id("other_currency__option--1")).isDisplayed());
        if (driver.findElement(By.id("other_currency__option--1")).isDisplayed()) {
            System.out.println("Australian Dollars is displayed");
        } else {
            System.out.println("Australian Dollars is not displayed");
        }

        driver.findElement(By.id("other_currency__option--2")).click();
        System.out.println("British Pound Sterling (GBP) is clicked");
        sleep();
        Assert.assertTrue(driver.findElement(By.id("other_currency__option--2")).isDisplayed());
        if (driver.findElement(By.id("other_currency__option--2")).isDisplayed()) {
            System.out.println("British Pound Sterling (GBP) is displayed");
        } else {
            System.out.println("British Pound Sterling (GBP) is not displayed");
        }

        driver.findElement(By.id("other_currency__option--3")).click();
        System.out.println("European Euro is clicked");
        sleep();
        Assert.assertTrue(driver.findElement(By.id("other_currency__option--3")).isDisplayed());
        if (driver.findElement(By.id("other_currency__option--3")).isDisplayed()) {
            System.out.println("European Euro is displayed");
        } else {
            System.out.println("European Euro is not displayed");
        }

       /* Actions actions = new Actions(driver);
        WebElement otherCurrency__listbox = driver.findElement(By.id("other_currency__listbox"));
       WebElement usDollars = driver.findElement(By.id("other_currency__option--0"));
        WebElement AustralianDollars = driver.findElement(By.id("other_currency__option--1"));
        WebElement otherCurrency = driver.findElement(By.id("other_currency"));
        //actions.moveToElement(otherCurrency__listbox);
        actions.moveToElement(otherCurrency).click().build().perform();
        System.out.println("Other currency is clicked to open the dropbox");
        Select select = new Select(otherCurrency__listbox);
        WebElement ulElement = driver.findElement(By.id("other_currency__listbox"));
        List<WebElement> options = ulElement.findElements(By.tagName("li"));
        for (WebElement li : options) {
            if (li.getText().equals("British Pound Sterling (GBP)")) {
                li.click();*/
    }
}








