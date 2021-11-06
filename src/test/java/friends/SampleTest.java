package friends;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest {
    ExtentHtmlReporter htmlReporter;
    ExtentReports extent;
    @BeforeTest
    public void startReport(){
// ExtentReports , ExtentSparkReporter

        String path =System.getProperty("user.dir")+"\\reports\\index.html";

        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/testReport.html");

        htmlReporter.config().setReportName("Web Automation Results");

        htmlReporter.config().setDocumentTitle("Test Results");

        extent =new ExtentReports();

        extent.attachReporter(htmlReporter);

        extent.setSystemInfo("Tester", "Rahul Shetty");
    }


    @Test
    public void firstTest(){
        System.out.println("First Test");
        ExtentTest test = extent.createTest("firstTest");
        extent.flush();
    }
    @Test
    public void secondTest(){
        System.out.println("Second Test");
        ExtentTest test = extent.createTest("firstTest");
    }
}
