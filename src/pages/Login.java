package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver driver;
    By username = By.id("formHorizontalEmail");
    By password = By.id("formHorizontalPassword");
    By login = By.className("btn-submit");

    public Login(WebDriver webdriver) {
        this.driver = webdriver;

    }
    public void setUserName(String userNameVal) {
        driver.findElement(username).sendKeys(userNameVal);
    }
    public void setPassword(String passwordVal) {
        driver.findElement(password).sendKeys(passwordVal);
    }
    public void clickLogin() {
        driver.findElement(login).click();
    }
    public void Login(String userNameVal, String passwordVal) {
        this.setUserName(userNameVal);
        this.setPassword(passwordVal);
        this.clickLogin();
    }
}
