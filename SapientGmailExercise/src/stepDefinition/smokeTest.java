package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class smokeTest {
	WebDriver driver;
	

	@Given("^Gmail login page is open$")
	public void open_firefox_and_start_Gmail() throws Throwable {
		System.setProperty("webdriver.firefox.marionette",".\\drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http:gmail.com");
		//*[@id='identifierId']
	}

	@When("^User enters valid \"([^\"]*)\" and click NEXT button$")
	public void user_enters_valid_and_click_NEXT_button(String username) throws Throwable {
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(username);
		driver.findElement(By.xpath("//content/span[contains(.,'Next')]")).click();
		
	}

	@When("^User enters \"([^\"]*)\" and click NEXT button$")
	public void user_enters_and_click_NEXT_button(String pass) throws Throwable {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//content/span[contains(.,'Next')]")).click();
		Thread.sleep(5000);
		
	}
	
	@Then("^User is on home page$")
	public void user_is_on_home_page() throws Throwable {
		String title =driver.getTitle();
		System.out.println("Title: "+title);
		if(title.contains("sapientexcercise"))
		{
			System.out.println("Logged in successfully");
		}else{System.out.println("Failed to login");}
		driver.quit();
	}
	
	
	@Given("^User is on gmail home page$")
	public void user_is_on_gmail_home_page() throws Throwable {

	    System.setProperty("webdriver.firefox.marionette",".\\drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http:gmail.com");
		
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("sapientexcercise");
		driver.findElement(By.xpath("//content/span[contains(.,'Next')]")).click();
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pass@1234");
		driver.findElement(By.xpath("//content/span[contains(.,'Next')]")).click();
		
		String title =driver.getTitle();
		System.out.println("Title: "+title);
		if(title.contains("sapientexcercise"))
		{
			System.out.println("Logged in successfully");
		}else{System.out.println("Failed to login");}
	}

	@When("^User open Compose box in gmail$")
	public void user_open_Compose_box_in_gmail() throws Throwable {

	    driver.findElement(By.xpath("//div[contains(.,'COMPOSE') and @role='button']")).click();
	}

	@When("^User enters receivers email address$")
	public void user_enters_receivers_email_address() throws Throwable {

	    driver.findElement(By.xpath(".//*[@method='POST']//tr[contains(.,'To')]//textarea")).sendKeys("amittech3@gmail.com");
		
	}

	@When("^User enters Subject line$")
	public void user_enters_Subject_line() throws Throwable {

	    driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("Test Subject");
		
	}

	@When("^User enters text in the body$")
	public void user_enters_text_in_the_body() throws Throwable {

	    driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Test message body");
		
	}

	@When("^User clicks on Send button$")
	public void user_clicks_on_Send_button() throws Throwable {
	    
	    driver.findElement(By.xpath("//div[@role='button' and contains(.,'Send')]")).click();
		
	}

	@Then("^Message on page will display message Your message has been sent\\.$")
	public void message_on_page_will_display_message_Your_message_has_been_sent() throws Throwable {
	    
	    if(driver.getPageSource().contains("Your message has been sent"))
	    {
	    	System.out.println("Message sent");
	    }
	    driver.quit();
	}

}
