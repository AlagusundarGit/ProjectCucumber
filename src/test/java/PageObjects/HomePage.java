package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.CommonActions;
import io.github.sukgu.support.FindElementBy;

public class HomePage extends CommonActions {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(@href,'quicklinks')]")
	private WebElement quicklinks;

	@FindBy(xpath = "//div[contains(@class,'actions')]/div[contains(@class,'authenticate')]/a")
	private WebElement quicklinkLogin;
	
	@FindElementBy(css = "div.action>button")
	private WebElement shadAgree;

	@FindElementBy(css = "button.close.close--button")
	private WebElement shadLocation;

	public WebElement getQuicklinks() {
		return quicklinks;
	}

	public WebElement getQuicklinkLogin() {
		return quicklinkLogin;
	}

	public WebElement getShadAgree() {
		return shadAgree;
	}

	public WebElement getShadLocation() {
		return shadLocation;
	}

}
