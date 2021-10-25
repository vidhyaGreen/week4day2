package Week4day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectableUsingKeyboard {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    
		WebElement item1= driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item3= driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement item5= driver.findElement(By.xpath("//li[text()='Item 5']"));


		Actions Builder=new Actions(driver);
		
		//keysdown used for clicking down inkeyboard using control button
		//keysup used for inkeyboard using control button mvoing above

        Builder.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).keyUp(Keys.CONTROL).perform();
}

}