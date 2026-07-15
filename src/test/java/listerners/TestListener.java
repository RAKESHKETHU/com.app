package listerners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utilities.ExtentManager;

import bases.BaseClass;

import utilities.Screenshot;

public class TestListener implements ITestListener {

	ExtentReports extent = ExtentManager.getReport();

	// Replace ExtentTest test;
	ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

	@Override
	public void onTestStart(ITestResult result) {

		ExtentTest test = extent.createTest(result.getMethod().getMethodName());

		extentTest.set(test);

		extentTest.get().info("Test Execution Started");

	}

	@Override
	public void onTestSuccess(ITestResult result) {

		extentTest.get().pass("Test Passed Successfully");

	}

	@Override
	public void onTestFailure(ITestResult result) {

		extentTest.get().fail("Test Failed");

		extentTest.get().fail(result.getThrowable());

		String path = Screenshot.captureScreenshot(BaseClass.driver, result.getMethod().getMethodName());

		try {

			extentTest.get().addScreenCaptureFromPath(path);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {

		extentTest.get().skip("Test Skipped");

	}

	@Override
	public void onFinish(ITestContext context) {

		extent.flush();

	}

}