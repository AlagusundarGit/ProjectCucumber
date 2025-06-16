package stepDefinition;



import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Baseclass.CommonActions;
import PageObjects.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MyAccountProfile2 extends CommonActions{
	
	CommonActions ca=new CommonActions();
	HomePage h=new HomePage();
	
	
	@Given("Launch the Puma application")
	public void launch_the_puma_application() {
	    ca.launch("https://sg.puma.com");
	    ca.closeLocation(h.getShadLocation());
	    ca.acceptCookies(h.getShadAgree());
	}

	@Given("Navigate to the Login page")
	public void navigate_to_the_login_page() throws InterruptedException {
		System.out.println("Login page navigation");
		Thread.sleep(5000);
	    ca.click(h.getQuicklinks());
	    ca.click(h.getQuicklinkLogin());
	}

	@When("Enter the valid credentials")
	public void enter_the_valid_credentials() {
	    System.out.println("Entering credentials");
	    WebElement loginEmail=driver.findElement(By.xpath("//input[@id='login-form-email']"));
	    ca.enterText(loginEmail, "alagusundar.sundarrajan@borngroup.com");
	    WebElement loginPassword=driver.findElement(By.xpath("//input[@id='login-form-password']"));
	    ca.enterText(loginPassword, "Test$1234");
	}

	
	@When("Click on login button")
	public void click_on_login_button() {
	    System.out.println("Click on login button");
	    WebElement loginButton=driver.findElement(By.xpath("//div[@class='login-bottom-row']/button"));
	    ca.click(loginButton);
	}

	@Then("Verify the user land on profile page")
	public void verify_the_user_land_on_profile_page() throws InterruptedException {
		Thread.sleep(3000);
	    System.out.println("Verify profile details");
	    WebElement profile=driver.findElement(By.xpath("//h1[@class='page-title']"));
	    String profileDetails=profile.getText();
	    System.out.println(profileDetails);
	    String pageTitle=driver.getTitle();
	    System.out.println(pageTitle);
	    driver.quit();
	}
	
	@When("Enter the valid credentials one dimentional list")
	public void enter_the_valid_credentials_one_dimentional_list(DataTable data) {
		List<String> cred=data.asList();
		System.out.println("Entering credentials");
	    WebElement loginEmail=driver.findElement(By.xpath("//input[@id='login-form-email']"));
	    ca.enterText(loginEmail, cred.get(0));
	    WebElement loginPassword=driver.findElement(By.xpath("//input[@id='login-form-password']"));
	    ca.enterText(loginPassword, cred.get(1));
	}
	
	@When("Enter the valid credentials one dimentional map")
	public void enter_the_valid_credentials_one_dimentional_map(DataTable data) {
	    Map<String,String> cred=data.asMap(String.class, String.class);
	    System.out.println("Entering credentials");
	    WebElement loginEmail=driver.findElement(By.xpath("//input[@id='login-form-email']"));
	    ca.enterText(loginEmail, cred.get("1"));
	    WebElement loginPassword=driver.findElement(By.xpath("//input[@id='login-form-password']"));
	    ca.enterText(loginPassword, cred.get("2"));
	}
	
	@When("Enter the valid credentials {string}{string}")
	public void enter_the_valid_credentials(String email, String password) {
		System.out.println("Entering credentials");
	    WebElement loginEmail=driver.findElement(By.xpath("//input[@id='login-form-email']"));
	    ca.enterText(loginEmail, email);
	    WebElement loginPassword=driver.findElement(By.xpath("//input[@id='login-form-password']"));
	    ca.enterText(loginPassword, password);
	}
	
}
