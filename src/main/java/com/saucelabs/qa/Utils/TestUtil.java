package com.saucelabs.qa.Utils;

import com.saucelabs.qa.Base.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class TestUtil extends TestBase {
    public static int PAGE_LOAD_TIMEOUT=20;
    public static int IMPLICITWAIT_TIMEOUT=20;
    public void switchToFrame(){
        driver.switchTo().frame("");
    }
    public class GetScreenShot {

        public static String capture(WebDriver driver, String screenShotName) throws IOException
        {
            TakesScreenshot ts = (TakesScreenshot)driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            String dest = System.getProperty("C:\\Users\\Amitkumar Patel\\OneDrive\\Desktop\\TestFunda\\PageObjectModelConcept\\test-output"+screenShotName+".png");
            System.out.println(dest);
            File destination = new File(dest);
            FileUtils.copyFile(source, destination);

            return dest;
        }
    }
}
