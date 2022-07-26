package dnv_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dnv_test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
try {
			
			//go to url
			driver.get("https://www.dnv.com/");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			//accept cookies
			driver.findElement(By.id("onetrust-accept-btn-handler")).click();
			Thread.sleep(1000);
			
			//scroll in website
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,2600)", "");
			Thread.sleep(2000);
			
			
			//find search
			WebElement search=driver.findElement(By.xpath("/html/body/section/div[2]/section/div[2]/span/span/input"));
			Thread.sleep(2000);
			
			//write text in search
			search.sendKeys("Solar energy");
			
			//press the search key
			driver.findElement(By.xpath("//span[@class='search-ribbon__search-submit']")).click();
			Thread.sleep(2000);
			
			//look the new and press
			WebElement news= driver.findElement(By.xpath("//h2[contains(text(),'Addendum to the 2019 Solar Energy Assessment Valid')]"));
			news.click();
			Thread.sleep(2000);
			
			
		
			
		
			

			
		}catch(Exception e) { 	
			e.printStackTrace();
		}finally {
			driver.quit();
		}
	}

}
