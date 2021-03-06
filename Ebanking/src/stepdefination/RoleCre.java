package stepdefination;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RoleCre 
{

	  WebDriver driver;
	  FileInputStream FIS;
	  Properties PR;

	
@Given("^User should on RanfordHP$")
public void user_should_on_RanfordHP() throws Throwable 
{
	FIS=new FileInputStream("D:\\EvngBatch\\Ebanking\\src\\com\\ebanking\\master\\Rep.properties");
    PR=new Properties();
    PR.load(FIS);
	
	driver=new FirefoxDriver();
     driver.manage().window().maximize();
     driver.get(PR.getProperty("URL"));

}

@When("^User enter username password and click on login$")
public void user_enter_username_password_and_click_on_login() throws Throwable 
{
	driver.findElement(By.id("txtuId")).sendKeys(PR.getProperty("Uname"));
	driver.findElement(By.id("txtPword")).sendKeys(PR.getProperty("Pswd"));
	driver.findElement(By.xpath("//*[@id=\'login\']")).click();
	
}

@Then("^User click on Role button$")
public void user_click_on_Role_button() throws Throwable 
{
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();

}

@When("^User click on New Role and enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_click_on_New_Role_and_enters_and(String RN, String RT) throws Throwable 
{   
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[@id='btnRoles']")).click();
	driver.findElement(By.id("txtRname")).sendKeys(RN);
	driver.findElement(By.id("lstRtypeN")).click();
	driver.findElement(By.id("lstRtypeN")).sendKeys(RT);
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[@id='btninsert']")).click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
}

@Then("^User Close the Applocation$")
public void user_Close_the_Applocation() throws Throwable 
{
    driver.close();
}


}
