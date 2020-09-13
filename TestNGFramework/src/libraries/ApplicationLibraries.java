package libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import configuration.Configue;

public class ApplicationLibraries {
	
	public WebDriver LaunchBrowser()
	{
        System.setProperty("webdriver.chrome.driver",Configue.chromeDriver);
		
		ChromeDriver dr=new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get(Configue.appUrl);
		
		return dr;
		
	}
	public WebDriver LaunchBrowser(String url)
	{
System.setProperty("webdriver.chrome.driver",Configue.chromeDriver);

ChromeOptions op=new ChromeOptions();
op.addArguments("--disable-infobars");
op.addArguments("--start-maximized");

		
		ChromeDriver dr=new ChromeDriver(op);
		
		
		
		dr.get(url);
		
		return dr;
	}

}
