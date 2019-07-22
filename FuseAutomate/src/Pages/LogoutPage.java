package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
	
	  WebDriver driver;

	    public void logingOut() throws InterruptedException {
	        driver.findElement(By.cssSelector("body > div:nth-child(1) > header > div > div > div.b-topbar-navigation > ul > li.b-topbar-sidemenu-link > span > i")).click();
	        System.out.println("pass click on sidebar");
	        Thread.sleep(2000);
	        driver.findElement(By.linkText("Log out")).click();
	        System.out.println("pass logged out");

	    }

	    public void confirmLogout(){
	        String data = driver.findElement(By.linkText("Support")).getText();
	        System.out.println("Support: "+data);
	        System.out.println("confirm logout text");
	    }

	    //constructor initializes state of the driver
	    public LogoutPage(WebDriver driver) {
	        this.driver = driver;
	    }

	}




