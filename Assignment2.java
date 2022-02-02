package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {
//Create and Edit Contact
	public static void main(String[] args) {
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
		 driver.findElement(By.linkText("Create Contact")).click();
		 driver.findElement(By.id("firstNameField")).sendKeys("Meena");;
	     driver.findElement(By.id("lastNameField")).sendKeys("Bala");;
		 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Meena");
         driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Bala");
         driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Comp.Science");
         driver.findElement(By.id("createContactForm_description")).sendKeys("Creating Contact");
         driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("meenabala1712@gmail.com");
         //State/Province
         WebElement state1 = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
         Select dd1 = new Select(state1);
         dd1.selectByVisibleText("Indiana");
         driver.findElement(By.className("smallSubmit")).click();
	
         driver.findElement(By.linkText("Edit")).click();
         driver.findElement(By.id("updateContactForm_description")).clear();
         driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Adding Important Note");
         driver.findElement(By.xpath("//input[@value='Update']")).click();
         String title = driver.getTitle();
         System.out.println(title);
	}

}
