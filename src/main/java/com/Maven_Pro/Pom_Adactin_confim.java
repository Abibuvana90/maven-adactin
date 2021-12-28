package com.Maven_Pro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Adactin_confim {
public WebDriver driver;
public Pom_Adactin_confim(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
}
@FindBy(name="search_hotel")
private WebElement search_hotel;
@FindBy(name="my_itinerary")
private WebElement itinery;

public WebDriver getDriver() {
	return driver;
}

public WebElement getItinery() {
	return itinery;
}
public WebElement getSearch_hotel() {
	return search_hotel;
}
}
