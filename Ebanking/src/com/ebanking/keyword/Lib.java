package com.ebanking.keyword;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lib 
{

	public static Properties Pr;
    public static FileInputStream Fis;
	public static WebDriver driver;
	public static String Expval,Actval;

	public String openApp(String Url) throws InterruptedException
	{
		String Expval="Ranford Bank";
		driver=new FirefoxDriver();
			driver.get(Url);
		Thread.sleep(3000);
		String Actval=driver.findElement(By.xpath(".//*[@id='Form1']/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();	
				System.out.println(Actval);
		if (Expval.equalsIgnoreCase(Actval)) 
		{
		System.out.println("Application is launched");
		return "pass";
		}
		else
		{
			System.out.println("Application not opened");
			return "fail";
		}
	}
	public String AdmLgn(String Un,String Pwd) throws InterruptedException
	{
		Expval="Welcome to Admin";
		driver.manage().window().maximize();
		driver.findElement(By.id("txtuId")).sendKeys(Un);
		driver.findElement(By.id("txtPword")).sendKeys(Pwd);
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		Actval=driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
		System.out.println(Actval);
		//driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
	if (Expval.equalsIgnoreCase(Actval)) 
	{
	System.out.println("adminhome is displayed");
	return "pass";
	}
	else
	{
		System.out.println("adminhome is not displayed");
	return "fail";
	}
		}

	public String Role(String RN,String RT) throws InterruptedException
	{
		Expval="Sucessfully";
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
		driver.findElement(By.xpath(".//*[@id='btnRoles']")).click();
		driver.findElement(By.id("txtRname")).sendKeys(RN);
		driver.findElement(By.id("lstRtypeN")).click();
		driver.findElement(By.id("lstRtypeN")).sendKeys(RT);
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='btninsert']")).click();
		Thread.sleep(3000);
		String Actval=driver.switchTo().alert().getText();
		
		System.out.println(Actval);
		
		
	      driver.switchTo().alert().accept();
	      driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();  
	      if (Actval.contains(Expval)) 
	      {
	    	  System.out.println("Role Created");
	    	  return "Pass";
			
		}
	      else{
	    	  System.out.println("role not created");
	    	  return "Fail";
	      }
	      
	     }

	      public void branch() throws InterruptedException
	      {
	    	  driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
	  		driver.findElement(By.xpath(".//*[@id='BtnNewBR']")).click();
	  		driver.findElement(By.id("txtbName")).sendKeys("hfmhkmh");
	  		Thread.sleep(3000);
	  		driver.findElement(By.id("txtAdd1")).sendKeys("lkhjhhj");
	        
	          driver.findElement(By.id("txtZip")).sendKeys("12345");
	   		
	  		driver.findElement(By.id("lst_counrtyU")).sendKeys("INDIA");
	  		
	  		Thread.sleep(3000);
	  		driver.findElement(By.id("lst_stateI")).sendKeys("Andhra Pradesh");
	  		WebElement d=driver.findElement(By.xpath(".//*[@id='lst_cityI']"));
	  		Thread.sleep(3000); 
	  		d.click();
	  		
	  		List<WebElement> city=driver.findElements(By.xpath(".//*[@id='lst_cityI']/option"));
	  		System.out.println(city.size());
	  		for (int i = 0; i < city.size(); i++) 
	  		{
	  			if (city.get(i).getText().equalsIgnoreCase("Hyderabad")) 
	  			{
	  				
	  				city.get(i).click();
	  				break;
	  				
	  			}
	  			}
	  		driver.findElement(By.xpath(".//*[@id='btn_insert']")).click();
	  		
	  		driver.switchTo().alert().accept();
	  		
	  		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
	  	
	      }
	     public void admlgt() throws InterruptedException
	     
	     {
	    	 Thread.sleep(3000);
	    	 driver.findElement(By.xpath(".//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
	    	 
	    	 }

	     public void Appc()
	     {
	    	 driver.close();
	     }

}
