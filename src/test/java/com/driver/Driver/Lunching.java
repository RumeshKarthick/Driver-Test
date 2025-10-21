package com.driver.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lunching {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Surendran\\eclipse-workspace\\Driver\\Driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		String url = "https://www.facebook.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		
		boolean validation = currenturl.equals(url);
		if(validation==true) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("rumesh");
		
		WebElement password = driver.findElement(By.linkText("Forgotten password?"));
		password.click();

	}

}
