package com.prayersconnect.utilities;


import org.apache.commons.logging.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

    Properties properties;

    public ReadConfig(){

        Logger Log = LogManager.getLogger(ReadConfig.class.getName());
        //Log = LogManager.getLogger(BrowserSetUp.class.getName());

        File file = new File("src/Configuration/config.properties");

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            properties = new Properties();
            properties.load(fileInputStream);
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }

    public String getMainURL(){
        String mainURL = properties.getProperty("mainURL");
        return mainURL;

    }

    public String getAcceptCookiesXPath(){
        String acceptCookiesXPath = properties.getProperty("acceptCookiesXPath");
        return acceptCookiesXPath;
    }

    public String getAmricasPage(){
        String americasPage = properties.getProperty("AmericasPage");
        return americasPage;
    }

    public String getEuropePage(){
        String europePage = properties.getProperty("EuropePage");
        return europePage;
    }

    public String getAsiaPage(){
        String asiaPage = properties.getProperty("AsiaPage");
        return asiaPage;
    }

    public String getAfricaPage(){
        String africaPage = properties.getProperty("AfricaPage");
        return africaPage;
    }

    public String getOceaniaPage(){
        String oceaniaPage = properties.getProperty("OceaniaPage");
        return oceaniaPage;
    }

    public String getContinentNames(){
        String continentNames = properties.getProperty("continentNames");
        return continentNames;
    }

    public String getCountriesInsideAmericas(){
        String countriesInsideAmericas = properties.getProperty("countriesInsideAmericas");
        return countriesInsideAmericas;
    }

    public String getCountriesInsideEurope(){
        String countriesInsideEurope = properties.getProperty("countriesInsideEurope");
        return countriesInsideEurope;
    }

    public String getCountriesInsideAsia(){
        String countriesInsideAsia = properties.getProperty("countriesInsideAsia");
        return countriesInsideAsia;
    }

    public String getCountriesInsideAfrica(){
        String countriesInsideAfrica = properties.getProperty("countriesInsideAfrica");
        return countriesInsideAfrica;
    }

    public String getCountriesInsideOceania(){
        String countriesInsideOceania = properties.getProperty("countriesInsideOceania");
        return countriesInsideOceania;
    }

    public String getUnitedStatesXPath(){
        String unitedStatesXPath = properties.getProperty("unitedStatesXPath");
        return unitedStatesXPath;
    }
    public String getCanadaXPath(){
        String canadaXPath = properties.getProperty("canadaXPath");
        return canadaXPath;
    }
    public String getGuyanaXPath(){
        String guyanaXPath = properties.getProperty("guyanaXPath");
        return guyanaXPath;
    }

    public String getVenezuelaXPath(){
        String venezuelaXPath = properties.getProperty("venezuelaXPath");
        return venezuelaXPath;
    }
    public String getStatesInsideUnitedStates(){
        String statesInsideUnitedStates = properties.getProperty("statesInsideUnitedStates");
        return statesInsideUnitedStates;
    }
    public String getStatesInsideCanada(){
        String statesInsideCanada = properties.getProperty("provincesInsideCanada");
        return statesInsideCanada;
    }
    public String getStatesInsideGuyana(){
        String statesInsideGuyana = properties.getProperty("provincesInsideGuyana");
        return statesInsideGuyana;
    }
    public String getStatesInsideVenezuela(){
        String statesInsideVenezuela = properties.getProperty("statesInsideVenezuela");
        return statesInsideVenezuela;
    }












}
