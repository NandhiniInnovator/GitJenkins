package org.testNG;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipkart extends BaseClass {
	FlipkartPom pom;
	@BeforeClass
	private void initialSetup() {
		browserLaunch("chrome");
	}
	@BeforeMethod
	private void urlLoad() {
		loadUrl("https://www.flipkart.com/");
		pom = new FlipkartPom();
		}
	@Test
	private void loginPage() {
     sendvalue(pom.getProduct(),"hp laptop");
     clickvalue(pom.getSearch());
     }
	@Test
	private void selectProduct() {
		switchWindow();
		clickvalue(pom.getClick());
		clickvalue(pom.getButtonClick());
		}
	

}
