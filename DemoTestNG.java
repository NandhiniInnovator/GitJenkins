package org.testNG;


import java.io.IOException;

import org.testng.annotations.Test;

public class DemoTestNG extends BaseClass {
	String locator = "C:\\Users\\LENOVO\\eclipse-workspace\\TestNgSample\\src\\test\\resources\\Nandhini.xlsx";
@Test
	private void tc1() throws IOException {
	AdactinPom1 pom = new AdactinPom1();
	sendvalue(pom.getUserName(),excelValue(locator,4,0));
	sendvalue(pom.getPassWord(), excelValue(locator,4,1));
	clickvalue(pom.getLogin());
	}

}
