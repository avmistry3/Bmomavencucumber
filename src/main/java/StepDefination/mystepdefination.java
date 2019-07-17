package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class mystepdefination {

	WebDriver driver;
	
	@Given("^user is already on just eat page$")
	public void user_is_already_on_just_eat_page()  {
	   
		
		System.setProperty("webdriver.chrome.driver","C:/Users/archana/Downloads/selenium/chromedriver_win32 (1)/chromedriver.exe ");
	    driver = new ChromeDriver();
	    driver.get("https://www.just-eat.co.uk/");
	 	
		
	}
	
	@When("^title of login page is just eat$")
	public void title_of_login_page_is_just_eat()  {
	    
	 String title = driver.getTitle();
	 System.out.println(title);
	 String expttitle = "Order takeaway online from 20,000+ food delivery restaurants | Just Eat";
	 if(title.contentEquals(expttitle)) {
     	System.out.println("test passed");
     }
     else {
     		System.out.println("test failed");
     	}
	    
	
	}

	@Then("^user enters <AR(\\d+) (\\d+)AA>$")
	public void user_enters_AR_AA(int arg1, int arg2)   {
		driver.findElement(By.name("postcode")).sendKeys("AR51 1AA");
		
	    
	}
	
	@Then("^user clicks on search button$")
	public void user_clicks_on_search_button() throws InterruptedException  {
		driver.findElement(By.xpath("//*[@id=\"skipToMain\"]/form/div/button/span")).click(); 
        Thread.sleep(5000);
	}
	
	@Then("^user is on area page$")
	public void user_is_on_area_page()  {
		
		String title1 = driver.getTitle();
        String expectedTitle1 ="Restaurants and takeaways in Area51, AR51 | Just Eat";
        if(title1.contentEquals(expectedTitle1)) {
        	System.out.println("test passed");
        }
        else {
        		System.out.println("test failed");
        	}
	    
	}
	
	@Then("^Close the browser$")
	public void close_the_browser()  {
	    
	driver.close();
	}
	
	
}
