package com.Maven_Pro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Adactin_Reg {
public Pom_Adactin_Reg(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver,this);
}
public WebDriver driver;
public WebDriver getDriver() {
	return driver;
}

@FindBy(name="location")
private WebElement location_drop;
@FindBy(name="hotels")
private WebElement hotels_drop;
@FindBy(name="room_type")
private WebElement room_type_drop;
@FindBy(id="room_nos")
private WebElement num_rooms;
@FindBy(name="datepick_in")
private WebElement check_in;
@FindBy(name="datepick_out")
private WebElement check_out;
@FindBy(name="adult_room")
private WebElement adult_inRoom;
@FindBy(name="child_room")
private WebElement child_inRoom;
@FindBy(name="Submit")
private WebElement submit_btn;

public WebElement getLocation_drop() {
	return location_drop;
}
public WebElement getHotels_drop() {
	return hotels_drop;
}
public WebElement getRoom_type_drop() {
	return room_type_drop;
}
public WebElement getNum_rooms() {
	return num_rooms;
}
public WebElement getCheck_in() {
	return check_in;
}
public WebElement getCheck_out() {
	return check_out;
}
public WebElement getAdult_inRoom() {
	return adult_inRoom;
}
public WebElement getChild_inRoom() {
	return child_inRoom;
}
public WebElement getSubmit_btn() {
	return submit_btn;
}
}
