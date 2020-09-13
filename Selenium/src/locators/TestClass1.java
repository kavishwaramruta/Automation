package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass1 {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		
		ChromeDriver dr=new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get("http://www.newtours.demoaut.com/");
		
		//css selector
		
		dr.findElement(By.cssSelector("input[name='userName']")).sendKeys("hghghghghg");
		dr.findElement(By.cssSelector("input[name='password']")).sendKeys("hghghg");
		dr.findElement(By.name("login")).click();
		
		//Link text and partial link
		
		//dr.findElement(By.linkText("REGISTER")).click();
		
		//partial link text
		
		//dr.findElement(By.partialLinkText("REGI")).click();
		
		//xpath
		
		String w=dr.findElement(By.xpath("//img[@src='/images/nav/logo.gif']")).getAttribute("width");
		String h=dr.findElement(By.xpath("//img[@src='/images/nav/logo.gif']")).getAttribute("height");
		System.out.println(w);
		System.out.println(h);
	}

}
