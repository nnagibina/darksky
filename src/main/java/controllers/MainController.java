package controllers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

import static configuration.Configuration.*;

public class MainController {

    private static WebDriver driver;
    private String URL;

    public MainController(String URL) {
        this.URL = URL;
    }

    public void initTestEnvironment() {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setJavascriptEnabled(true);


        System.setProperty(PROPERTY_CHROM_DRIVER, PATH_TO_WEB_DRIVER);
        driver = new ChromeDriver();
        System.out.println("WEB-Driver: [" + WEB_DRIVER + "] initialization success!");


        driver.manage().timeouts().implicitlyWait(TIME_OUT_WAIT, TimeUnit.SECONDS);


        driver.get(this.URL);
    }

    public WebDriver getDriver() {
        return driver;
    }

}