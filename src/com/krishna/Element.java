package com.krishna;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\default workspace\\selenium day1\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		WebElement fulltable=driver.findElement(By.tagName("table"));
		  List<WebElement>  header=fulltable.findElements(By.tagName("th"));
		 int size=header.size();
		 System.out.println(size);
		 List<WebElement> rows=  fulltable.findElements(By.tagName("tr"));
		 System.out.println(rows.size());
		 for (int i = 0; i < rows.size(); i++) {
			        WebElement eachrow  = rows.get(i);
			        System.out.println(eachrow.getText());
			        for (int j = 0; j<header.size(); j++) {
			        	WebElement eachheading=  header.get(j);
			        	System.out.println(eachheading.getText());
			        	 List<WebElement> dataelements=	eachrow.findElements(By.tagName("td"));
			        	 
			        	 
			        	 for (WebElement eachdata : dataelements) {
							String s=eachdata.getText();
							System.out.println(s);
			        		 
						}
					}
			
		}
		
	}
}