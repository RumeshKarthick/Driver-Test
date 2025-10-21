package com.driver.Driver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Surendran\\eclipse-workspace\\Driver\\Driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("REDMI");
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement redmi1 = driver.findElement(By.xpath("(//div[contains(text(),'REDMI')])[2]"));
		redmi1.click();
		
		WebElement redmi2 = driver.findElement(By.xpath("(//div[contains(text(),'REDMI')])[3]"));
		redmi1.click();
		
		WebElement redmi3 = driver.findElement(By.xpath("(//div[contains(text(),'REDMI')])[4]"));
		redmi1.click();
		
		Set<String> cwin = driver.getWindowHandles();
		List<String> cwins = new LinkedList<String>();
		
		cwins.addAll(cwin);
		driver.switchTo().window(cwins.get(3));
		

	}

}
