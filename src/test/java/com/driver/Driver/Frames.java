package com.driver.Driver;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surendran\\eclipse-workspace\\Driver\\Driver\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		WebElement multiFrame = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		multiFrame.click();
		
		WebElement outer = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outer);
		
		WebElement inner = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(inner);
		
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.click();
		text.sendKeys("hi");
		
	}

}
