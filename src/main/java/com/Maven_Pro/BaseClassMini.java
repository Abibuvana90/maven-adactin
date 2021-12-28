package com.Maven_Pro;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class BaseClassMini {
	public static WebDriver driver;
	
	public static WebDriver browserLaunch(String browser) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajabi\\eclipse-workspace\\Maven_Pro\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else {
			System.out.println("you are giving different browser name");
		}
		//here return is needed for chromedriver otherwise it will return empty driver
		// here need to change void as webdriver while giving return type
		// because void does not return any value
		return driver; 
		}
	
	public static void get(String url) {
		driver.get(url);
		}

public static void wait_1(long milli_sec) {
driver.manage().timeouts().implicitlyWait( milli_sec,TimeUnit.MILLISECONDS);
}
public static void click(WebElement ele) {
ele.click();	
}
public static void sendkeys(WebElement ele,String value) {
ele.sendKeys(value);

}
public static void frames(String str,String s1 ) {
	if(str.equalsIgnoreCase("id")) {
		driver.switchTo().frame(s1);
	}
	if(str.equalsIgnoreCase("index")) {
		driver.switchTo().frame(Integer.parseInt(s1));
	}
}
public static void frame_def() {
	driver.switchTo().defaultContent();
	}
public static void frame(WebElement ele) {
		driver.switchTo().frame(ele);
	}

public static void clear(WebElement ele) {
ele.clear();	
}
public static void sleep(long t1) throws InterruptedException {
	Thread.sleep(t1);
}
public static void maximize() {
	driver.manage().window().maximize();
}
public static void scrollintoview(WebElement ele) {
	JavascriptExecutor jr=(JavascriptExecutor)driver;
	jr.executeScript("arguments[0].scrollIntoView();",ele);
}
public static void takesScreenshot(String path) throws IOException {
	TakesScreenshot ts=(TakesScreenshot)driver;
    File source = ts.getScreenshotAs(OutputType.FILE);
    File destination=new File(path);
    FileUtils.copyFile(source, destination);
}
public static void dropDown(WebElement ele,String str,String s1) {
	 Select s=new Select(ele);
	 if(str.equalsIgnoreCase("by index")) {
	// int i=0;
    s.selectByIndex(Integer.parseInt(s1));
	 }
	 else if (str.equalsIgnoreCase("by value")) {
	 //String a = null;
	 s.selectByValue(s1);
	 }
	 else if (str.equalsIgnoreCase("by visible text")) {
    //String a = null;	
     s.selectByVisibleText(s1);
	 }
	 else if(str.equalsIgnoreCase("deselect by index")) {
    //int i=0;
	 s.deselectByIndex(Integer.parseInt(s1));
	 }
	 else if (str.equalsIgnoreCase("deselect by value")) {
	 //String a = null;
	 s.deselectByValue(s1);
	 }
	 else if (str.equalsIgnoreCase("deselect by visible text")) {
	 String a = null;
	 s.deselectByVisibleText(s1);
	 }
	 else if (str.equalsIgnoreCase("get first selected options")) {
	 s.getFirstSelectedOption();
	 }
	 else if (str.equalsIgnoreCase("is multiple")) {
	 boolean multiple = s.isMultiple(); 
	 System.out.println(multiple);
	 }
	 else if(str.equalsIgnoreCase("get options")) {
	 List<WebElement> options = s.getOptions();
	 for (WebElement alloptions : options) {
	 String text = alloptions.getText();
	 System.out.println(text);
	 }
	 }
	 else if(str.equalsIgnoreCase("get all selected options")) {
	 List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	 for (WebElement allselected : allSelectedOptions) {
		 String text = allselected.getText();
		 System.out.println(text);
	 }
	 }
	 }

}
