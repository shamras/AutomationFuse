package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	 WebDriver driver;


	    public void confirming_TRENDING_as_a_text() {
	        String data = driver.findElement(By.linkText("Trending")).getText();
	        System.out.println("Trending : " + data);

	    }

	    public void Clicking_on_a_Article() throws InterruptedException {
	        driver.findElement(By.linkText("Tom & Jerry")).click();
	        System.out.println("pass clicking tom jerry");
	        Thread.sleep(2000);
	    }

	    public void Click_HOME_on_the_string() throws InterruptedException {
	        driver.findElement(By.linkText("Home")).click();
	        System.out.println("pass going back to home if in tom and jerry");
	        Thread.sleep(2000);
	    }

	    public void clicking_on_leader_board() throws InterruptedException {
	        driver.findElement(By.cssSelector("body > div.h-page-article.widgets-and-sidebar > div.b-page-article-and-footer > div.l-page-article > article > div > div > div:nth-child(8) > div > div.b-widget-header > div.b-widget-title > div > a")).click();
	        System.out.println("pass clicking on leader board");
	        Thread.sleep(2000);
	    }

	    public void clicking_RainForestLogo() throws InterruptedException {
	        driver.findElement(By.cssSelector("#logo > img")).click();
	        System.out.println("pass back to dashboard by clicking on logo");
	        Thread.sleep(2000);
	    }
	    public DashboardPage(WebDriver driver) {
	        this.driver = driver;
	    }
	}




