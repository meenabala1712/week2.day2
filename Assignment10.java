package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment10 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leafground.com/pages/checkbox.html");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		 boolean b = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input")).isSelected();
		 System.out.println(b);
		 driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following::input)[2]")).click();
		 driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[1]")).click();
		 driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[2]")).click();
		 driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[3]")).click();
		 driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[4]")).click();
		 driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[5]")).click();
		 
	}

}
