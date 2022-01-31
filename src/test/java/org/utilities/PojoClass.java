package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass{
	// non paramterised constructor
	public PojoClass() {
		PageFactory.initElements(driver, this);
	}
//2. declare private variable.
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="pass")
private WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement login;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
}
