package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public void setUserName(String username) {
        driver.findElement(By.id("user_login_name")).sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(By.id("user_password")).sendKeys(password);
    }

    public void clickSubmit() {
        driver.findElement(By.cssSelector("[type='submit']")).click();

    }

    public void acceptCookies() {
        driver.findElement(By.cssSelector(".b-accept-button")).click();
    }

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
}



