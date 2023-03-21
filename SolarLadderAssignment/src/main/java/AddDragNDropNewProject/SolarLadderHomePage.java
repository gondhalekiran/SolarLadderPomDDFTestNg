package AddDragNDropNewProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SolarLadderHomePage 
{
	
	@FindBy(xpath ="(//span[@class='MuiButton-label'])[1]") private WebElement addProjectButton;  //private WebElement UN= driver.findElement(By.xpath(""))
	@FindBy(xpath ="(//button[@type='button'])[4]") private WebElement closeMoreInfoPop; //private WebElement PWD= driver.findElement(By.xpath(""))
	
	@FindBy(xpath ="(//div[@class='smooth-dnd-draggable-wrapper'])[1]") private WebElement enq; //private WebElement PWD= driver.findElement(By.xpath(""))
	@FindBy(xpath ="(//div[@class='smooth-dnd-container vertical'])[2]") private WebElement siteVisit; //private WebElement PWD= driver.findElement(By.xpath(""))
	   
	//step2: variable initialization
	public SolarLadderHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this); //diffClassName.methodName(webdriverObject, this->Keyword);
	}
				
	//step3: variable usage
	public void clickSolarLadderHomePageAddProjectButton() 
	{
		addProjectButton.click();	
	}
	public void clickSolarLadderHomePagecloseMoreInfoPop() 
	{
		closeMoreInfoPop.click();	
	}	
	public WebElement getEnq() 
	{
		return enq ;	
	}
	public WebElement getSiteVisit() 
	{
		return siteVisit ;	
	}	
}


