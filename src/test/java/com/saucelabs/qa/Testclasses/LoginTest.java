package com.saucelabs.qa.Testclasses;

import com.saucelabs.qa.Base.TestBase;
import com.saucelabs.qa.Pages.HomePage;
import com.saucelabs.qa.Pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.*;

public class LoginTest extends TestBase {
    LoginPage loginPage=new LoginPage();
    HomePage homePage;
    Logger logger= LogManager.getLogger(LoginTest.class);


    public LoginTest() {
     super();
    }
    @BeforeMethod
    public void setup(){
        init();

        loginPage=new LoginPage();
        logger.info("Setup");
    }

    @Test
    public void verifyloginbutton(){
        homePage=loginPage.clicklogin(prop.getProperty("username"),prop.getProperty("password"));
        logger.info("Test case Started");
    }

    @AfterMethod
    public void teardown(){
        logger.info("Browser quit");

        driver.quit();

    }

}
