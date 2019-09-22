package org.kart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bobcat {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91994\\eclipse-workspace\\flipkart\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver. get("https://www.bobcat.com/index");
WebElement popup = driver.findElement(By.xpath("//a[text()='Close']"));
popup.click();
WebElement first = driver.findElement(By.xpath("//a[@class='text-uppercase text-center has-sub dtm-att-txt-name']"));	
first.click();
	}
}
