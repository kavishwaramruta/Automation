package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	  WebDriver dr;

	@Given("^Application is running and up$")
	public void application_is_running_and_up()  {
		
System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		
	    dr=new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get("http://www.newtours.demoaut.com/");
		
		
	    
	}

	@When("^I enter valid credentials$")
	public void i_enter_valid_credentials()  {
		dr.findElement(By.name("userName")).sendKeys("mercury");
		dr.findElement(By.name("password")).sendKeys("mercury");
		dr.findElement(By.name("login")).click();
	    
	    
	    
	}

	@Then("^Flight finder page is displayed$")
	public void flight_finder_page_is_displayed()  {
		
		System.out.println(dr.getTitle());
	    
	    
	   
	}


}
