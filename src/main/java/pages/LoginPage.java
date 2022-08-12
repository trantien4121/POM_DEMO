package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private By emailField = By.id("username");
    private By passwordField = By.id("password");
    private By loginBtn = By.xpath("//input[@value='Login']");

    private By successfullyTitle = By.xpath("//div[@id='content']/h1");

    public WebElement getEmailField(){
        return driver.findElement(emailField);
    }

    public WebElement getPasswordField(){
        return driver.findElement(passwordField);
    }

    public WebElement getLoginBtn(){
        return  driver.findElement(loginBtn);
    }
    public void login(String email, String password){
        this.getEmailField().sendKeys(email);
        this.getPasswordField().sendKeys(password);
        this.getLoginBtn().click();
    }

    public String getSuccessTitle(){
        return driver.findElement(successfullyTitle).getText();
    }
}
