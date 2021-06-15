package SeleniumBasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Flipkartsamsung
{
   public static void main(String args[]) 
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Tools\\Selenium\\ChromeDriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://flipkart.com");
		WebElement search = driver.findElement(By.name("q"));
		
		String tofind = "samsung";
		
		WebElement element = driver.findElement(By.className("_2QfC02"));
		WebElement child = element.findElement(By.tagName("button"));
		child.click();
		
		WebElement results = driver.findElement(By.className("_3704LK"));
	       results.sendKeys(tofind);
	       
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	    WebElement last = driver.findElement(By.xpath("(//div[@class = 'lrtEPN _17d0yO'])[last()]"));
	      
	      
	     WebDriverWait myWait = new WebDriverWait(driver, 10);
	     myWait.until(ExpectedConditions.textToBePresentInElement(last, tofind));
	        
	      
	    List<WebElement> elements = driver.findElements(By.xpath("//div[@class = 'lrtEPN _17d0yO']"));
	     
	     {
	    	 for(WebElement ele : elements)
	    	 System.out.println(ele.getText());
	     }
		
   }
}
