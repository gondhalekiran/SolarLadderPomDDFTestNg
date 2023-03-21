package AddDragNDropNewProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SolarLadderAddProjectPage 
{
	@FindBy(xpath ="//input[@type='number']") private WebElement size;  //private WebElement UN= driver.findElement(By.xpath(""))
	@FindBy(xpath ="(//input[@type='text'])[1]") private WebElement name; //private WebElement PWD= driver.findElement(By.xpath(""))
	@FindBy(xpath ="//input[@type='tel']") private WebElement mobNo; //private WebElement signInBtn= driver.findElement(By.xpath(""))
	@FindBy(xpath ="(//input[@type='text'])[2]") private WebElement location; //private WebElement signInBtn= driver.findElement(By.xpath(""))
	@FindBy(xpath ="(//span[@class='MuiButton-label'])[2]") private WebElement submitBtn; //private WebElement signInBtn= driver.findElement(By.xpath(""))		
	//step2: variable initialization
	public SolarLadderAddProjectPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this); //diffClassName.methodName(webdriverObject, this->Keyword);
	}
				
	//step3: variable usage
	public void inpSolarLadderAddProjectPageSize(String Sizekw) 
	{
		size.clear();
		size.sendKeys(Sizekw);
	}
	public void inpSolarLadderAddProjectPageName(String Name) 
	{
		name.sendKeys(Name);
	}
	public void inpSolarLadderAddProjectPageMobNo(String MobNo) 
	{
		mobNo.sendKeys(MobNo);
	}
	public void inpSolarLadderAddProjectPageLocation(String Location) 
	{
		location.sendKeys(Location);
	}
	public void clickSolarLadderAddProjectPageSubmitBtn()
	{
		submitBtn.click();
	}
}
