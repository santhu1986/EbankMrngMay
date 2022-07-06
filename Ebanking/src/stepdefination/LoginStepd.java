package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepd 
{

	  WebDriver driver;

@Given("^User Should on RanfordHP$")
public void user_Should_on_RanfordHP() throws Throwable 
{
    driver=new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get("http://122.175.8.158/ranford2");
}

@When("^User enters Username Password and login$")
public void user_enters_Username_Password_and_login() throws Throwable 
{
	driver.findElement(By.id("txtuId")).sendKeys("Admin");
	driver.findElement(By.id("txtPword")).sendKeys("Mq$ystems@");
	driver.findElement(By.xpath("//*[@id=\'login\']")).click();
	
}

@Then("^User validates Admin$")
public void user_validates_Admin() throws Throwable 
{
   String Expval="Welcome to Admin";
	
   String Actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
	
	//Comparision
	
		if (Expval.equalsIgnoreCase(Actval)) 
		{
		 System.out.println("Admin Login Succ"); 	
		}
		else
		{
			System.out.println("Admin Login Failed");
		}

}


}
