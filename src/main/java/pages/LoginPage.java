package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='login_id']")
	public WebElement EmailTextBox;
	
	@FindBy(xpath="//*[@id=\"nextbtn\"]")
	public WebElement NextButton;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement PasswordTextBox;
	
	@FindBy(xpath="//*[@id=\"nextbtn\"]/span")
	public WebElement SignInButton;
	
	public void LoginInZoho(String userName, String password) {
		EmailTextBox.sendKeys(userName);
		NextButton.click();
		PasswordTextBox.sendKeys(password);
		SignInButton.click();
		
		
	}

}
