package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();


		driver.findElement(By.name("firstName")).sendKeys("Salman");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		String title = driver.getTitle();
		System.out.println(title);

		WebElement OldName = driver.findElement(By.id("viewLead_companyName_sp"));
		String text1 = OldName.getText();
		System.out.println(text1);

		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		WebElement companyNameUpdate = driver.findElement(By.id("updateLeadForm_companyName"));
		companyNameUpdate.clear();
		companyNameUpdate.sendKeys("HCL Technologies");

		driver.findElement(By.name("submitButton")).click();

		//confirming the updated company name

		WebElement newName = driver.findElement(By.id("viewLead_companyName_sp"));
		String text2 = newName.getText();
		System.out.println(text2);

		if (text1 != text2) {
			System.out.println("Updated");
		} else {
			System.out.println("Not Updated");
		}
















	}
}