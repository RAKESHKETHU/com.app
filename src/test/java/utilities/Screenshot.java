package utilities;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

    public static String captureScreenshot(WebDriver driver, String testName) {

        String path = "screenshots/" + testName + ".png";

        try {

            TakesScreenshot ts = (TakesScreenshot) driver;

            File source = ts.getScreenshotAs(OutputType.FILE);

            File destination = new File(path);

            FileUtils.copyFile(source, destination);

        } catch (IOException e) {

            e.printStackTrace();

        }

        return path;

    }

}