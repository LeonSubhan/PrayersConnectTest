package com.prayersconnect.pageObjects.americas.venezuela.venezuelaPage;

import com.prayersconnect.baseClass.BrowserSetUp;
import com.prayersconnect.utilities.ReadConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class VenezuelaPageBody extends BrowserSetUp {
    static ReadConfig readConfig = new ReadConfig();
    WebDriver webDriver;

    public VenezuelaPageBody(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickOnVenezuela(){
        webDriver.findElement(By.xpath(readConfig.getVenezuelaXPath()));
        sleep();
        try {
            boolean test = webDriver.findElement(By.xpath(readConfig.getVenezuelaXPath())).getText().equalsIgnoreCase("Venezuela");
            if(test){
                System.out.println("Venezuela is clicked");
            }
            else{
                System.out.println("Venezuela is not clicked");
            }
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }

    }
    public void getStateInformationInsideVenezuela(){
        List<WebElement> stateInformationInsideVenezuela = webDriver.findElements(By.xpath(readConfig.getStatesInsideVenezuela()));
        System.out.println("Number of states inside Canada: "+stateInformationInsideVenezuela.size());
        for (int i = 0; i < stateInformationInsideVenezuela.size(); i++) {
            System.out.println("Information of province: "+stateInformationInsideVenezuela.get(i).getText());
        }
    }

    public void clickOnGuyana1(){
        webDriver.findElement(By.xpath(readConfig.getVenezuelaXPath())).click();
        sleep();
        try {
            boolean text = webDriver.findElement(By.xpath(readConfig.getVenezuelaXPath())).getText().equalsIgnoreCase("Venezuela");
            System.out.println("Is Venezuela page is clicked: " + text);
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
        List<WebElement> stateNamesInSideVenezuelaList = webDriver.findElements(By.xpath(readConfig.getStatesInsideGuyana()));
        System.out.println("Number of states inside Venezuela are: " + stateNamesInSideVenezuelaList.size());
        //Log.info("Number of provinces inside Canada are: " + continentNamesInSideUnitedStatesList.size());
        for (int i = 0; i < stateNamesInSideVenezuelaList.size(); i++)
            System.out.println("Names of the provinces inside Venezuela are: " + stateNamesInSideVenezuelaList.get(i).getText());
    }
}
