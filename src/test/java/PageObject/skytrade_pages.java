package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class skytrade_pages {

	By Products = By.xpath("//div[2][contains(text(),'Products')]");
	By Solutions = By.xpath("//div[2][contains(text(),'Solutions')]");
	By login  = By.xpath("//a[contains(text(),'Login')]");
	By ClaimAirspace = By.xpath("//a[contains(text(),'Claim Airspace for no charge')]");
	By BuyAirspace = By.xpath("//a[contains(text(),'Buy Airspace')]");
    By Register  = By.xpath("//a[contains(text(),'Register Now')]");
	By Email = By.xpath("//input[@type='email']");
	By Continue = By.xpath("//div//button[contains(text(),'Continue with Email')]");
	By Google = By.xpath("//div//button//img");
	By Individual = By.xpath("//div/button[contains(text(),'Individual')]");
	By Name = By.xpath("//input[contains(@placeholder ,'Name')]");
	By PhoneNumber = By.xpath("//div/label[contains(text(),'Phone Number')]");
	By Submit = By.xpath("//div/button[contains(text(),'Submit')]");
	By Balance = By.xpath("//div/p[contains(text(),'Balance')]");
	By MyAirspace = By.xpath("//div/p[contains(text(),'My Airspace')]");
	By GeographicsPie = By.xpath("//div/canvas");

	
	
	  WebDriver driver; 	
	  
			public  skytrade_pages(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			public void Click_Products() throws InterruptedException
			{
				driver.findElement(Products).click();
			}
			public void Click_Solutions() throws InterruptedException
			{
				driver.findElement(Solutions).click();
			}
			public void Click_Login() throws InterruptedException
			{
				driver.findElement(login).click();
			}
			public void Click_ClaimAirspace() throws InterruptedException
			{
				driver.findElement(ClaimAirspace).click();
			}
			public void Click_BuyAirspace() throws InterruptedException
			{
				driver.findElement(BuyAirspace).click();
			}
			public void Click_Register() throws InterruptedException
			{
				driver.findElement(Register).click();
			}
			public void Enter_Email() throws InterruptedException
			{
				driver.findElement(Email).sendKeys("addy@gmail.com");
			}
			public void Click_Continue() throws InterruptedException
			{
				driver.findElement(Continue).click();
			}
			public void Click_Google() throws InterruptedException
			{
				driver.findElement(Google).click();
			}
			public void Click_Individual() throws InterruptedException
			{
				driver.findElement(Individual).click();
			}
			public void Enter_Name() throws InterruptedException
			{
				driver.findElement(Name).sendKeys("Andy");
			}
			public void Enter_PhoneNumber() throws InterruptedException
			{
				driver.findElement(PhoneNumber).sendKeys("6466666666");
			}
			public void Click_Submit() throws InterruptedException
			{
				driver.findElement(Submit).click();
			}
			public void Click_Balance() throws InterruptedException
			{
				driver.findElement(Balance).click();
			}
			public void Click_MyAirspace() throws InterruptedException
			{
				driver.findElement(MyAirspace).click();
			}
			public String get_Geographics() throws InterruptedException
			{
				return driver.findElement(GeographicsPie).getText();
			}
}
