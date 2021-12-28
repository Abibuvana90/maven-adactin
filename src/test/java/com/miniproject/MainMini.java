package com.miniproject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.Maven_Pro.BaseClassMini;
import com.Maven_Pro.PojoExample;

public class MainMini extends BaseClassMini {
	
			public static void main(String[] args) throws InterruptedException, IOException {
				browserLaunch("chrome");
				maximize();
				wait_1(2000);
				get("http://automationpractice.com/index.php?");
				PojoExample pe=new PojoExample(driver);
				click(pe.getLogin());
				sendkeys(pe.getUsername(),"abibuvana90@gmail.com");
				sendkeys(pe.getPswd(),"Abcd@1234");
				click(pe.getSignin());
			    click(pe.getT_shirt());
			    click(pe.getT_shirt_img());
			    frame(pe.getFrame1());
			    clear(pe.getQuantity());
			    sendkeys(pe.getQuantity(),"3");
			   // WebElement drop = driver.findElement(By.xpath("//select[@name='group_1']"));
			    dropDown(pe.getDrop(),"by index","0");
			    click(pe.getColor());
			    click(pe.getCart());
			    frame_def();
			    //Purchase process
			    sleep(4000);
			    click(pe.getProced1());
			    click(pe.getProced2());
			    click(pe.getProced3());
			    click(pe.getCheckbox());
			    click(pe.getProced4());
			    click(pe.getCheqe());
			    click(pe.getConfirm());
			    scrollintoview(pe.getFindElement());
			    takesScreenshot("C:\\Users\\Rajabi\\eclipse-workspace\\Maven_Pro\\screenshot\\l1.png");
		
			}
	}

