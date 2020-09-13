package advancedselenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import locators.Library;

public class MouseHover {
	
	public static void main(String[] args) throws InterruptedException {

		Library lib= new Library();
		
		
		
		WebDriver dr=lib.LaunchBrowser("https://www.flipkart.com");
		
		//Implicit wait
		
		//dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		Actions act=new Actions(dr);
		
		act.moveToElement(dr.findElement(By.xpath("//span[text()='Men']"))).build().perform();
		
		//Explicit wait
		
		WebDriverWait wait=new WebDriverWait(dr,50);
		
		wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//a[text()='Shirts']"))));
		
		dr.findElement(By.xpath("//a[text()='Shirts']")).click();
		
		Thread.sleep(3000);
		
		//Drag and Drop
		
		act.dragAndDropBy(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]")),50,0).build().perform();
		
		Thread.sleep(3000);
		
		//drag and drop
		
		act.dragAndDropBy(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[2]")),-50,0).build().perform();
		String parent=dr.getWindowHandle();
		System.out.println(parent);
		Thread.sleep(3000);
		dr.findElement(By.xpath("//img[@class='_3togXc']")).click();
		Set<String> wins=dr.getWindowHandles();
		for(String w:wins)
		{
			if(!w.equals(parent))
			dr.switchTo().window(w);
		}
		
		Thread.sleep(3000);
		
		dr.findElement(By.xpath("//a[text()='S']")).click();
		
		Thread.sleep(3000);
		
		dr.findElement(By.xpath("//input[@placeholder='Enter delivery pincode']")).sendKeys("411015");
		
		//scroll
		
		JavascriptExecutor js= (JavascriptExecutor) dr;
		
		WebElement ele=dr.findElement(By.xpath("//button[text()='ADD TO CART']"));
		
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
		dr.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
	}
}
