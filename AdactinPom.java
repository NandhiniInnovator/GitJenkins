package org.testNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPom extends BaseClass {
	public AdactinPom() {
		PageFactory.initElements(driver,this);
		}
	@FindBy(xpath="//input[@type='text']")
	private WebElement userName;
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	@FindBy(xpath="//input[@type='Submit']")
	private WebElement login;
	
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotel;
	@FindBy(id="room_type")
	private WebElement roomType;
	@FindBy(id="room_nos")
	private WebElement roomNum;
	@FindBy(id="datepick_in")
	private WebElement checkin;
	@FindBy(id="datepick_out")
	private WebElement checkout;
	@FindBy(id="adult_room")
	private WebElement adultsRoom;
	@FindBy(name="Submit")
	private WebElement search;
	
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	@FindBy(xpath="continue")
	private WebElement continues;
	
	@FindBy(name="first_name")
	private WebElement firstName;
	@FindBy(name="last_name")
	private WebElement lastName;
	@FindBy(name="address")
	private WebElement address;
	@FindBy(name="cc_num")
	private WebElement cardNo;
	@FindBy(name="cc_type")
	private WebElement cardType;
	@FindBy(name="cc_exp_month") 
	private WebElement expMonth;
	@FindBy(name="cc_exp_year")
	private WebElement expYear;
	@FindBy(name="cc_cvv")
	private WebElement cvv;
	@FindBy(name="book_now")
	private WebElement bookNow;
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getRoomNum() {
		return roomNum;
	}
	public WebElement getCheckin() {
		return checkin;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getAdultsRoom() {
		return adultsRoom;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getRadio() {
		return radio;
	}
	public WebElement getContinues() {
		return continues;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCardNo() {
		return cardNo;
	}
	public WebElement getCardType() {
		return cardType;
	}
	public WebElement getExpMonth() {
		return expMonth;
		
	}
	public WebElement getExpYear() {
		return expYear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBookNow() {
		return bookNow;
	}
	

}
