package org.awaed;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private By txtUserName = By.xpath("//input[@type='text']");
    private By txtPassword = By.xpath("//input[@type='password']");
    private By btnLogin = By.xpath("//button[@type='submit']");

    public void setTxtUserName(String userName){
        setText(txtUserName, userName);
    }

    public void setTxtPassword(String password){
        setText(txtPassword, password);
    }

    public void pressLogin(){
        click(btnLogin);
    }
}
