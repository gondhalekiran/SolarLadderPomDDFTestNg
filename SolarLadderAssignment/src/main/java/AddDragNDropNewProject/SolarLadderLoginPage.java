package AddDragNDropNewProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SolarLadderLoginPage 
{
	//step1: variable declaration
	@FindBy(xpath = "//input[@name='email']") private WebElement UN;  //private WebElement UN= driver.findElement(By.xpath(""))
	@FindBy(xpath = "//input[@name='password']") private WebElement PWD; //private WebElement PWD= driver.findElement(By.xpath(""))
	@FindBy(xpath = "//span[text()='Sign In']") private WebElement singnInBtn; //private WebElement signInBtn= driver.findElement(By.xpath(""))
			
	//step2: variable initialization
	public SolarLadderLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this); //diffClassName.methodName(webdriverObject, this->Keyword);
	}
				
	//step3: variable usage
	public void inpSolarLadderLoginPageEmail(String username) 
	{
		UN.sendKeys(username);	
	}

	public void inpSolarLadderLoginPagePassword(String password)
	{
		PWD.sendKeys(password);
	}
				
	public void clickSolarLadderLoginPageLoginBtn() 
	{
		singnInBtn.click();
	}
}
