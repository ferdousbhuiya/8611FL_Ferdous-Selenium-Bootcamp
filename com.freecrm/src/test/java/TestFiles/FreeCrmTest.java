package TestFiles;

import base.BasePage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import java.io.File;
import java.io.IOException;

public class FreeCrmTest extends BasePage {

    static WebDriver driver;
    Logger log = Logger.getLogger(FreeCrmTest.class);
    static JavascriptExecutor js;


    @Test
    public void freeCrmTitleTest() throws InterruptedException, IOException {
        log.info("**************************  Starting test case  ****************************");
        log.info("**************************  Free CRM Test  ****************************");
        String title = driver.getTitle();
        System.out.println("title is: " + title);
        getRunTimeInfoMessage("info", title);
        log.info("Login page title is ---->"+title);
        if (title.equals("CRMPRO - CRM software for customer relationship management, sales, and support.")) {
            getRunTimeInfoMessage("info", "title is correct!! YAY!!!");
            Assert.assertTrue(true);
        } else {
            getRunTimeInfoMessage("error", "title is not correct!! BUG BUG BUG!!!");
            takeScreenshot("freecrmloginpage");
            Assert.assertTrue(false);
        }
        log.info("**************************  Ending test case  ****************************");
        log.info("**************************  Free CRM Test  ****************************");
    }

    public static void getRunTimeInfoMessage(String messageType, String message) throws InterruptedException {
        // Check for jQuery on the page, add it if need be
        js.executeScript("if (!window.jQuery) {"
                + "var jquery = document.createElement('script'); jquery.type = 'text/javascript';"
                + "jquery.src = 'https://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js';"
                + "document.getElementsByTagName('head')[0].appendChild(jquery);" + "}");
        Thread.sleep(5000);

        // Use jQuery to add jquery-growl to the page
        js.executeScript("$.getScript('https://the-internet.herokuapp.com/js/vendor/jquery.growl.js')");

        // js.executeScript("$.getScript('/Users/NaveenKhunteta/Documents/workspace/Test/src/testcases/jquery.growl.js')");

        // Use jQuery to add jquery-growl styles to the page
        js.executeScript("$('head').append('<link rel=\"stylesheet\" "
                + "href=\"https://the-internet.herokuapp.com/css/jquery.growl.css\" " + "type=\"text/css\" />');");
        Thread.sleep(5000);

        // jquery-growl w/ no frills
        js.executeScript("$.growl({ title: 'GET', message: '/' });");

        if(messageType.equals("error")){
            js.executeScript("$.growl.error({ title: 'ERROR', message: '"+message+"' });");
        }else if(messageType.equals("info")){
            js.executeScript("$.growl.notice({ title: 'Notice', message: '"+message+"' });");
        }else if(messageType.equals("warning")){
            js.executeScript("$.growl.warning({ title: 'Warning!', message: '"+message+"' });");
        }

        // jquery-growl w/ colorized output
//		js.executeScript("$.growl.error({ title: 'ERROR', message: 'Some exception is coming' });");
//		js.executeScript("$.growl.notice({ title: 'Notice', message: 'your notice message goes here' });");
//		js.executeScript("$.growl.warning({ title: 'Warning!', message: 'your warning message goes here' });");
    }

    public static void takeScreenshot(String fileName) throws IOException, IOException {
        // Take screenshot and store as a file format
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // now copy the screenshot to desired location using copyFile //method
        FileUtils.copyFile(src,
                new File("/Users/ferdous/Desktop/From Naveen/screenshots/" + fileName +".png"));

    }


}
