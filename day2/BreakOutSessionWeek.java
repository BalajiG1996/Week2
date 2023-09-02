package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BreakOutSessionWeek {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		//form{@class='css-1upamjb']/input
		WebElement search = driver.findElement(By.xpath("//form[contains(@class,'CSS')]/input"));
		search.sendKeys("Nykaa Cosmetics");
	}

}
