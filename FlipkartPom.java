package org.testNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPom extends BaseClass {
	public FlipkartPom() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='text']")
	private WebElement product;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement search;
	@FindBy(xpath="//div[text()='Lenovo IdeaPad 3 Core i3 11th Gen - (8 GB/256 GB SSD/Windows 11 Home) 15ITL6 Laptop']")
	private WebElement click;
	@FindBy(xpath="//button[text()='Add to cart']")	
	private WebElement buttonClick;
	public WebElement getProduct() {
		return product;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getClick() {
		return click;
	}
	public WebElement getButtonClick() {
		return buttonClick;
	}
	}
	


