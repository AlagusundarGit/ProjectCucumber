package stepDefinition;

import java.util.Arrays;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Baseclass.CommonActions;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;


public class Hooks2 extends CommonActions{
	
	static long startTime;
	
	@Before
	public void beforeScenario() {
		System.out.println("Before Scenario1");
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AS00892314\\eclipse-converse\\Cucumber\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("window-size=1920,1080");
		options.addArguments("start-maximized");
		options.setExperimentalOption("excludeSwitches",
		     Arrays.asList("disable-popup-blocking"));
		//options.addArguments("headless");
		driver = new ChromeDriver(options);
		startTime=System.currentTimeMillis();
		System.out.println(startTime);
	}
	@After
	public void afterScenario() {
		System.out.println("After Scenario1");
		long endTime=System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}
	
}
