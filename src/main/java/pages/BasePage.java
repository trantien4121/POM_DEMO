package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    public WebDriver driver;

    public enum Menu{
        Home("Home", "//span[text()='Home']"),
        FAQ("FAQ", "//span[text()='FAQ']"),
        Contact("Contact", "//span[text()='Contact']"),
        Timetable("Timetable", "//span[text()='Timetable']"),
        Ticket_Price("Ticket Price", "//span[text()='Ticket price']"),
        Book_Ticket("Book ticket", "//span[text()='Book ticket']"),
        Register("Register", "//span[text()='Register']"),
        Login("Login", "//span[text()='Login']");

        public final String menuItemName;
        public final String menuItemXpath;

        Menu(String menuItemName, String menuItemXpath) {
            this.menuItemName = menuItemName;
            this.menuItemXpath = menuItemXpath;
        }
    }

    private By btnLoginPage = By.xpath(Menu.Login.menuItemXpath);
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage goToLogin(){
        driver.findElement(btnLoginPage).click();
        return new LoginPage(driver);
    }


}
