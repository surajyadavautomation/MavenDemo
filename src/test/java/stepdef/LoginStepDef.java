package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import DriverMain.Generic;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef extends Generic{

	
	@Given("^I login on the application$")
	public void i_login_on_the_application() throws Throwable {
	   driver.get("https://www.google.com/");
        
	}

	@When("^I enter google search keyword$")
	public void i_enter_google_search_keyword() throws Throwable {
	    driver.findElement(By.id("lst-ib")).sendKeys("automation");
	}

	@When("^I click on submit button$")
	public void i_click_on_submit_button() throws Throwable {
	   driver.findElement(By.name("btnK")).click();
	}
	

    @Then("^I verify the success in step$")
    public void i_verify_the_success_in_step() throws Throwable {
    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	 driver.quit();
    
    }
    

@Then("^I verify the in step$")
public void i_verify_the_in_step() throws Throwable {
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.quit();

}
}
