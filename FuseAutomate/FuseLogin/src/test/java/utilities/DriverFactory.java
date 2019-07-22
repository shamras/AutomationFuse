package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {
	
	//this method return a webdriver object

    public static WebDriver open(String BrowserType) {
        if(BrowserType.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\rassools\\Documents\\Selenium software\\GekoD\\geckodriver.exe");
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            capabilities.setCapability("marionette",true);
            return new FirefoxDriver(); }


        /////////////IE is bugy runs extremely slow so for now wont use this///
//		/*
////		}
//////		else if(BrowserType.equalsIgnoreCase("IE")) {
//////			System.setProperty("webdriver.ie.driver", "C:\\Users\\rassools\\Documents\\Selenium software\\IEDri\\IEDriverServer.exe");
//////			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
//////			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
//////
//////			return new InternetExplorerDriver();
////
////		}*/

        else {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe");
            return new ChromeDriver();

        }


    }}


