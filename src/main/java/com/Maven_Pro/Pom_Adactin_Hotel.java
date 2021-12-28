package com.Maven_Pro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Adactin_Hotel {
	public WebDriver driver;
@FindBy(name="radiobutton_0")
private WebElement ratio_btn;
@FindBy(name="continue")
private WebElement continue_btn;

public Pom_Adactin_Hotel(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
}
public WebElement getRatio_btn() {
	return ratio_btn;
}
public WebElement getContinue_btn() {
	return continue_btn;
}
}
