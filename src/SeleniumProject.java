import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumProject{
	
	
	public static void main(String [] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://eticket.railway.gov.bd/login/en");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(2000);
		
		WebElement element1 = driver.findElement(By.id("mobile_number"));
		element1.sendKeys("01943780906");
		
		Thread.sleep(2000);
		
		WebElement element2 = driver.findElement(By.id("password"));
		element2.sendKeys("23011998");
		
		Thread.sleep(2000);
		
		WebElement element3 = driver.findElement(By.className("login-form-submit-btn"));
		element3.submit();
		
		Thread.sleep(2000);
		
		WebElement element4 = driver.findElement(By.className("agree-btn"));	
		element4.click();
		
		Thread.sleep(2000);
		
		WebElement element5 = driver.findElement(By.id("dest_from"));
		element5.sendKeys("Dhaka");
		
		Thread.sleep(2000);
		
		WebElement element6 = driver.findElement(By.id("dest_to"));
		element6.sendKeys("Chattogram");
		
		Thread.sleep(2000);
		
		WebElement element7 = driver.findElement(By.xpath("//input[@id='doj']"));	
		element7.click();
		
		new WebDriverWait(driver,Duration.ofSeconds(2))
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar")));
		
	    String monthYearVal = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(monthYearVal);
		
		driver.findElement(By.xpath("//a[text()='9']")).click();
		
		driver.findElement(By.id("choose_class")).click();
		
		driver.findElement(By.xpath("//option[@value='SNIGDHA']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
		driver.quit();
		
		
	}
}