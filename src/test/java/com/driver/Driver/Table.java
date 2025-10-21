package com.driver.Driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Surendran\\eclipse-workspace\\Driver\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println(rows.size());
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		System.out.println(rows.size());
		
        for(int i=2;i<rows.size();i++) {
        	List<WebElement> cells = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[" +i+ "]/td"));
        	for(WebElement cell:cells) {
        		System.out.println(cell.getText()+" | ");
        	}
        }
	}

}
