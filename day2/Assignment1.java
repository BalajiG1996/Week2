package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Assignment1 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement clickCreateNewAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
		clickCreateNewAccount.click();
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Guru");
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Samy");
		WebElement phoneNumber = driver.findElement(By.name("reg_email__"));
		phoneNumber.sendKeys("0000000000");
		WebElement password = driver.findElement(By.id("password_step_input"));
		password.sendKeys("BalajiG");
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select sec = new Select(day);
		sec.selectByIndex(6);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select sec1 = new Select(month);
		sec1.selectByIndex(10);
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select sec2 = new Select(year);
		sec2.selectByIndex(0);
		WebElement clickFemale = driver.findElement(By.xpath("//label[text()='Female']"));
		clickFemale.click();
	}
}