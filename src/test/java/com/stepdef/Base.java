package com.stepdef;

import org.openqa.selenium.WebElement;

public class Base {
	public void send(WebElement element,String text) {
		element.sendKeys(text);

	}
	public void clk(WebElement element) {
		element.click();

	}

}
