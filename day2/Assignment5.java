package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Find Leads")).click();

		driver.findElement(By.name("firstName")).sendKeys("Balaji");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

		String text2 = driver.getTitle();
		System.out.println(text2);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		WebElement updateCompany = driver.findElement(By.id("updateLeadForm_companyName"));
		updateCompany.clear();
		updateCompany.sendKeys("Bounteous");
		Thread.sleep(5000);

		driver.findElement(By.name("submitButton")).click();
		System.out.println("Updated");

		String newCompanyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(newCompanyName);


		driver.close();










	}
}