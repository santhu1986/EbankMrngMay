package com.ebanking.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Samplecl {

	public static void main(String[] args) 
	{
      WebDriver driver=new ChromeDriver();
		
		//Maximise
		
		driver.manage().window().maximize();
		
		//URL
		
		driver.get("http://www.google.com");
		
	}

}
