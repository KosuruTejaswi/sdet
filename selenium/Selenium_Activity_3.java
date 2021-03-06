package Selenium_Java_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Activity_3 {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		String t = driver.getTitle();
		WebElement fn = driver.findElement(By.id("firstName"));
		WebElement ln = driver.findElement(By.id("lastName"));
		WebElement e = driver.findElement(By.id("email"));
		WebElement c = driver.findElement(By.id("number"));
		WebElement b = driver.findElement(By.cssSelector(".ui.green.button"));
		fn.sendKeys("Tejaswini");
		ln.sendKeys("Gowda");
		e.sendKeys("tsn@gmail.com");
		c.sendKeys("9790000288");
		System.out.println("Title of the page: "+t);
		b.click();
		Thread.sleep(5000);
		driver.close();
	}
}
