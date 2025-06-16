package Baseclass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import io.github.sukgu.Shadow;
import stepDefinition.Hooks2;

public class CommonActions {

	public static WebDriver driver;
	//public static WebDriver driver= new ChromeDriver();

	// launch
	public void launch(String url) {
		System.out.println("Site launch");
		driver.get(url);
	}

	// SendKeys
	public void enterText(WebElement ele, String input) {
		ele.sendKeys(input);
	}

	// Click
	public void click(WebElement ele) {
		ele.click();
	}

	// Location popup close
	public void closeLocation(WebElement shadEle) {
		Shadow shadow = new Shadow(driver);
		//WebElement shadElement = shadow.findElement("button.close.close--button");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", shadEle);
	}

	// Accept Cookies
	public void acceptCookies(WebElement shadEle) {
		Shadow shadow = new Shadow(driver);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		//WebElement shadAgree = shadow.findElement("div.action>button");
		//executor.executeScript("arguments[0].click();", shadAgree);
		executor.executeScript("arguments[0].click();", shadEle);
	}
}
