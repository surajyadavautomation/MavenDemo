package DriverMain;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Generic {
public static WebDriver driver;
	
    
	public Generic(){
		 // Create object of ChromeOptions class
	    ChromeOptions options = new ChromeOptions();
	     
	    // add parameter which will disable the extension
	    options.addArguments("--disable-extensions");
	   // System.setProperty("webdriver.gecko.driver","/Users/Documents/geckodriver");
	    System.setProperty("webdriver.chrome.driver", "C://Software//chromedriver_win32//chromedriver.exe");
	    driver = new ChromeDriver(options);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    setDriver(driver);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		Generic.driver = driver;
	}
}
