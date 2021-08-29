package com.krishna;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\default workspace\\selenium day1\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		
      WebElement table=  driver.findElement(By.tagName("table"));
     List<WebElement> headers=table.findElements(By.tagName("th"));
     for (WebElement header : headers) {
    	String text= header.getText();
    	System.out.println(text);
     }
    	List rowelements=table.findElements(By.tagName("tr"));
    	int size=rowelements.size();
    	System.out.println(size);
    	 
		
	}
  
  
  
	}
	
	
	
	
