package com.stepdef;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class page extends Base {
	public static WebDriver driver;
	public WebElement element;
	public page()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="twotabsearchtextbox")
	private WebElement searchbox;
	@FindBy(id="nav-search-submit-button")
	private WebElement submit;
	@FindBy(xpath="//span[text()='Apple iPhone 13 (256GB) - Pink']")
	private WebElement mobileclick;
	@FindBy (xpath="//img[@src='https://m.media-amazon.com/images/I/11VmJVS7yrL._SS36_.jpg']")
	private WebElement mousehover;
	@FindBy (xpath="//span[text()='NOKIA 105 Dual SIM (Black)']")
	private WebElement nokia;
	@FindBy (id="add-to-cart-button")
	private WebElement Addtocart;
	@FindBy (xpath="//span[text()='Samsung Galaxy S22 5G (Phantom Black, 8GB, 128GB Storage) + Samsung Galaxy Buds 2']")
	private WebElement samsung;
	@FindBy (id="buy-now-button")
	private WebElement buy;
	@FindBy (xpath="//span[text()='Redmi 9A (Midnight Black 2GB RAM 32GB Storage) | 2GHz Octa-core Helio G25 Processor | 5000 mAh Battery']")
	private WebElement redmi;
	@FindBy (id="add-to-cart-button")
	private WebElement add2cart;
	
	public WebElement getAdd2cart() {
		return add2cart;
	}
	public WebElement getRedmi() {
		return redmi;
	}
	public void setSamsung(WebElement samsung) {
		this.samsung = samsung;
	}
	public WebElement getAddtocart() {
		return Addtocart;
	}
	public WebElement getNokia() {
		return nokia;
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getElement() {
		return element;
	}
	public WebElement getSearchbox() {
		return searchbox;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getBuy() {
		return buy;
	}
	public WebElement getMobileclick() {
		return mobileclick;
	}
	public WebElement getMousehover() {
		return mousehover;
	}
	
	public void launch()  {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486386870127&hvpos=&hvnetw=g&hvrand=16839199142249046629&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061895&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=CjwKCAiAsNKQBhAPEiwAB-I5zWGtggOTw1YyzISFj8mZcGpIF5PCtosqgZGasFsnmTFuf6KFt0BLIRoCmp4QAvD_BwE");
       
	    driver.manage().window().maximize();
    	

		
		
	}
	public WebElement getSamsung() {
		return samsung;
	}
	public void search() throws InterruptedException {
		send(getSearchbox(), "Iphone");
		clk(getSubmit());		
		Thread.sleep(3000);

	}
	public void search1() throws InterruptedException {
		send(getSearchbox(), "nokia");
		clk(getSubmit());		
		Thread.sleep(3000);

	}
	
	public void search2() throws InterruptedException {
		send(getSearchbox(), "samsung");
		clk(getSubmit());		
		Thread.sleep(3000);

	}
	public void search3() throws InterruptedException {
		send(getSearchbox(), "redmi");
		clk(getSubmit());		
		Thread.sleep(3000);

	}
	public void mbclk() {
		 String parent = driver.getWindowHandle();
		clk(getMobileclick());
		Set<String> windowHandles = driver.getWindowHandles();
		for (String x : windowHandles) {
			if(!parent.equals(x))
			{
			driver.switchTo().window(x);
			Actions a = new Actions(driver);
			a.moveToElement(getMousehover()).perform();
			
			}
			
		}
	

	}
	public void nokiaclk() {
		String parent = driver.getWindowHandle();
		clk(getNokia());
		Set<String> windowHandles = driver.getWindowHandles();
		for (String x : windowHandles) {
			if(!parent.equals(x))
			{
				driver.switchTo().window(x);
				clk(getAddtocart());
			}
			
		}

	}
	public void samsungclk() {
		String parent = driver.getWindowHandle();
		clk(getSamsung());
		Set<String> windowHandles = driver.getWindowHandles();
		for (String x : windowHandles) {
			if(!parent.equals(x))
			{
				driver.switchTo().window(x);
				clk(getBuy());
			}
			
		}
	}
	
	public void redmiclk() {
		String parent = driver.getWindowHandle();
		clk(getRedmi());
		Set<String> windowHandles = driver.getWindowHandles();
		for (String x : windowHandles) {
			if(!parent.equals(x))
			{
				driver.switchTo().window(x);
				clk(getAdd2cart());
			}
			
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
