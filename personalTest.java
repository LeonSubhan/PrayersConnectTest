package com.prayersconnect.ManualTestHelper;

import com.prayersconnect.browserSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class personalTest extends browserSetUp {

    public static String NewYorkXpath = "//h2[contains(text(),'New York')]";

    public static String AmericasXpath = "//h2[contains(text(),'Americas (North & South)')]";
    public static String UnitedStatesXpath = "//h2[contains(text(),'United States')]";


    @Test
    public void testNewYorkPage() throws Exception {
        CommonDriver("edge");

        openMainURL();

        acceptcookie();
        sleep();
        driver.findElement(By.xpath(AmericasXpath)).click();
        sleep();
        driver.findElement(By.xpath(UnitedStatesXpath)).click();
        sleep();

        driver.findElement(By.xpath(NewYorkXpath)).click();
        sleep();
        List<WebElement> PagesInsideNewYork = driver.findElements(By.tagName("li"));
        System.out.println("Number of pages inside New York is: " + PagesInsideNewYork.size());
        int page = 0;
        while (page < PagesInsideNewYork.size()) {
            PagesInsideNewYork.get(page).click();
            System.out.println(driver.getCurrentUrl());

            sleep();
            List<WebElement> MosqueInformationInsideNewYork = driver.findElements(By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-12 MuiGrid-grid-md-6 MuiGrid-grid-lg-3 css-3sgsy6']"));
            System.out.println("Number of mosques inside New York is: " + MosqueInformationInsideNewYork.size());
            for (int i = 0; i < MosqueInformationInsideNewYork.size(); i++) {
                System.out.println("Information about the mosques inside New York are: " + MosqueInformationInsideNewYork.get(i).getText());
            }
            sleep();
            page++;
        }
        driver.close();
    }
}
