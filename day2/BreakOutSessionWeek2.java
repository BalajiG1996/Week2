package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BreakOutSessionWeek2 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//Attribute based xpath
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("demoSalesManager");
		//Attribute based xpath
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("crmsfa");
		//Attribute based xpath
		WebElement loginbtn = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		loginbtn.click();
		//Partial text based xpath
		WebElement clickCRMSFA = driver.findElement(By.xpath("//a[contains(text(),'CRM')]"));
		clickCRMSFA.click();
		//Text Based xpath
		WebElement clickLeads = driver.findElement(By.xpath("//a[text()='Leads']"));
		clickLeads.click();
	}
}
