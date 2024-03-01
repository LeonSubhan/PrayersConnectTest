package com.prayersconnect.pageObjects.americas.canada.canadaPage;

import com.prayersconnect.baseClass.BrowserSetUp;
import com.prayersconnect.utilities.ReadConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CanadaPageBody extends BrowserSetUp {
    static ReadConfig readConfig = new ReadConfig();
    WebDriver webDriver;

    public CanadaPageBody(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickOnCanada(){
        webDriver.findElement(By.xpath(readConfig.getUnitedStatesXPath()));
        sleep();
        try {
            boolean test = webDriver.findElement(By.xpath(readConfig.getCanadaXPath())).getText().equalsIgnoreCase("Canada");
            if(test){
                System.out.println("Canada is clicked");
            }
            else{
                System.out.println("Canada is not clicked");
            }
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }

    }
    public void getStateInformationInsideCanada(){
        List<WebElement> stateIndormationInsideCanada = webDriver.findElements(By.xpath(readConfig.getStatesInsideCanada()));
        System.out.println("Number of states inside Canada: "+stateIndormationInsideCanada.size());
        for (int i = 0; i < stateIndormationInsideCanada.size(); i++) {
            System.out.println("Information of province: "+stateIndormationInsideCanada.get(i).getText());
        }
    }

    public void clickOnCanada1(){
        webDriver.findElement(By.xpath(readConfig.getCanadaXPath())).click();
        sleep();
        try {
            boolean text = webDriver.findElement(By.xpath(readConfig.getCanadaXPath())).getText().equalsIgnoreCase("United States");
            System.out.println("Is Canada page is clicked: " + text);
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
        List<WebElement> stateNamesInSideCanadaList = webDriver.findElements(By.xpath(readConfig.getStatesInsideGuyana()));
        System.out.println("Number of states inside United States are: " + stateNamesInSideCanadaList.size());
        //Log.info("Number of provinces inside Canada are: " + continentNamesInSideUnitedStatesList.size());
        for (int i = 0; i < stateNamesInSideCanadaList.size(); i++)
            System.out.println("Names of the provinces inside Canada are: " + stateNamesInSideCanadaList.get(i).getText());
    }
}
