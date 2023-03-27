package com.zoho.base.pages;

import java.util.Hashtable;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Reporter;

import com.zoho.pages.components.common.session.Header;
import com.zoho.pages.session.lead.LeadDetailsPage;
import com.zoho.pages.session.lead.LeadsPage;
import com.zoho.pages.session.task.TaskPage;
import com.zoho.session.OrangeHRMTestSession;
import com.zoho.web.WebConnector;

public class OrangeHRMBasePage implements OrangeHRMPage {

	
	public OrangeHRMBasePage() {// page class object is created
		System.out.println("----------ZohoBase Page Consructor-------");
		//PageFactory.initElements(getCurrentDriver(), this);
		// set the page in the session
		getSession().setCurrentPage(this);
		//getSession().takeScreenShot();
	}
	
	
	public OrangeHRMPage openBrowser(String browser) {
		System.out.println("ZohoBasePage openBrowser");
		return null;
	}

	public void quit() {
		// TODO Auto-generated method stub
		
	}

	public void getTotalWindows() {
		// TODO Auto-generated method stub
		
	}

	public OrangeHRMPage gotoLoginPage() {
		return null;
	}

	public void goToRegisterPage() {
		// TODO Auto-generated method stub
		
	}

	public OrangeHRMPage submitUsernameAndPassword(String userid, String password) {
		return null;
		
	}

	public WebConnector validator(boolean stopExecution) {
		   // update the flag in web layer
		    getSession().getCon().setStopExecution(stopExecution);
			return getSession().getCon();
	}

	public void createDeal() {
		// TODO Auto-generated method stub
		
	}

	public void logout() {
		// TODO Auto-generated method stub
		
	}
	
	public OrangeHRMPage gotoEnterUsernamePage() {
		return null;
	}
	
	public OrangeHRMTestSession getSession() {
		return (OrangeHRMTestSession)Reporter.getCurrentTestResult().getTestContext().getAttribute("session");
	}
	
	public WebConnector getDriver() {
		return getSession().getCon();
	}
	
	public EventFiringWebDriver getCurrentDriver() {
		return getSession().getCon().getCurrentDriver();
	}
	
	public void log(String message) {
		getSession().log(message);
	}

	@Override
	public OrangeHRMPage gotoAdmin() {
		return null;
	}

	@Override
	public OrangeHRMPage SearchEmployee(String empName) {
		return null;
	}

	@Override
	public OrangeHRMPage createUser(String empName, String userName, String passWord, String confirmPassword) {
		return null;
	}

	@Override
	public OrangeHRMPage searchaddedEmployeeDetails(String addedempName) {
		return null;
	}

	@Override
	public OrangeHRMPage jobTitleMenu( String jobTitle , String descriptionBox) {
		return null;
	}

	@Override
	public OrangeHRMPage organizationMenu() {
		return null;
	}

	@Override
	public OrangeHRMPage qualificationmenu(String name,String description,String level,String licenses) {
		return null;
	}

	@Override
	public OrangeHRMPage nationalitiesMenu(String nationName) {
		return null;
	}

	@Override
	public OrangeHRMPage corporateBrandingMenu() {
		return null;
	}

	@Override
	public OrangeHRMPage configurationMenu(String testEmail) {
		return null;
	}

	@Override
	public OrangeHRMPage gotoSearchtab() {
		return null;
	}

	@Override
	public OrangeHRMPage searchField(String passsword) {
		return null;
	}

	@Override
	public OrangeHRMPage checkIfUserExists(String username) {
		return null;
	}

	@Override
	public OrangeHRMPage gotoPIM() {
		return null;
	}
	@Override
	public OrangeHRMPage searchEmployee(String empName) {
		return null;
	}

	@Override
	public OrangeHRMPage createEmployee(String firstName, String lastName, String employeeID) {
		return null;
	}

	@Override
	public OrangeHRMPage saveEmployeePersonalDetails() {
		return null;
	}


	@Override
	public OrangeHRMPage createEmployeeContanctDetails(String street1, String city, String state, String zip, String mobileno) {
		return null;
	}

	@Override
	public OrangeHRMPage gotoleave() {
		return null;
	}

	@Override
	public OrangeHRMPage AddLeaveComment(String comment) {
		return null;
	}

	@Override
	public OrangeHRMPage Applyleave() {
		return null;
	}

	@Override
	public OrangeHRMPage Assignleave(String empName) {
		return null;
	}


	@Override
	public OrangeHRMPage selectMyTimesheet() {
		return null;
	}

	@Override
	public OrangeHRMPage selectEmployeeTimesheet(String empName) {
		return null;
	}


