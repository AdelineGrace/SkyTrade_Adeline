package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Driver.DriverFactory;
import PageObject.skytrade_pages;
import io.cucumber.java.en.*;
import utilities.ConfigReader;
import utilities.Log;

public class skytrade_stepdefinition {
	
	public static WebDriver driver = DriverFactory.getDriver();
	skytrade_pages page = new skytrade_pages(DriverFactory.getDriver());


	@Given("User wants to explore Sky Trade")
	public void user_wants_to_explore_sky_trade() {
	    Log.info("User logged in the browser successfully");
	}

	@When("User visits Skytrade url")
	public void user_visits_https_sky_trade() throws IOException {
		driver.get(ConfigReader.getWebUrl());
		Log.info("User enters Skytrade url in the browser");
	}

	@Then("User lands on home page")
	public void user_lands_on_home_page() {
		String expectedUrl = ConfigReader.getProperty("expectedUrl");
	  	String actualUrl = driver.getCurrentUrl();
	  	Assert.assertEquals(actualUrl, expectedUrl,"User is not in Skytrade home page");
	}

	@Given("User is in the Sky Trade Home Page")
	public void user_is_in_the_sky_trade_home_page() {
	    Log.info("User in Sky Trade Home Page");

	}

	@When("User clicks on Products dropdown")
	public void user_clicks_on_products_dropdown() throws InterruptedException {
	    page.Click_Products();
	}

	@Then("User should see all the {int} options in the Products drop down")
	public void user_should_see_all_the_options_in_the_products_drop_down(Integer int1) {
	    Log.info("Products options are displayed");
	}

	@Then("User cannot see any options in the Products drop down")
	public void user_cannot_see_any_options_in_the_products_drop_down() {
	   Log.error("Products dropdown has no options");
	}

	@When("User clicks on Solutions dropdown")
	public void user_clicks_on_solutions_dropdown() throws InterruptedException {
	    page.Click_Solutions();
	}

	@Then("User should see all the {int} options in the Solutions drop down")
	public void user_should_see_all_the_options_in_the_solutions_drop_down(Integer int1) {
	    Log.info("Solutions options are displayed");

	}

	@Then("User cannot see any options in the Solutions drop down")
	public void user_cannot_see_any_options_in_the_solutions_drop_down() {
		   Log.error("Solutions dropdown has no options");

	}

	@When("User clicks on Login icon")
	public void user_clicks_on_login_icon() throws InterruptedException {
	    page.Click_Login();
	}

	@Then("User gets navigated to the login page")
	public void user_gets_navigated_to_the_login_page() throws IOException {
		String expectedloginUrl = ConfigReader.getLoginUrl();
	  	String actualloginUrl = driver.getCurrentUrl();
	  	Assert.assertEquals(actualloginUrl, expectedloginUrl,"User is not in Skytrade login page");
	}

	@Then("User should not be navigated to the login page")
	public void user_should_not_be_navigated_to_the_login_page() {
          Log.error("User stays on the Skytrade home page");
	}

	@When("User clicks on {string} icon")
	public void user_clicks_on_icon(String string) throws InterruptedException {
	   page.Click_ClaimAirspace();
	}

	@Then("User stays on the same page")
	public void user_stays_on_the_same_page() {
        Log.error("User stays on the Skytrade home page");

	}

	@When("User clicks on {string} option")
	public void user_clicks_on_option(String string) throws InterruptedException {
	    page.Click_BuyAirspace();
	}

	@Then("User gets scrolled to the Buy Airspace icon")
	public void user_gets_scrolled_to_the_buy_airspace_icon() {
	    Log.info("User scrolled to Buy Airspace option");
	}

	@When("User chooses Buy Airspace from the Products dropdown")
	public void user_chooses_buy_airspace_from_the_products_dropdown() throws InterruptedException {
	    page.Click_BuyAirspace();

	}

	@When("User clicks on Register icon")
	public void user_clicks_on_register_icon() throws InterruptedException {
	    page.Click_Register();
	}

	@Then("User gets navigated to the Register page")
	public void user_gets_navigated_to_the_register_page() throws IOException {
		String expectedloginUrl = ConfigReader.getLoginUrl();
	  	String actualloginUrl = driver.getCurrentUrl();
	  	Assert.assertEquals(actualloginUrl, expectedloginUrl,"User is not in Skytrade login page");
	}

