package SeleniumBasics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base1 {
	
	static WebDriver driver;
	
	static void setProperties() {
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\Selenium\\ChromeDriver.exe"); 
		
	}
	
	static void openBrowser(String browser) {
		
		setProperties();
		
		if(browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		
	}

}


