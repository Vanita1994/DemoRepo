package com.saucelabs.qa.Pages;

import com.saucelabs.qa.Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
    public LoginPage loginPage;
    public HomePage homePage;
    @FindBy(id = "user-name")
    WebElement uname;
    @FindBy(id = "password")
    WebElement upwd;
    @FindBy(id="login-button")
    WebElement btnlogin;
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public HomePage clicklogin(String username,String password){
        uname.sendKeys(username);
        upwd.sendKeys(password);
        btnlogin.click();
        return new HomePage();
    }

}
