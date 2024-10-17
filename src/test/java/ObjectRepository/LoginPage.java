package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//a[@id='teaser-desCTA-Student Club']")
	public WebElement joinNow;
	
	@FindBy(xpath="//input[@id='f105']") 
	public WebElement enterEmailAddress;
	
	@FindBy(xpath="//input[@id='f106']") 
	public WebElement typeAPassword;
	
	@FindBy(xpath="//input[@id='f107']") public WebElement retypePassword;
	@FindBy(xpath="//select[@id='f241']") public WebElement countryCode;
	
}
