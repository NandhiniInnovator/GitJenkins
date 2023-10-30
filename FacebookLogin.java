package org.testNG;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FacebookLogin extends BaseClass {
	FacebookPom pom;
	SoftAssert softassert;
	String locator = "C:\\Users\\LENOVO\\eclipse-workspace\\TestNgSample\\src\\test\\resources\\Nandhini.xlsx";
	String name;

	@BeforeClass
	public void setup() {
		browserLaunch("chrome");
		
	}
	@BeforeMethod
	private void TC1() {
		browserLaunch("chrome");
		loadUrl("https://www.facebook.com/");
		pom= new FacebookPom();
		softassert = new SoftAssert();
	}

	@AfterMethod
	public void screen() throws IOException {
		File file = new File("C:\\Users\\LENOVO\\eclipse-workspace\\TestNgSample\\target\\" + name + ".png");
		takeScreenshot(file);
	}
	@AfterClass
	public void close() {
		quitWindow();
	}

	@Test(priority=1,invocationCount=2)
	public void login() throws IOException {
		name = "login";
		sendvalue(pom.getUserName(),"Nandhini");
		sendvalue(pom.getPassword(),"9500424022");
		clickvalue(pom.getLogin());
	}

	@Test(priority=3,dependsOnMethods= {"login","createAccount"})
	public void forgetPassword() throws IOException, InterruptedException {
		name = "forgetpassword";
		
		clickvalue(pom.getForgetPassword());
		Thread.sleep(3000);
		sendvalue(pom.getMailPhone(), excelValue(locator, 4, 0));
		clickvalue(pom.getSearch());
	}

	@Test(priority=2)
	public void createAccount() throws IOException {
		name = "creataccount";
		clickvalue(pom.getCreateAccount());
		sendvalue(pom.getFirstName(), excelValue(locator, 2, 0));
		sendvalue(pom.getLastName(), excelValue(locator, 3, 0));
		sendvalue(pom.getMobileNum(), excelValue(locator, 1, 0));
		sendvalue(pom.getPassWord(), excelValue(locator, 1, 0));
		selectByIndex(pom.getDay(), 5);
		selectByIndex(pom.getMonth(), 11);
		selectByIndex(pom.getYear(), 7);
		clickvalue(pom.getFemale());
		clickvalue(pom.getSignUp());

	}

}
