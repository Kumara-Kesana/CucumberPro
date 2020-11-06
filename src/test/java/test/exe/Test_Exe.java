package test.exe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Exe {
	
	public static WebDriver driver;
	String url = "https://www.jaguarlandrover.com/";
	String browse = "chrome";
	String userDir = System.getProperty("user.dir");
			
	@Before()
	public void setup()
	{
		if(browse.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", userDir+"\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browse.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", userDir+"\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Given("^Iam on Jaguar page$")
	public void iam_on_Jaguar_page() throws Throwable {
	 
		
	}

	@When("^I will click on each category page$")
	public void i_will_click_on_each_category_page() throws Throwable {
	    
	}

	@Then("^I will navigate to company page$")
	public void i_will_navigate_to_company_page() throws Throwable {
	    
	}
	
	@After()
	public void teardown()
	{
		
	}

}
