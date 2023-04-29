package AddDragNDropNewProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SolarLadderAddProjectPage 
{
	//Step1: Variable declaration
	@FindBy(xpath ="//input[@type='number']") private WebElement size;  //private WebElement size= driver.findElement(By.xpath(""))
	@FindBy(xpath ="(//input[@type='text'])[1]") private WebElement name; //private WebElement name= driver.findElement(By.xpath(""))
	@FindBy(xpath ="//input[@type='tel']") private WebElement mobNo; //private WebElement mobNo= driver.findElement(By.xpath(""))
	@FindBy(xpath ="//input[@placeholder='Ex: Delhi']") private WebElement location; //private WebElement location= driver.findElement(By.xpath(""))
	@FindBy(xpath ="(//input[@type='search'])[1]") private WebElement city;  //private WebElement city= driver.findElement(By.xpath(""))
	@FindBy(xpath ="(//span[@class='MuiButton-label'])[2]") private WebElement submitBtn; //private WebElement submitBtn= driver.findElement(By.xpath(""))		
	//Step2: Variable initialization
	public SolarLadderAddProjectPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this); //diffClassName.methodName(webdriverObject, this->Keyword);
	}
				
	//Step3: Variable usage
	public void inpSolarLadderAddProjectPageSize(String sizekw) 
	{
		size.clear();
		size.sendKeys(sizekw);
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
	public void inpSolarLadderAddProjectPageCity(String City)
	{
		city.sendKeys(City);
	}
	public void clickSolarLadderAddProjectPageSubmitBtn()
	{
		submitBtn.click();
	}
}
