package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment8 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leafground.com/pages/Link.html");
		 driver.manage().window().maximize();
		 driver.findElement(By.linkText("Go to Home Page")).click();
		 driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight']//img)[3]")).click();
		 String attribute = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		 System.out.println(attribute);
		 driver.findElement(By.linkText("Verify am I broken?")).click();
		 String text1 = driver.findElement(By.xpath("//h1[text()='HTTP Status 404 – Not Found']")).getText();
		 System.out.println(text1);
		 driver.navigate().back();
		 driver.findElement(By.linkText("Go to Home Page")).click();
		 driver.navigate().back();
		 int links = driver.findElements(By.tagName("a")).size();
		 System.out.println(links);
		  
		
		
	}

}
