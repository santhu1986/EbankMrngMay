package stepdefination;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminlgnSD 
{
    WebDriver driver;
     FileInputStream FIS;
     Properties PR;

@Given("^Tester Should on Ranford Home Page$")
public void tester_Should_on_Ranford_Home_Page() throws Throwable 
{
	FIS=new FileInputStream("D:\\EvngBatch\\Ebanking\\src\\com\\ebanking\\master\\Rep.properties");
    PR=new Properties();
    PR.load(FIS);
	
	driver=new FirefoxDriver();
     driver.manage().window().maximize();
     driver.get(PR.getProperty("URL"));
     
}

@When("^Tester should enters UserName Password and login$")
public void tester_should_enters_UserName_Password_and_login() throws Throwable 
{

	driver.findElement(By.id("txtuId")).sendKeys(PR.getProperty("Uname"));
	driver.findElement(By.id("txtPword")).sendKeys(PR.getProperty("Pswd"));
	driver.findElement(By.xpath("//*[@id=\'login\']")).click();
	
}

@Then("^Tester validates Admin Login Functionality$")
public void tester_validates_Admin_Login_Functionality() throws Throwable 
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
