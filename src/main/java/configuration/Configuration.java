package configuration;

public interface Configuration {

//    String URL = "https://www.hotels.com/?pos=HCOM_US&locale=en_US";
    String WEB_DRIVER = "chrome";
    String PROPERTY_CHROM_DRIVER = "webdriver.chrome.driver";
    String PATH_TO_WEB_DRIVER = "/usr/local/bin/chromedriver";

    int TIME_OUT_WAIT = 10;
}
