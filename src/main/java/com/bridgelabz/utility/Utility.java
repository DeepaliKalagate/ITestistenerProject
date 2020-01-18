package com.bridgelabz.utility;

import com.bridgelabz.base.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility extends BaseClass
{

	public static final int pageload=20;
	public static final int wait =10;

	/**
	 * for take the screenshot
	 */

	public static void captureScreenShot() throws IOException
	{
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String date =  new SimpleDateFormat("yyyy/MM/dd-hh:mm:ss'.png'").format(new Date());
		File destinationFile = new File("screenshots.png"+date);
		FileUtils.copyFile(sourceFile, destinationFile);
	}

	@AfterMethod(description = "close driver after test")
	public void tearDown()
	{
		driver.close();
	}
}
