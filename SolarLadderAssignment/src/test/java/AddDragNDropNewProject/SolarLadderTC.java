package AddDragNDropNewProject;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import net.bytebuddy.utility.RandomString;

public class SolarLadderTC extends BaseClass
{
    SolarLadderLoginPage login;
    SolarLadderHomePage home;
    SolarLadderAddProjectPage project;
    String TCID;

@BeforeClass
public void openBrowser() throws EncryptedDocumentException, IOException
{
    initializeBrowser();
    login = new SolarLadderLoginPage(driver);
    home = new SolarLadderHomePage(driver);
    project = new SolarLadderAddProjectPage(driver);

}
			
@BeforeMethod
public void loginToApp() throws InterruptedException, IOException 
{
	//Login page method call
    login.inpSolarLadderLoginPageEmail(UtilityClass.getPFData("UN"));
    login.inpSolarLadderLoginPagePassword(UtilityClass.getPFData("PWD"));
    login.clickSolarLadderLoginPageLoginBtn();
	
    //Home page method call
    home.clickSolarLadderHomePageAddProjectButton();
    Thread.sleep(20000);
    home.clickSolarLadderHomePagecloseMoreInfoPop();
    home.clickSolarLadderHomePageAddProjectButton();
	
    //AddProject page method call
    project.inpSolarLadderAddProjectPageSize(UtilityClass.getTD(0, 0));
    project.inpSolarLadderAddProjectPageName(UtilityClass.getTD(0, 1));
    project.inpSolarLadderAddProjectPageMobNo(UtilityClass.getTD(0, 2));
    project.inpSolarLadderAddProjectPageLocation(UtilityClass.getTD(0, 3));
    project.inpSolarLadderAddProjectPageCity(UtilityClass.getTD(0, 4));
    project.clickSolarLadderAddProjectPageSubmitBtn();
}

@Test
public void DragDropProject() throws IOException, InterruptedException
{
	TCID = RandomString.make(2); //ab  cd a1 a5 s4
    Thread.sleep(5000);
    home.dragNDropSolarLadderHomePage();  //code to drag and drop card
    
   
}
	
@AfterMethod
public void logoutFromApp(ITestResult s1) throws IOException, InterruptedException 
{
	
	if(s1.getStatus()==ITestResult.SUCCESS)
	{
		Thread.sleep(5000);
	    UtilityClass.drawBorder(driver, home.getCard());  //code to Draw border on card
		UtilityClass.captureSS(driver, TCID); //code to capture SS
	}		
}
			
@AfterClass
public void closeBrowser()
{
   //driver.close();
}
}
