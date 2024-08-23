package com.saucelabs.qa.Base;

import com.saucelabs.qa.Utils.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {
    public static WebDriver driver;
    public static Properties prop;

    public TestBase(){
        prop=new Properties();
        try {
            FileInputStream fip=new FileInputStream("C:\\Users\\Amitkumar Patel\\OneDrive\\Desktop\\TestFunda\\PageObjectModelConcept\\src\\main\\java\\com\\saucelabs\\qa\\Config\\config.properties");
            prop.load(fip);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void init(){

        if(prop.getProperty("browser").equals("chrome")){
            driver=new ChromeDriver();
            driver.get(prop.getProperty("url"));

        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICITWAIT_TIMEOUT));

    }
}
