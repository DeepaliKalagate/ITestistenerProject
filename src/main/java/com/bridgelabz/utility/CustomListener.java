
/******************************************************************************
 *
 *  Author  Deepali Kalagate
 *  Purpose: Created Custom Listener for Capturing Screenshots.
 *
 *  @since   18-01-2020
 *
 ******************************************************************************/

package com.bridgelabz.utility;

import com.bridgelabz.base.BaseClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.io.IOException;


public class CustomListener extends BaseClass implements ITestListener
{

	public void onTestStart(ITestResult result)
	{
		try
		{
			Utility.captureScreenShot();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void onTestSuccess(ITestResult result)
	{
		try
		{
			Utility.captureScreenShot();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void onTestFailure(ITestResult result)
	{
		try
		{
			Utility.captureScreenShot();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result)
	{
		try
		{
			Utility.captureScreenShot();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}

	public void onStart(ITestContext context)
	{
		
	}

	public void onFinish(ITestContext context)
	{
		try {
			Utility.captureScreenShot();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
