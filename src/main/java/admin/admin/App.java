package admin.admin;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;
import java.io.PrintWriter;

import org.openqa.selenium.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
/**
 * Hello world!
 *
 */
@CucumberOptions(features= {"C:\\Users\\sravanth\\eclipse-workspace\\admin\\asd.feature"},glue= {})
public class App extends AbstractTestNGCucumberTests
{
	public WebDriver driver1;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    @BeforeClass
    public void befClass() {
    	
    	
    	
    	
    }
    @BeforeTest
    public void befTest() {
    	
    }
    
    @Test
	public void testng() {
		
	}
    @AfterTest
    public void aftTest() {
    	
    }
    @AfterClass
    public void aftClass() {
    	
    }
    @Given("^Modular GUI is opened$")
    public void modular_GUI_is_opened() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.setProperty("webdriver.ie.driver", "C:\\Users\\sravanth\\Downloads\\IEDriverServer_x64_3.6.0\\IEDriverServer.exe");
    	DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
    	caps.setCapability("ignoreZoomSetting", true);
    	driver1 = new InternetExplorerDriver(caps);
    	driver1.manage().window().maximize();
    	driver1.navigate().to("https://www.google.com");
    	String strPageTitle = driver1.getTitle();
		System.out.println("Page title: - "+strPageTitle);
		//Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");
   
	 }

    @When("^Validate the login page$")
    public void validate_the_login_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	try{
    	    PrintWriter writer = new PrintWriter("abc.txt", "UTF-8");
    	    writer.println("In Validate the login page code");
    	    writer.close();
    	} catch (IOException e) {
    	   // do something
    	}
    }

    @Then("^Login to the Modular$")
    public void login_to_the_Modular() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        
    }
}
