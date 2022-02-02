package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://en-gb.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     driver.findElement(By.linkText("Create New Account")).click();
	     driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Meena");
	     driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Moorthy");
	     driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8939631999");
	     driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Password123");
	     
	     WebElement day1 = driver.findElement(By.xpath("//select[@id='day']"));
	     Select d1 = new Select(day1);
	    d1.selectByValue("14");
	    
	    WebElement month1 = driver.findElement(By.xpath("//select[@id='month']"));
	    Select m1 = new Select(month1);
	    m1.selectByVisibleText("Jan");
	    
	    WebElement year1 = driver.findElement(By.xpath("//select[@id='year']"));
	   Select y1 = new Select(year1);
	   y1.selectByVisibleText("1990");
	   
	  driver.findElement(By.xpath("//label[@class='_58mt']")).click();
	driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	
	}

}
