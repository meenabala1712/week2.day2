package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {

	public static void main(String[] args) {
		//Duplicate Lead
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
		 driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[3]/div[1]/a[1]")).click();
		 driver.findElement(By.linkText("Duplicate Lead")).click();
		 WebElement header = driver.findElement(By.xpath("//div[@class='x-panel-header sectionHeaderTitle']"));
		 String h1 =  header.getText();
		 System.out.println(h1);
		 driver.findElement(By.className("smallSubmit")).click();
		 WebElement fname = driver.findElement(By.xpath("//span[text()='Ish']"));
		String f1 = fname.getText();
		System.out.println(f1);
		 driver.close();
	}

}
