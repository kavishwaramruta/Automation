package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Library {

	public WebDriver LaunchBrowser()
	{
System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		
		ChromeDriver dr=new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get("http://www.newtours.demoaut.com/");
		
		return dr;
		
	}
	public WebDriver LaunchBrowser(String url)
	{
System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");

ChromeOptions op=new ChromeOptions();
op.addArguments("--disable-infobars");
op.addArguments("--start-maximized");

		
		ChromeDriver dr=new ChromeDriver(op);
		
		
		
		dr.get(url);
		
		return dr;
		
	}
}
