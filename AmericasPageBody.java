package com.prayersconnect.pageObjects.americas.americasPage;

import com.prayersconnect.baseClass.BrowserSetUp;
import com.prayersconnect.extentReportListener.ExtentReportListener;
import com.prayersconnect.utilities.ReadConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;

import java.io.IOException;
import java.util.List;


public class AmericasPageBody extends BrowserSetUp {

    static ReadConfig readConfig = new ReadConfig();

    WebDriver webDriver;

    //ExtentReportListener extentReportListener = new ExtentReportListener(extent);

    public AmericasPageBody(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickOnAmericas() throws IOException {
       webDriver.findElement(By.xpath(readConfig.getAmricasPage())).click();
       sleep();
        try {
            boolean text = webDriver.findElement(By.xpath(readConfig.getAmricasPage())).getText().equalsIgnoreCase("Americas (North & South)");
            System.out.println("Is Americas page is clicked: " + text);
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
        List<WebElement> continentNamesInSideAmericasList = webDriver.findElements(By.xpath(readConfig.getCountriesInsideAmericas()));
        System.out.println("Number of countries inside americas are: " + continentNamesInSideAmericasList.size());
        //Log.info("Number of countries inside americas are: " + continentNamesInSideAmericasList.size());
    }
    public void getCountryInformationInsideAmericas(){
        List<WebElement> continentNamesInSideAmericasList = webDriver.findElements(By.xpath(readConfig.getCountriesInsideAmericas()));
        System.out.println("Number of countries inside americas are: " + continentNamesInSideAmericasList.size());
        //Log.info("Number of countries inside americas are: " + continentNamesInSideAmericasList.size());
        for (int i = 0; i < continentNamesInSideAmericasList.size(); i++)
            System.out.println("Names of the countries inside americas are: " + continentNamesInSideAmericasList.get(i).getText());
    }
    public void ClickOnUnitedStates(){
        webDriver.findElement(By.xpath(readConfig.getGuyanaXPath())).click();
        sleep();
        try {
            boolean text = webDriver.findElement(By.xpath(readConfig.getCanadaXPath())).getText().equalsIgnoreCase("United States");
            System.out.println("Is United States page is clicked: " + text);
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
        List<WebElement> stateNamesInSideUnitedStatesList = webDriver.findElements(By.xpath(readConfig.getStatesInsideGuyana()));
        System.out.println("Number of states inside United States are: " + stateNamesInSideUnitedStatesList.size());
        //Log.info("Number of states inside United States are: " + continentNamesInSideUnitedStatesList.size());
        for (int i = 0; i < stateNamesInSideUnitedStatesList.size(); i++)
            System.out.println("Names of the countries inside United States are: " + stateNamesInSideUnitedStatesList.get(i).getText());
    }



}