	@Given("User is on Login Page")
	public void user_is_on_login_page() {
	    Log.info("User is in the login page");
	}

	@When("User enters valid email address and clicks {string} button")
	public void user_enters_valid_email_address_and_clicks_button(String string) throws InterruptedException {
	    page.Enter_Email();
	    page.Click_Continue();
	}

	@Then("User should be able to Login Successfully")
	public void user_should_be_able_to_login_successfully() throws IOException {
		String expecteddashboardUrl = ConfigReader.getDashboardUrl();
	  	String actualdashboardUrl = driver.getCurrentUrl();
	  	Assert.assertEquals(actualdashboardUrl, expecteddashboardUrl,"User is not in Skytrade Dashboard page");
	}

	@Given("User is in Login page")
	public void user_is_in_login_page() {
	  Log.info("User is in the login page");
	}

	@When("User clicks Google icon")
	public void user_clicks_google_icon() throws InterruptedException {
	    page.Click_Google();
	}

	@When("User chooses the gmail account")
	public void user_chooses_the_gmail_account() {
	    Log.info("User chooses the Gmail account");
	}

	@Then("User gets navigated to the Individual or Corporate option page")
	public void user_gets_navigated_to_the_individual_or_corporate_option_page() {
	   Log.info("Individual Or Corporate Page");
	}

	@Given("User chooses the google account to login")
	public void user_chooses_the_google_account_to_login() {
	    Log.info("User chooses the Gmail account");

	}

	@When("User clicks Individual option")
	public void user_clicks_individual_option() throws InterruptedException {
	   page.Click_Individual();
	}

	@Then("User gets navigated to the personal details page")
	public void user_gets_navigated_to_the_personal_details_page() {
	    Log.info("User is in Individual details page");
	}

	@Given("User chooses Individual option")
	public void user_chooses_individual_option() {
	    Log.info("User chooses Individual option");
	}

	@When("User enters valid Name and Phone Number and clicks submit")
	public void user_enters_valid_name_and_phone_number_and_clicks_submit() throws InterruptedException {
	    page.Enter_Name();
	    page.Enter_PhoneNumber();
	    page.Click_Submit();
	}

	@Then("User gets navigated to the Sky Trade Dashboard page")
	public void user_gets_navigated_to_the_sky_trade_dashboard_page() throws IOException {
		String expecteddashboardUrl = ConfigReader.getDashboardUrl();
	  	String actualdashboardUrl = driver.getCurrentUrl();
	  	Assert.assertEquals(actualdashboardUrl, expecteddashboardUrl,"User is not in Skytrade Dashboard page");
	}

	@Given("User is in the Dashboard Page")
	public void user_is_in_the_dashboard_page() {
	   Log.info("User lands on the Dashboard Page");
	}

	@When("User clicks Balance square box")
	public void user_clicks_balance_square_box() throws InterruptedException {
	    page.Click_Balance();
	}

	@Then("User gets navigated to the Wallet Page")
	public void user_gets_navigated_to_the_wallet_page() throws IOException {
		String expectedWalletUrl = ConfigReader.getWalletUrl();
	  	String actualWalletUrl = driver.getCurrentUrl();
	  	Assert.assertEquals(actualWalletUrl, expectedWalletUrl,"User is not in Skytrade Wallet page");
	}

	@When("User clicks {string}")
	public void user_clicks(String string) throws InterruptedException {
	    page.Click_MyAirspace();
	}

	@Then("User gets navigated to the Airspace page")
	public void user_gets_navigated_to_the_airspace_page() {
		String expectedAirspaceUrl = ConfigReader.getProperty("expectedAirspaceUrl");
	  	String actualAirspaceUrl = driver.getCurrentUrl();
	  	Assert.assertEquals(actualAirspaceUrl, expectedAirspaceUrl,"User is not in Skytrade Airspace page");
	}

	@When("User scrolls down the dashboard page")
	public void user_scrolls_down_the_dashboard_page() {
	    Log.info("User scrolls down in the Dashboard Page");
	}

	@Then("User able to see the User Geographics pie chart")
	public void user_able_to_see_the_user_geographics_pie_chart() throws InterruptedException {
	    String GeographicsPie = page.get_Geographics();
	    System.out.println(GeographicsPie);
	}
}
