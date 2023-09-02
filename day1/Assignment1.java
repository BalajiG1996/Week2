package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {
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
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Lister Technologies");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Salman");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Balaji");


		WebElement sourceDropdown = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		Select sec = new Select(sourceDropdown);
		sec.selectByVisibleText("Employee");

		WebElement marketingCampaign = driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']"));
		Select sec2 = new Select(marketingCampaign);
		sec2.selectByValue("9001");

		WebElement ownership = driver.findElement(By.xpath("//select[@id='createLeadForm_ownershipEnumId']"));
		Select sec3 = new Select(ownership);
		sec3.selectByIndex(5);

		WebElement country = driver.findElement(By.xpath("//select[@id='createLeadForm_generalCountryGeoId']"));
		Select sec4 = new Select(country);
		sec4.selectByVisibleText("India");
		
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println("Title of the resulting page is :"+ title);
	}}















