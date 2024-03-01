package com.prayersconnect.testCases.testFirstPage;

import com.aventstack.extentreports.ExtentReports;
import com.prayersconnect.baseClass.BrowserSetUp;
import com.prayersconnect.extentReportListener.ExtentReportListener;
import com.prayersconnect.pageObjects.firstPage.FirstPageBody;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.apache.logging.log4j.LogManager.getContext;
import static org.apache.logging.log4j.LogManager.getLogger;


public class Test_TC_firstpagebody_001 extends BrowserSetUp {


    //static ExtentReports extent = new ExtentReports();


    //public static String americasPageTittle = "https://prayersconnect.com/regions/countries?id=7";
    //public static String europePageTittle = "https://prayersconnect.com/regions/countries?id=1";
    //public static String asiaPageTittle = "https://prayersconnect.com/regions/countries?id=3";
    //public static String africaPageTittle = "https://prayersconnect.com/regions/countries?id=5";
    //public static String oceaniaPageTittle = "https://prayersconnect.com/regions/countries?id=9";



    @Test
    public void testFirstPageBody() throws IOException {
        //ExtentReportListener extentReportListener = new ExtentReportListener(extent);
        //extentReportListener.onTestStart();
        //Log = getLogger(Test_TC_firstpagebody_001.class.getName());
        commonSetUp("");
        //Log.info("Common Setup opened edge browser");
        openMainUrl();
        //Log.info("Main url opened");
        //maximizeWindow();
        //Log.info("Maximize window");
        acceptCookies();
        //Log.info("Accept cookies");
        FirstPageBody firstPageBody = new FirstPageBody(webDriver);
        //Log.info("First page body object created");
        firstPageBody.continent();
        //Log.info("Continent clicked");
        //Log.info("Current page is " + webDriver.getCurrentUrl());
        firstPageBody.americasPage();
        //Log.info("America page clicked");
        //Log.info("Current page is " + webDriver.getCurrentUrl());
        //if (webDriver.getTitle().equals(americasPageTittle))
        //{
          //  Assert.assertTrue(true);
            //Log.info("Page title is correct");
            //extentReportListener.addScreenshot(webDriver,"America page screenShot.png");
        //}
        //else
        //{
          //  Assert.assertFalse(false);
        //}
        //Log.info("All the country name in Americas are printed.");
        goBack();
        sleep();
        //Log.info("Current page is " + webDriver.getCurrentUrl());
        //Log.info("Sleeping for 3 seconds");
        firstPageBody.europePage();
        //Log.info("Europe page clicked");
        //if (webDriver.getTitle().equals(europePageTittle))
        //{
          //  Assert.assertTrue(true);
            //Log.info("Page title is correct");
        //}
        //else
        //{
          //  Assert.assertFalse(false);
        //}
        //Log.info("All the country name in Europe are printed.");
        sleep();
        //Log.info("Sleeping for 3 seconds");
        goBack();
        sleep();
        firstPageBody.asiaPage();
        //Log.info("Asia page clicked");
        //Log.info("Current page is " + webDriver.getCurrentUrl());
        //if (webDriver.getTitle().equals(asiaPageTittle))
        //{
          //  Assert.assertTrue(true);
            //Log.info("Page title is correct");
        //}
        //else
        //{
          //  Assert.assertFalse(false);
        //}
        //Log.info("All the country name in Asia are printed.");
        //Log.info("Sleeping for 3 seconds");
        goBack();
        sleep();
        firstPageBody.africaPage();
        /*Log.info("Africa page clicked");
        Log.info("Current page is " + webDriver.getCurrentUrl());
        if (webDriver.getTitle().equals(africaPageTittle))
        {
            Assert.assertTrue(true);
            Log.info("Page title is correct");
        }
        else
        {
            Assert.assertFalse(false);
        }
        Log.info("All the country name in Africa are printed.");*/
        sleep();
        //Log.info("Sleeping for 3 seconds");
        goBack();
        sleep();
        firstPageBody.oceaniaPage();
        /*Log.info("Current page is " + webDriver.getCurrentUrl());
        Log.info("Oceania page clicked");
        if (webDriver.getTitle().equals(oceaniaPageTittle))
        {
            Assert.assertTrue(true);
            Log.info("Page title is correct");
        }
        else
        {
            Assert.assertFalse(false);
        }
        Log.info("All the country name in Oceania are printed.");*/

        driverQuit();
    }



}
