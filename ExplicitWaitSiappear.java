package Week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitSiappear {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		 driver.get("http://www.leafground.com/pages/disapper.html");
		driver.manage().window().maximize();
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
       
       WebElement button= driver.findElement(By.id("btn"));
       
 //to disppear explicit wait
       
		wait.until(ExpectedConditions.invisibilityOf(button));
		
		String quotes=driver.findElement(By.tagName("strong")).getText();
		System.out.println(" The Text is : " + quotes);
	}

}
