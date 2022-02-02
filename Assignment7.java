package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment7 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leafground.com/pages/Button.html");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
		 driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[2]")).click();
		 Point location = driver.findElement(By.xpath("//button[@id='position']")).getLocation();
		 System.out.println(location);
		 String cssValue = driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color");
		 System.out.println(cssValue);
		 Dimension size = driver.findElement(By.xpath("//button[@id='size']")).getSize();
		 System.out.println(size);
		 driver.close();	 
		 
	}

}
