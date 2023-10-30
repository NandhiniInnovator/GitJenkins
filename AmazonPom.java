package org.testNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPom extends BaseClass {
	public AmazonPom() {
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath="//input[@placeholder='Search Amazon']")
private WebElement input;
@FindBy(xpath="(//input[@type='submit'])[1]")
private WebElement search;
@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[11]")
private WebElement productClick;
@FindBy(xpath="//input[@value='Add to Cart']")
private WebElement addToCard;
public WebElement getInput() {
	return input;
}
public WebElement getSearch() {
	return search;
}
public WebElement getProductClick() {
	return productClick;
}
public WebElement getAddToCard() {
	return addToCard;
}



}
