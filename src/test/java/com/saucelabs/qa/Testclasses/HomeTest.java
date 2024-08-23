package com.saucelabs.qa.Testclasses;

import com.saucelabs.qa.Base.TestBase;
import com.saucelabs.qa.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends TestBase {
    HomePage homePage;
    public HomeTest(){
        //init();
        homePage=new HomePage();
    }
    @Test
    public void verifyhomepageTitle(){
        Assert.assertEquals(driver.getTitle(),"Single Page Apps for GitHub Pages");
    }
}
