package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login_stepdefs 
{
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\a07208trng_b4b.04.24\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
	@Given("^The URL of the application$")
	public void the_URL_of_the_application() throws Throwable
	{
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://newtours.demoaut.com");
	    
	}

	@When("^User enters mercury as username$")
	public void user_enters_mercury_as_username() throws Throwable {
	  driver.findElement(By.name("username")).sendKeys("mercury");
	}

	@When("^User enters mercury as password$")
	public void user_enters_mercury_as_password() throws Throwable {
		driver.findElement(By.name("password")).sendKeys("mercury");
	}

	@When("^User clicks on submit$")
	public void user_clicks_on_submit() throws Throwable {
		driver.findElement(By.name("login")).click();;
	}

	@Then("^User is valid$")
	public void user_is_valid(String result) throws Throwable {
		   Assert.assertTrue(driver.getTitle.contains("Find"));
	}
}
