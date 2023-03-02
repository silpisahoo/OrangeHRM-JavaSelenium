package com.zoho.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.zoho.session.OrangeHRMTestSession;
import com.zoho.util.DataUtil;
import com.zoho.util.Xls_Reader;

public class CreateTaskTest {

	OrangeHRMTestSession session;
	String testName="CreateTaskTest";
	Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"//Data.xlsx");
	
	@BeforeMethod
	public void init() {
		session= new OrangeHRMTestSession();
		session.init(testName);
	}
	
	@AfterMethod
	public void quit() {
		session.generateReport();
	}

	/*@Test(dataProvider = "getData")
	public void createTaskTest(Hashtable<String,String> data) {
		session.log(data.toString());
		
		if(!DataUtil.isRunnable(testName, xls) || data.get("Runmode").equals("N")) {
				// skip in extent rep
				session.skipTest("Skipping the test as Runmode was NO");
				//skip - testng
				throw new SkipException("Skipping the test as Runmode was NO");
	    }
			
			             new LaunchPage()
					    .openBrowser("chrome")
					    .gotoLoginPage()
					    .validator(false).validateTitle(Constants.HOME_PAGE_TITLE)// returns home page object , dont have to stop 		   
					    .gotoEnterUsernamePage()
					    .submitUsername(Constants.DEFAULT_USERNAME)
			 			.submitPassword(Constants.DEFAULT_PASWD)
			 			.validateIntermediatePageOptions()
			 			.goToDefaultLandingPage()
			 			.getHeader().create("task")
			 			.createTask(data);
			             
			             session.end();
			 			
			
	}*/
	@DataProvider
	public Object[][] getData(){
		return DataUtil.getData(testName, xls);
		
	}
}
