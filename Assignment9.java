package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment9 {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leafground.com/pages/Image.html");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following-sibling::img")).click();
		 driver.navigate().back();
		 String string1 = driver.findElement(By.xpath("(//div[contains(@class,'large-6 small-12')]//img)[2]")).getAttribute("src");
		 System.out.println(string1);
		 driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img")).click();
	}

}
