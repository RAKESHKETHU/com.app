package utilities;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    static ExtentReports extent;

    public static ExtentReports getReport() {

        ExtentSparkReporter spark =
                new ExtentSparkReporter("reports/ExtentReport.html");

        spark.config().setReportName("Automation Report");
        spark.config().setDocumentTitle("Execution Report");

        extent = new ExtentReports();

        extent.attachReporter(spark);

        extent.setSystemInfo("Tester","Rakesh");
        extent.setSystemInfo("Browser","Chrome");

        return extent;
    }

}