package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class backtoflights {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		
		ChromeDriver dr=new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get("http://www.newtours.demoaut.com/");
		
		dr.findElement(By.name("userName")).sendKeys("mercury");
		dr.findElement(By.name("password")).sendKeys("mercury");
		dr.findElement(By.name("login")).click();
		dr.findElement(By.xpath("//input[@value='oneway']")).click();
		
		Select sel=new Select(dr.findElement(By.xpath("//select[@name='passCount']"))); 
		sel.selectByIndex(2);
		
		Thread.sleep(2000);
		
		sel.selectByValue("1");
		Thread.sleep(2000);
		sel.selectByVisibleText("4");
		
		dr.findElement(By.name("findFlights")).click();
		dr.findElement(By.name("outFlight")).click();
		dr.findElement(By.name("inFlight")).click();
		
		dr.findElement(By.name("reserveFlights")).click();
		dr.findElement(By.name("buyFlights")).click();
		
		String str=dr.findElement(By.xpath("//font[contains(text(),'Your itinerary has been booked!'")).getText();
		dr.findElement(By.xpath("/images/forms/backtoflights.gif")).click();

	}

}
