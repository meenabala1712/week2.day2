package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {
	//DeleteLead Program
	

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("DemoCSR");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click(); 
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		 driver.findElement(By.xpath("//input[@Name='phoneCountryCode']")).sendKeys("1");
		 driver.findElement(By.xpath("//input[@Name='phoneAreaCode']")).sendKeys("8939");
		 driver.findElement(By.xpath("//input[@Name='phoneNumber']")).sendKeys("631938");
		 driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		 driver.findElement(By.linkText("10735")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		 driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]/parent::em")).click();
		 driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10735");
		 driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		 WebElement msg = driver.findElement(By.xpath("//div[contains(text(),'No records to display')]"));
		 boolean msg1=msg.isDisplayed();
		 System.out.println(msg1);
		 
		 
		 
	}

}
