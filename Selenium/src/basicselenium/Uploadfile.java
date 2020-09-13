package basicselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		
		ChromeDriver dr=new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get("file:///C:/Users/admin/Downloads/Practice.html");
		
		dr.findElement(By.id("Anand_file")).click();
		
		StringSelection cb = new StringSelection("G:\\26.05.2019\\Automation\\CucumberProject\\src\\StepDefinition\\Steps.java");
        
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(cb, null);
		
		Robot robot=new Robot();
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}
