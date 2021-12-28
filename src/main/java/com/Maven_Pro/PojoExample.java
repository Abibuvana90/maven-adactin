package com.Maven_Pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoExample {
	public static WebDriver driver;
public PojoExample(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
	}
@FindBy(xpath="//a[@class='login']")
private WebElement login;
@FindBy(id="email")
private WebElement username;
@FindBy(id="passwd")
private WebElement pswd;
@FindBy(id="SubmitLogin")
private WebElement signin;
@FindBy(xpath="(//a[@title='T-shirts'])[2]")
private WebElement t_shirt;
@FindBy(xpath="//img[@alt='Faded Short Sleeve T-shirts']")
private WebElement t_shirt_img;
@FindBy(xpath="//iframe[@class='fancybox-iframe']")
private WebElement frame1;
@FindBy(xpath="//input[@id='quantity_wanted']")
private WebElement quantity; 
@FindBy(xpath="//select[@name='group_1']")
private WebElement drop;
@FindBy(xpath="//a[@name='Blue']")
private WebElement color;
@FindBy(xpath="//button[@name='Submit']")
private WebElement cart;
@FindBy(xpath="//a[@title='Proceed to checkout']")
private WebElement proced1;
@FindBy(xpath="//span[text()='Proceed to checkout']")
private WebElement proced2;
@FindBy(xpath="//button[@name='processAddress']")
private WebElement proced3;
@FindBy(xpath="//input[@id='cgv']")
private WebElement checkbox;
@FindBy(xpath="//button[@name='processCarrier']")
private WebElement proced4;
@FindBy(xpath="//a[@title='Pay by check.']")
private WebElement cheqe;
@FindBy(xpath="//span[text()='I confirm my order']")
private WebElement confirm;
@FindBy(xpath="//h1[@class='page-heading']")
private WebElement findElement;
public static WebDriver getDriver() {
	return driver;
}
public WebElement getLogin() {
	return login;
}
public WebElement getUsername() {
	return username;
}
public WebElement getPswd() {
	return pswd;
}
public WebElement getSignin() {
	return signin;
}
public WebElement getT_shirt() {
	return t_shirt;
}
public WebElement getT_shirt_img() {
	return t_shirt_img;
}
public WebElement getFrame1() {
	return frame1;
}
public WebElement getQuantity() {
	return quantity;
}
public WebElement getDrop() {
	return drop;
}
public WebElement getColor() {
	return color;
}
public WebElement getCart() {
	return cart;
}
public WebElement getProced1() {
	return proced1;
}
public WebElement getProced2() {
	return proced2;
}
public WebElement getProced3() {
	return proced3;
}
public WebElement getCheckbox() {
	return checkbox;
}
public WebElement getProced4() {
	return proced4;
}
public WebElement getCheqe() {
	return cheqe;
}
public WebElement getConfirm() {
	return confirm;
}
public WebElement getFindElement() {
	return findElement;
}
}
