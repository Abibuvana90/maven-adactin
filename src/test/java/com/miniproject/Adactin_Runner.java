package com.miniproject;

import com.Maven_Pro.Pom_Adactin_Home;
import com.Maven_Pro.Pom_Adactin_Hotel;
import com.Maven_Pro.Pom_Adactin_Personal;
import com.Maven_Pro.Pom_Adactin_Reg;
import com.Maven_Pro.Pom_Adactin_confim;
import BaseClass.Base_Class;
 
public class Adactin_Runner extends Base_Class {
public static void main(String[] args) throws Throwable {

	browserlaunch("chrome");
	urllaunch("https://www.adactinhotelapp.com/");
	max();
	Pom_Adactin_Home home=new Pom_Adactin_Home(driver);
	Pom_Adactin_Hotel hotel=new Pom_Adactin_Hotel(driver);
	Pom_Adactin_Reg reg=new Pom_Adactin_Reg(driver);
	Pom_Adactin_Personal personal=new Pom_Adactin_Personal(driver);
	Pom_Adactin_confim confm=new Pom_Adactin_confim(driver);
	inputvalues(home.getUsername(),"Abinaya90");
	inputvalues(home.getPassword(),"Rajabi@2016");
	clickelement(home.getLogin());
	dropdown(reg.getLocation_drop(),"visible text","Sydney");
	dropdown(reg.getHotels_drop(),"visible text","Hotel Creek");
	dropdown(reg.getRoom_type_drop(),"visible text","Standard");
	dropdown(reg.getNum_rooms(),"visible text","1 - One");
	dropdown(reg.getAdult_inRoom(),"visible text","2 - Two");
	dropdown(reg.getChild_inRoom(),"visible text","1 - One");
	clickelement(reg.getSubmit_btn());
	clickelement(hotel.getRatio_btn());
	clickelement(hotel.getContinue_btn());
	inputvalues(personal.getFirst_name(),"Abinaya");
	inputvalues(personal.getLast_name(),"Rajesh");
	inputvalues(personal.getAddress(),"unihomes,chennai");
	inputvalues(personal.getCredit_card(),"1234545612345098");
	dropdown(personal.getCredit_type(),"visible text","VISA");
	dropdown(personal.getCc_exp_month(),"visible text","January");
	dropdown(personal.getCc_exp_year(),"visible text","2014");
	inputvalues(personal.getCc_cvv(),"1234");
	clickelement(personal.getBook_now());
	Thread.sleep(5000);
	clickelement(confm.getItinery());
	sc("C:\\Users\\Rajabi\\eclipse-workspace\\Maven_Pro\\screenshot\\one.png");
}
}
