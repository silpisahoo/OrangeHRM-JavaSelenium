package com.zoho.base.pages;

import java.util.Hashtable;

import com.zoho.pages.components.common.session.Header;
import com.zoho.pages.session.lead.LeadDetailsPage;
import com.zoho.pages.session.lead.LeadsPage;
import com.zoho.pages.session.task.TaskPage;
import com.zoho.session.OrangeHRMTestSession;
import com.zoho.web.WebConnector;

public interface OrangeHRMPage {

    void createDeal();
    void logout();
    OrangeHRMPage validateIntermediatePageOptions();
    OrangeHRMPage goToDefaultLandingPage();
    Header getHeader();
    LeadDetailsPage submitLeadDetails(String leadCompany, String leadLastName);
    LeadsPage gotoLeadsPage();
    TaskPage createTask(Hashtable<String,String> data);
    void selectDateFromCalendar(String date);




	// normal browser operations
	OrangeHRMPage openBrowser(String browser);
    void quit();
    void getTotalWindows();
    OrangeHRMTestSession getSession();
    

    // ZOHO based normal
    OrangeHRMPage gotoLoginPage();
    void goToRegisterPage();
    OrangeHRMPage submitUsernameAndPassword(String userid, String password);
    WebConnector validator(boolean flagAssertionType);
    OrangeHRMPage gotoEnterUsernamePage();
    
    // Zoho - session
    void log(String message);
    OrangeHRMPage gotoAdmin();
    OrangeHRMPage SearchEmployee(String empName);
    OrangeHRMPage createUser(String empName , String userName , String passWord , String confirmPassword);
    OrangeHRMPage searchaddedEmployeeDetails(String addedempName);
    OrangeHRMPage jobTitleMenu( String jobTitle , String descriptionBox);
    OrangeHRMPage organizationMenu();
    OrangeHRMPage qualificationmenu(String name,String description,String level,String licenses);
    OrangeHRMPage nationalitiesMenu(String nationName);
    OrangeHRMPage corporateBrandingMenu();
    OrangeHRMPage configurationMenu(String testEmail);
    OrangeHRMPage checkIfUserExists(String username);
    OrangeHRMPage gotoPIM();
    OrangeHRMPage searchEmployee(String empName);
    OrangeHRMPage createEmployee(String firstName, String lastName, String employeeID);
    OrangeHRMPage saveEmployeePersonalDetails();
    OrangeHRMPage createEmployeeContanctDetails(String street1, String city, String state,String zip,String mobileno);
    OrangeHRMPage gotoleave();
    OrangeHRMPage AddLeaveComment(String comment);
    OrangeHRMPage Applyleave();
    OrangeHRMPage Assignleave(String empName );
    OrangeHRMPage selectMyTimesheet();

    OrangeHRMPage selectEmployeeTimesheet( String empName);
    OrangeHRMPage gotoTime();
    OrangeHRMPage EnterTimeForTimesheet(String projectName);

    OrangeHRMPage gotoRecruitment();

    OrangeHRMPage addCandidatesdetails(String firstName , String middleName, String lastName ,String gmailId);

    OrangeHRMPage viewVacanciesdetails(String vName , String description ,String empName);

    OrangeHRMPage gotoMyInfo();
    OrangeHRMPage personalDetails();
    OrangeHRMPage contactDetails(String mobileNum);
    OrangeHRMPage emergencyContact(String empnamr , String relationshipName ,String mobileNo);
    OrangeHRMPage dependent(String empnamr );
    OrangeHRMPage immigration( );
    OrangeHRMPage job();
    OrangeHRMPage salaryPage();
    OrangeHRMPage taxPage();
    OrangeHRMPage reportPage();
    OrangeHRMPage qualificationPage();
    OrangeHRMPage membershipPage();
    OrangeHRMPage gotoPerformance();
    OrangeHRMPage manageReviewstest(String empName);
    OrangeHRMPage myReviewstest();
    OrangeHRMPage myTrackerstest( String log , String comment);
    OrangeHRMPage cinfigureTest( String empName);

    OrangeHRMPage employeeTrackerstest( String empName);

    OrangeHRMPage gotoDirectory();

    OrangeHRMPage directory(String empName);

    OrangeHRMPage gotoMaintenance();
    OrangeHRMPage loginTest(String passsword , String vacancyName);

    OrangeHRMPage AccessRecords(String empName);

    OrangeHRMPage gotoBuzz();
    OrangeHRMPage BuzzNewsfeedtest( String statusUpdate ,String commentBox);
    OrangeHRMPage mostrecentposttest();
    OrangeHRMPage mostLikedposttest();
    OrangeHRMPage mostComentedtest();
    OrangeHRMPage Projectinfo(String empName , String description);
    OrangeHRMPage Projectinfoforproject(String Name, String customerName, String description, String projectAdmin);





}
