package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement loginbtn = driver.findElement(By.className("decorativeSubmit"));
		loginbtn.click();
		WebElement crmLink = driver.findElement(By.partialLinkText("CRM"));
		crmLink.click();
		WebElement contacts = driver.findElement(By.xpath("//a[text()='Contacts']"));
		contacts.click();
		WebElement createContacts = driver.findElement(By.xpath("//a[text()='Create Contact']"));
		createContacts.click();
		WebElement firstName = driver.findElement(By.id("firstNameField"));
		firstName.sendKeys("Hari");
		WebElement lastName = driver.findElement(By.id("lastNameField"));
		lastName.sendKeys("Haran");
		WebElement department = driver.findElement(By.id("createContactForm_departmentName"));
		department.sendKeys("Electronics and Communication");
		WebElement description = driver.findElement(By.id("createContactForm_description"));
		description.sendKeys("Happy Coding..........Happy coding....I am an Automation Tester...");
		WebElement emailId = driver.findElement(By.id("createContactForm_primaryEmail"));
		emailId.sendKeys("hari.ceoa@gmail.com");
		WebElement selectState = driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
		Select sec = new Select(selectState);
		sec.selectByVisibleText("New York");
		WebElement btn = driver.findElement(By.className("smallSubmit"));
		btn.click();
		WebElement editbtn = driver.findElement(By.xpath("//a[text()='Edit']"));
		editbtn.click();
		WebElement clear = driver.findElement(By.id("updateContactForm_description"));
		clear.clear();
		WebElement impNoteField = driver.findElement(By.id("updateContactForm_importantNote"));
		impNoteField.sendKeys("Please help me to become an automation tester");
		WebElement update = driver.findElement(By.className("smallSubmit"));
		update.click();
		String getUrl = driver.getCurrentUrl();
		System.out.println(getUrl);






	}

}
