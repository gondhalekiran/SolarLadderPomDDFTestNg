package AddDragNDropNewProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SolarLadderLoginPage 
{
	//Step1: Variable declaration
	@FindBy(xpath = "//input[@name='email']") private WebElement uN;  //private WebElement UN= driver.findElement(By.xpath(""))
	@FindBy(xpath = "//input[@name='password']") private WebElement pWD; //private WebElement PWD= driver.findElement(By.xpath(""))
	@FindBy(xpath = "//span[text()='Sign In']") private WebElement singnInBtn; //private WebElement signInBtn= driver.findElement(By.xpath(""))
			
	//Step2: Variable initialization
	public SolarLadderLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this); //diffClassName.methodName(webdriverObject, this->Keyword);
	}
				
	//Step3: Variable usage
	public void inpSolarLadderLoginPageEmail(String username) 
	{
		uN.sendKeys(username);	
	}

	public void inpSolarLadderLoginPagePassword(String password)
	{
		pWD.sendKeys(password);
	}
				
	public void clickSolarLadderLoginPageLoginBtn() 
	{
		singnInBtn.click();
	}
}
