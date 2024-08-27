package com.test2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {

	
		public static void main(String[] args) {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\shshanka\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");  
	          
	             WebDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	     
	    // driver.navigate().to("https://rahulshettyacademy.com/upload-download-test/index.html");  
	     //driver.findElement(By.cssSelector("#downloadButton")).click();
	     
	     //below is webelement so will take variable as upload
	    // WebElement upload = driver.findElement(By.cssSelector("input[type='file']"));
	    // upload.sendKeys("C:\\Users\\shshanka\\downloadFle\\download.xlsx");
	     driver.navigate().to("https://demo.guru99.com/test/upload/");
	    WebElement uploadfile = driver.findElement(By.cssSelector("input[type='file']"));
	    uploadfile.sendKeys("C:\\Users\\shshanka\\Desktop\\Bench\\Book1.xlsx");
	     
		}

	}

