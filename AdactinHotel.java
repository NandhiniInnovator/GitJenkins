package org.testNG;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AdactinHotel extends BaseClass {
	AdactinPom pom;
	String locator = "C:\\Users\\LENOVO\\eclipse-workspace\\TestNgSample\\src\\test\\resources\\Nandhini.xlsx";
	String name;
	@BeforeClass
	public void intialSetup() {
	browserLaunch("chrome");
	loadUrl("http://adactinhotelapp.com/");
	pom= new AdactinPom();
	}
	@AfterMethod
	public void screen() throws IOException {
		File file = new File("C:\\Users\\LENOVO\\eclipse-workspace\\TestNgSample\\target\\"+name+".png");
		takeScreenshot(file);
	}
	@Test
	public void loginPage() throws IOException {
		sendvalue(pom.getUserName(),excelValue(locator,4,0));
		sendvalue(pom.getPassword(), excelValue(locator,4,1));
		clickvalue(pom.getLogin());
		}
	@Test
	public void searchHotel() {
		selectByIndex(pom.getLocation(),3);
		selectByIndex(pom.getHotel(),2);
		selectByIndex(pom.getRoomType(),2);
		selectByIndex(pom.getRoomNum(),3);
		sendvalue(pom.getCheckin(),"28/07/2023");
		sendvalue(pom.getCheckout(),"28/07/2023");
		selectByIndex(pom.getAdultsRoom(),2);
		clickvalue(pom.getSearch());
	}
	@Test
	public void bookingHotel() throws InterruptedException {
		Thread.sleep(3000);
		clickvalue(pom.getRadio());
		clickvalue(pom.getContinues());
	}
	@Test
	public void orderPrint() throws IOException {
		
		sendvalue(pom.getFirstName(),excelValue(locator,1,0));
		sendvalue(pom.getLastName(),excelValue(locator,2,0));
		sendvalue(pom.getAddress(), excelValue(locator,1,2));
		sendvalue(pom.getCardNo(), excelValue(locator, 5,1));
		selectByIndex(pom.getCardType(), 2);
		selectByIndex(pom.getExpMonth(),5);
		selectByIndex(pom.getExpYear(),12);
		sendvalue(pom.getCvv(), excelValue(locator,6,1));
		clickvalue(pom.getBookNow());
		}
}
