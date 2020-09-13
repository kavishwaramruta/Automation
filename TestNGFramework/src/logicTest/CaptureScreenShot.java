package logicTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenShot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");

		ChromeDriver dr=new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get("http://www.newtours.demoaut.com/");
		
		dr.findElement(By.name("userName")).sendKeys("mercury");
		dr.findElement(By.name("password")).sendKeys("mercury");
		dr.findElement(By.name("login")).click();
		dr.findElement(By.xpath("//input[@value='oneway']")).click();
		
		TakesScreenshot scrShot=((TakesScreenshot)dr);
		File SrcFile= scrShot.getScreenshotAs(OutputType.FILE);
		
		String str= new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		
		//String path= System.getProperty("user.dir")+ "\\login.jpg";
		String path= System.getProperty("user.dir")+ "\\"+str+".jpg";

		
		File DestFile = new File(path);
		FileHandler.copy(SrcFile, DestFile);
	}

}
