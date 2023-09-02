package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
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
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("balaji.ceoa@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

		String firstname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(firstname);

		String lastname = driver.findElement(By.id("viewLead_lastName_sp")).getText();
		System.out.println(lastname);

		driver.findElement(By.linkText("Duplicate Lead")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();


		//after duplicate 

		String firstname_new = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(firstname_new);

		String lastname_new = driver.findElement(By.id("viewLead_lastName_sp")).getText();
		System.out.println(lastname_new);

		if(firstname.equals(firstname_new) && lastname.equals(lastname_new))
		{
			System.out.println("Duplicate lead name is same as captured name");
		}

		else
		{
			System.out.println("Name mismatch");	
		}


		driver.close();
	}

}

