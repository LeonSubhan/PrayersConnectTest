package mainPage;




import com.prayersconnect.browserSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;

public class firstPageBody extends browserSetUp {
    @Test
    public void continentnames() throws Exception {
        CommonDriver("edge");
        openMainURL();
        maximizeWindow();
        acceptcookie();
        List<WebElement> continentNames = driver.findElements(By.xpath("//h2[@class='MuiTypography-root MuiTypography-h2 MuiTypography-gutterBottom css-1c69lpz']"));
        System.out.println("Number of continent names: " + continentNames.size());
        for (int i = 0; i < continentNames.size(); i++) {
            System.out.println("Names of the continent: " +continentNames.get(i).getText());
        }
        driver.close();
    }
    @Test
    public void Americas() throws Exception {
        CommonDriver("firefox");
        openMainURL();
        maximizeWindow();
        acceptcookie();
        driver.findElement(By.xpath("//h2[contains(text(),'Americas (North & South)')]")).click();
        System.out.println("Americas is clicked");
        List<WebElement>countryNamesInsdeAmaricas = driver.findElements(By.xpath("//h2[@class='MuiTypography-root MuiTypography-h2 MuiTypography-gutterBottom css-1c69lpz']"));
        System.out.println("Number of country inside Americas is: " + countryNamesInsdeAmaricas.size());
        for (int j = 0; j < countryNamesInsdeAmaricas.size(); j++)
            System.out.println("Names of the country inside Americas: " + countryNamesInsdeAmaricas.get(j).getText());

        driver.close();
    }
    @Test
    public void Continent() throws Exception {
        CommonDriver("chrome");
        openMainURL();
        acceptcookie();
        List<WebElement>countryNamesInsideContinent = driver.findElements(By.xpath("//div[@class='MuiCardContent-root css-1nq31xy-cardContent']"));
        System.out.println("Number of countries inside each continents are: " + countryNamesInsideContinent.size());
        for (int k = 0; k < countryNamesInsideContinent.size(); k++)
            System.out.println("Names of the countries inside each continents are: " + countryNamesInsideContinent.get(k).getText());
        driver.close();
    }
    @Test
    public void Europe() throws Exception {
        CommonDriver("edge");
        openMainURL();
        maximizeWindow();
        acceptcookie();
        driver.findElement(By.xpath("//h2[contains(text(),'Europe')]")).click();
        System.out.println("Europe is clicked");
        sleep();
        List<WebElement>countryInsideEurope = driver.findElements(By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root css-1wmx74u-root']"));
        System.out.println("Numbers of countries inside Europe is: " + countryInsideEurope.size());
        for (int i = 0; i < countryInsideEurope.size(); i++)
            System.out.println("Names of the countries inside Europe are: " + countryInsideEurope.get(i).getText());
        driver.close();
    }
    @Test
    public void Asia() throws Exception {
        CommonDriver("firefox");
        openMainURL();
        maximizeWindow();
        acceptcookie();
        driver.findElement(By.xpath("//h2[contains(text(),'Asia')]")).click();
        System.out.println("Europe is clicked");
        sleep();
        List<WebElement>countriesInsideAsia = driver.findElements(By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root css-1wmx74u-root']"));
        System.out.println("Number of countries inside Asia is: " +countriesInsideAsia.size());
        for (int i = 0; i < countriesInsideAsia.size(); i++) {
            System.out.println("Manes of the countries inside Asia are: " + countriesInsideAsia.get(i).getText());
        }

        driver.close();
    }
    @Test
    public void Africa() throws Exception {
        CommonDriver("edge");
        openMainURL();
        maximizeWindow();
        acceptcookie();
        driver.findElement(By.xpath("//h2[contains(text(),'Africa')]")).click();
        System.out.println("Europe is clicked");
        sleep();
        List<WebElement>countriesInsideAsia = driver.findElements(By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root css-1wmx74u-root']"));
        System.out.println("Number of countries inside Asia is: " +countriesInsideAsia.size());
        for (int i = 0; i < countriesInsideAsia.size(); i++) {
            System.out.println("Manes of the countries inside Asia are: " + countriesInsideAsia.get(i).getText());
        }

        driver.close();
    }
    @Test
    public void Oceania() throws Exception {
        CommonDriver("firefox");
        openMainURL();
        maximizeWindow();
        acceptcookie();
        driver.findElement(By.xpath("//h2[contains(text(),'Oceania')]")).click();
        System.out.println("Oceania is clicked");
        sleep();
        List<WebElement>countriesInsideOceania = driver.findElements(By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root css-1wmx74u-root']"));
        System.out.println("Number of countries inside Oceania is: " +countriesInsideOceania.size());
        for (int i = 0; i < countriesInsideOceania.size(); i++) {
            System.out.println("Manes of the countries inside Asia are: " + countriesInsideOceania.get(i).getText());
        }

        driver.close();
    }

}
