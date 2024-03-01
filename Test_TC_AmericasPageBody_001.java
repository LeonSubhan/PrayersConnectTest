package com.prayersconnect.testCases.testAmericasPage;

import com.prayersconnect.baseClass.BrowserSetUp;
import com.prayersconnect.pageObjects.americas.americasPage.AmericasPageBody;
import com.prayersconnect.utilities.ReadConfig;
import org.testng.annotations.Test;

import java.io.IOException;

public class Test_TC_AmericasPageBody_001 extends BrowserSetUp {
    static ReadConfig readConfig = new ReadConfig();

    @Test
    public void testAmericasPageBody() throws IOException {
        commonSetUp("chrome");
        openMainUrl();
        sleep();
        AmericasPageBody americasPageBody = new AmericasPageBody(webDriver);
        //americasPageBody.clickOnAmericas();
        americasPageBody.ClickOnUnitedStates();




        americasPageBody.getCountryInformationInsideAmericas();
        americasPageBody.ClickOnUnitedStates();
    }
    

    
    
}
