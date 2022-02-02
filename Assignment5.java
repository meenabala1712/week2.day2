package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
	
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.manage().window().maximize();
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 WebElement userName = driver.findElement(By.id("username"));
		 userName.sendKeys("DemoCSR");
		 
		 //Enter the password
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click(); 
		 driver.findElement(By.linkText("Contacts")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.xpath("(//label[text()='First name:'])[3]/following::input")).sendKeys("hari");
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		 driver.findElement(By.linkText("Edit")).click();
		 driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		 driver.findElement(By.name("submitButton")).click();
		 driver.close();
			 

	}

}
