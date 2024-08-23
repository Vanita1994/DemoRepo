package com.saucelabs.qa.Pages;

import com.saucelabs.qa.Base.TestBase;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    public String getHomepageTitle(){
        return driver.getTitle();
    }

}
