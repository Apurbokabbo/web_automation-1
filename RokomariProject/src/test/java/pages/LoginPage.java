package pages;

import org.openqa.selenium.By;


public class LoginPage extends BasePage {
	 
	 public String loginPageUrl = "https://www.rokomari.com/login";
	 public String email ="testingboss00@gmail.com";
	 public String mobile ="01532312199";
	 public String password = "87654321";
	 public String waringMessage ="This field is required!";
	 public String suggestionMesage ="Login easily with your facebook or google account";
	 public String wrongWarningMessage = "Wrong email/phone or password";
	 
	 
	 public By wrongWarningMessageLocator = By.xpath("//p[contains(text(),'Wrong email/phone or password')]"); 
	 public By signInTabButton = By.xpath("//p[contains(text(),'Sign in')]"); 
	 public By signUpTabButton = By.xpath("//p[contains(text(),'Sign up')]");
	 public By facebookButton = By.xpath("//body/div[@id='login-registration']/div[1]/section[1]/div[2]/div[2]/div[1]/div[1]/button[1]");
	 public By googleButton = By.xpath("//body/div[@id='login-registration']/div[1]/section[1]/div[2]/div[2]/div[1]/div[1]/button[2]");
	 public By emailOrMobileInputFieldLocator =By.xpath("//input[@id='j_username']");
	 public By passwordFieldLocator=By.xpath("//input[@id='j_password']");
	 public By rememberMeCheckboxLocator = By.xpath("//label[contains(text(),'Remember Me')]");
	 public By forgetPasswordButton = By.xpath("//a[contains(text(),'Forgot Password?')]");
	 public By signInButton = By.xpath("//button[contains(text(),'Sign In')]");
	 public By warningMessageMailLocator = By.xpath("//body/div[@id='login-registration']/div[1]/section[1]/div[2]/div[3]/form[1]/div[1]/div[1]/p[1]");
	 public By warningMessagePasswordLocator = By.xpath("//body/div[@id='login-registration']/div[1]/section[1]/div[2]/div[3]/form[1]/div[2]/div[1]/p[1]");
	 public By suggestionMessageLocator = By.xpath("//p[contains(text(),'Login easily with your facebook or google account')]");
	 public By bannerCloseButtonBy = By.xpath("//body/div[@id='js--notification-permission-modal']/button[@id='js--notification-btn-close']/img[1]");
	 
	 
	 public void loginWithMobileEmail(String mailphone , String password ) throws InterruptedException  {
			Thread.sleep(5000);
			try {
				clickOn(bannerCloseButtonBy);

			} catch (Exception e) {
				System.out.println("Banner not found");
			}
			writeText(emailOrMobileInputFieldLocator, mailphone);
			Thread.sleep(2000);
			writeText(passwordFieldLocator, password);
			Thread.sleep(2000);
			clickOn(signInButton);
			Thread.sleep(2000);

		 
		
	}
	 
	 
}
