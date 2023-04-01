package AddDragNDropNewProject;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;

public class E5SolarLadderTC extends BaseClass
{
SolarLadderLoginPage login;
SolarLadderHomePage home;
SolarLadderAddProjectPage project;
Actions Act;
@BeforeClass
public void openBrowser() throws EncryptedDocumentException, IOException
{
initializeBrowser();
login = new SolarLadderLoginPage(driver);
home = new SolarLadderHomePage(driver);
project = new SolarLadderAddProjectPage(driver);
Act= new Actions(driver);
}
			
@BeforeMethod
public void loginToApp() throws InterruptedException, IOException 
{
login.inpSolarLadderLoginPageEmail(UtilityClass.getPFData("UN"));
login.inpSolarLadderLoginPagePassword(UtilityClass.getPFData("PWD"));
login.clickSolarLadderLoginPageLoginBtn();
	
home.clickSolarLadderHomePageAddProjectButton();
Thread.sleep(20000);
home.clickSolarLadderHomePagecloseMoreInfoPop();
home.clickSolarLadderHomePageAddProjectButton();
	
project.inpSolarLadderAddProjectPageSize(UtilityClass.getTD(0, 0));
project.inpSolarLadderAddProjectPageName(UtilityClass.getTD(0, 1));
project.inpSolarLadderAddProjectPageMobNo(UtilityClass.getTD(0, 2));
project.inpSolarLadderAddProjectPageLocation(UtilityClass.getTD(0, 3));
project.clickSolarLadderAddProjectPageSubmitBtn();
}

@Test
public void DragDropProject() throws IOException, InterruptedException
{
Thread.sleep(5000);
org.openqa.selenium.interactions.Action dragAndDrop = Act.clickAndHold(home.getEnq())
.moveToElement(home.getSiteVisit())
.release(home.getSiteVisit())
.build();
dragAndDrop.perform();
}
	
@AfterMethod
public void logoutFromApp() 
{
				
}
			
@AfterClass
public void closeBrowser()
{
//driver.close();
}
}
