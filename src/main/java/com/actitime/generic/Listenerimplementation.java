package com.actitime.generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenerimplementation extends BaseClass implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
    {
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		String name = result.getName();
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		
		
	}

	@Override
	public void login() throws IOException 
	{
		// TODO Auto-generated method stub
		super.login();
	}
}

