package org.testNG;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazon extends BaseClass {
	AmazonPom pom;
	@BeforeClass
	private void initialSetup() {
		browserLaunch("edge");
		}
	@BeforeMethod
	private void urlLoad() {
		loadUrl("https://www.amazon.in/");
		pom = new AmazonPom();
		}
	@Test
	private void loginPage() {
		sendvalue(pom.getInput(),"iphone watch bands for women");
		clickvalue(pom.getSearch());
		}
	@Test(priority=1)
	private void chooseProduct() {
		switchWindow();
		clickvalue(pom.getProductClick());
		clickvalue(pom.getAddToCard());

	}
	

}
