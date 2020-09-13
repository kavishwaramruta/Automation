package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightFinder {
	
WebDriver dr;
	
	public FlightFinder(WebDriver dr)
	{
		this.dr=dr;
	}
	By Oneway = By.xpath("//input[@value='oneway']");
	By continuebtn = By.name("findFlights");
	
	public void clickOneWay()
	{
		dr.findElement(Oneway).click();
	}
	
	public void clickContinuebtn()
	{
		dr.findElement(continuebtn).click();
	}


}
