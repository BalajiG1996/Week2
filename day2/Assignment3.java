package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
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
		WebElement leads = driver.findElement(By.xpath("//a[text()='Leads']"));
		leads.click();
		WebElement findLeads = driver.findElement(By.xpath("//a[text()='Find Leads']"));
		findLeads.click();
		WebElement phone = driver.findElement(By.xpath("//span[text()='Phone']"));
		phone.click();
		WebElement phoneNumber = driver.findElement(By.name("phoneNumber"));
		phoneNumber.sendKeys("99");
		WebElement findLeadsbtn = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findLeadsbtn.click();
		Thread.sleep(5000);
		String leadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(leadId);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(text);
		if (text.contains("No records to display")) {
			System.out.println("Text Matched");
		} else {
			System.out.println("Text Not Match");
		}
		driver.close();
	}
}