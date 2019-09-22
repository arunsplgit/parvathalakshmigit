package org.kart;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest 
{
	public static void main(String[]args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\91994\\eclipse-workspace\\flipkart\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
WebElement pop=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
pop.click();
Thread.sleep(3000);
WebElement men=driver.findElement(By.xpath("//span[text()='Men']"));
men.click();
Thread.sleep(3000);
WebElement titan=driver.findElement(By.xpath("//a[text()='Titan']"));
titan.click();
//WebElement watch=driver.findElement(By.xpath("//div[@class='_3O0U0u _288RSE'])[1]"));
List<WebElement>watch1=driver.findElements(By.xpath("(//div[@class='bhgxx2 col-12-12'])[1]"));
for(int i=0;i<watch1.size();i++)
{
	String text = watch1.get(i).getText();
	System.out.println(text);
}
List<WebElement>watch2=driver.findElements(By.xpath("(//div[@class='bhgxx2 col-12-12'])[3]"));
for(int j=0;j<watch2.size();j++)
{
	String text2=watch2.get(j).getText();
	System.out.println(text2);
}
List<WebElement>watch3=driver.findElements(By.xpath("//div[@class='bhgxx2 col-12-12'][3]"));
for(int k=0;k<watch2.size();k++)
{
	String text3=watch3.get(k).getText();
	System.out.println(text3);
}
//Thread.sleep(3000);
//WebElement findElement = driver.findElement(By.xpath("//div[@data-id='WATF33EEVSYZAHWQ']"));
//findElement.click();
//Set<String>windowhandles=driver.getWindowHandles();
//System.out.println(windowhandles);
//List<String>li=new ArrayList();
//li.addAll(windowhandles);
//driver.switchTo().window(li.get(1));

	}
}
