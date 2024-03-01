package com.prayersconnect.pageObjects.americas.guyana.guyanaPage;

import com.prayersconnect.baseClass.BrowserSetUp;
import com.prayersconnect.utilities.ReadConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GuyanaPageBody extends BrowserSetUp {
    static ReadConfig readConfig = new ReadConfig();
    WebDriver webDriver;

    public GuyanaPageBody(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickOnCanada(){
        webDriver.findElement(By.xpath(readConfig.getGuyanaXPath()));
        sleep();
        try {
            boolean test = webDriver.findElement(By.xpath(readConfig.getGuyanaXPath())).getText().equalsIgnoreCase("Canada");
            if(test){
                System.out.println("Guyana is clicked");
            }
            else{
                System.out.println("Guyana is not clicked");
            }
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }

    }
    public void getStateInformationInsideGuyana(){
        List<WebElement> stateInformationInsideGuyana = webDriver.findElements(By.xpath(readConfig.getStatesInsideGuyana()));
        System.out.println("Number of states inside Canada: "+stateInformationInsideGuyana.size());
        for (int i = 0; i < stateInformationInsideGuyana.size(); i++) {
            System.out.println("Information of province: "+stateInformationInsideGuyana.get(i).getText());
        }
    }

    public void clickOnGuyana1(){
        webDriver.findElement(By.xpath(readConfig.getGuyanaXPath())).click();
        sleep();
        try {
            boolean text = webDriver.findElement(By.xpath(readConfig.getGuyanaXPath())).getText().equalsIgnoreCase("Guyana");
            System.out.println("Is Guyana page is clicked: " + text);
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
        List<WebElement> stateNamesInSideGuyanaList = webDriver.findElements(By.xpath(readConfig.getStatesInsideGuyana()));
        System.out.println("Number of states inside Guyana are: " + stateNamesInSideGuyanaList.size());
        //Log.info("Number of provinces inside Canada are: " + continentNamesInSideUnitedStatesList.size());
        for (int i = 0; i < stateNamesInSideGuyanaList.size(); i++)
            System.out.println("Names of the provinces inside Guyana are: " + stateNamesInSideGuyanaList.get(i).getText());
    }
}
