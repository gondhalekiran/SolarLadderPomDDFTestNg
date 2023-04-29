package AddDragNDropNewProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SolarLadderHomePage 
{	
	//Step1: Variable declaration
	@FindBy(xpath ="(//span[@class='MuiButton-label'])[1]") private WebElement addProjectButton;  //private WebElement addProjectButton= driver.findElement(By.xpath(""))
	@FindBy(xpath ="(//span[@class='MuiIconButton-label'])[3]") private WebElement closeMoreInfoPop; //private WebElement closeMoreInfoPop= driver.findElement(By.xpath(""))	
	@FindBy(xpath ="(//div[@class='smooth-dnd-draggable-wrapper'])[1]") private WebElement enq; //private WebElement enq= driver.findElement(By.xpath(""))
	@FindBy(xpath ="(//div[@class='smooth-dnd-container vertical'])[2]") private WebElement siteVisit; //private WebElement siteVisit= driver.findElement(By.xpath(""))
	@FindBy(xpath ="(//section[@title='Site Visit']//div[@class='crm-projectcard'])[1]") private WebElement card; //private WebElement card= driver.findElement(By.xpath(""))

    //public WebDriver driver;
    public Actions Act;       //global declaration of instance of action class
	
	//Step2: Variable initialization
	public SolarLadderHomePage(WebDriver driver )
	{
		PageFactory.initElements(driver, this); //diffClassName.methodName(webdriverObject, this->Keyword);
	//	this.driver = driver;
		this.Act= new Actions(driver);   //initialize instance of action class with webdriver instance as parameter
	}
			
	//Step3: Variable usage
	public void clickSolarLadderHomePageAddProjectButton() 
	{
		addProjectButton.click();	
	}
	public void clickSolarLadderHomePagecloseMoreInfoPop() 
	{
		closeMoreInfoPop.click();	
	}	
	public void dragNDropSolarLadderHomePage() throws InterruptedException 
	{
	    //Act= new Actions(driver);
		Thread.sleep(5000);
		Act.clickAndHold(enq).moveToElement(siteVisit).release(siteVisit).perform();
	}
	public WebElement getCard() 
	{
		return card ;	
	}
}