	@Override
	public OrangeHRMPage gotoTime() {
		return null;
	}

	@Override
	public OrangeHRMPage EnterTimeForTimesheet(String projectName) {
		return null;
	}

	@Override
	public OrangeHRMPage addCandidatesdetails(String firstName, String middleName, String lastName, String gmailId) {
		return null;
	}

	@Override
	public OrangeHRMPage viewVacanciesdetails(String vName , String description ,String empName) {
		return null;
	}

	@Override
	public OrangeHRMPage gotoRecruitment() {
		return null;
	}


	@Override
	public OrangeHRMPage gotoMyInfo() {
		return null;
	}

	@Override
	public OrangeHRMPage personalDetails() {
		return null;
	}

	@Override
	public OrangeHRMPage contactDetails(String mobileNum) {
		return null;
	}

	@Override
	public OrangeHRMPage emergencyContact(String empnamr , String relationshipName ,String mobileNo) {
		return null;
	}

	@Override
	public OrangeHRMPage dependent(String dependentname) {
		return null;
	}

	@Override
	public OrangeHRMPage reportpage(String reportName) {
		return null;
	}

	@Override
	public OrangeHRMPage immigration() {
		return null;
	}

	@Override
	public OrangeHRMPage job() {
		return null;
	}

	@Override
	public OrangeHRMPage salaryPage() {
		return null;
	}

	@Override
	public OrangeHRMPage taxPage() {
		return null;
	}

	@Override
	public OrangeHRMPage reportPage() {
		return null;
	}

	@Override
	public OrangeHRMPage qualificationPage() {
		return null;
	}

	@Override
	public OrangeHRMPage membershipPage() {
		return null;
	}

	@Override
	public OrangeHRMPage gotoPerformance() {
		return null;
	}

	@Override
	public OrangeHRMPage manageReviewstest(String empName) {
		return null;
	}

	@Override
	public OrangeHRMPage myReviewstest() {
		return null;
	}

	@Override
	public OrangeHRMPage myTrackerstest(String log, String comment) {
		return null;
	}

	@Override
	public OrangeHRMPage cinfigureTest( String empName){
		return null;
	}

	@Override
	public OrangeHRMPage configurationPage() {
		return null;
	}

	@Override
	public OrangeHRMPage employeeTrackerstest(String empName) {
		return null;
	}

	@Override
	public OrangeHRMPage gotoDirectory() {
		return null;
	}

	@Override
	public OrangeHRMPage directory(String empName) {
		return null;
	}

	@Override
	public OrangeHRMPage gotoMaintenance() {
		return null;
	}

	@Override
	public OrangeHRMPage loginTest(String passsword , String vacancyName) {
		return null;
	}

	@Override
	public OrangeHRMPage AccessRecords(String empName) {
		return null;
	}

	@Override
	public OrangeHRMPage Reports(String projectName , String empName){

		return null;
	}

	@Override
	public OrangeHRMPage myleaveTab() {
		return null;
	}

	@Override
	public OrangeHRMPage entitelmentsTopMenu(String empName, String text) {
		return null;
	}

	@Override
	public OrangeHRMPage reportsTopMenu(String empName) {
		return null;
	}

	@Override
	public OrangeHRMPage configureTopMenu() {
		return null;
	}

	@Override
	public OrangeHRMPage gotoBuzz() {
		return null;
	}

	@Override
	public OrangeHRMPage BuzzNewsfeedtest( String statusUpdate ,String commentBox){
		return null;
	}

	@Override
	public OrangeHRMPage mostrecentposttest() {
		return null;
	}

	@Override
	public OrangeHRMPage mostLikedposttest() {
		return null;
	}

	@Override
	public OrangeHRMPage mostComentedtest() {
		return null;
	}

	@Override
	public OrangeHRMPage Projectinfo(String empName, String description) {
		return null;
	}

	@Override
	public OrangeHRMPage Projectinfoforproject(String Name, String customerName, String description, String projectAdmin) {
		return null;
	}


	public OrangeHRMPage validateIntermediatePageOptions() {
		return null;
	}
	public OrangeHRMPage goToDefaultLandingPage() {
		return null;
	}
	
	public Header getHeader() {
		return null;
	}
	
    public LeadDetailsPage submitLeadDetails(String leadCompany, String leadLastName) {
		return null;
	}
    
    public LeadsPage gotoLeadsPage() {
    	return null;
    }
    public TaskPage createTask(Hashtable<String,String> data) {
    	return null;
    }
    
    public void selectDateFromCalendar(String date) {
    }
	
		
	public void waitForPageToLoad(){

	}
	
	public void wait(int time) {
		try {
			Thread.sleep(time*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
