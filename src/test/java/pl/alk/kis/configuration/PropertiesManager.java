package pl.alk.kis.configuration;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.Properties;

public class PropertiesManager {

    static Properties properties;

    public static void setupProperties() {
        properties = ConfigFileReader.getPropertiesFromFile("configuration.properties");
        Configuration.browser = getBrowserType();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=" + getLocale());
        options.addArguments("--disable-notifications");
        Configuration.browserCapabilities = options;
    }


    public static String getBrowserType() {
        return properties.getProperty("browser");
    }
    public static String getUrl(String lang) {
        if(lang == "pl") {
            return properties.getProperty("url_pl");
        } else {
            return properties.getProperty("url_en");
        }
    }

    public static String getLocale() {
        return properties.getProperty("locale");
    }
}
