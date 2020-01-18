package com.bridgelabz.base;
import com.bridgelabz.utility.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass
{
	public static WebDriver driver;
	public static Properties property;
	public static WebDriverWait webDriverWait;
	public static FileInputStream fileInputStream;
	public BaseClass()
	{
		property = new Properties();
		try
		{
			fileInputStream = new FileInputStream("Confirg/config.properties");
			property.load(fileInputStream);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void initiation()
	{
		if(property.getProperty("browser").equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();	
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Utility.pageload,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Utility.wait,TimeUnit.SECONDS);
		driver.get(property.getProperty("URL"));
		webDriverWait = new WebDriverWait(driver,Utility.wait);
	}
}