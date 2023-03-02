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
    OrangeHRMPage gotoPIM();
    OrangeHRMPage searchEmployee(String empName);
    OrangeHRMPage createEmployee(String firstName, String lastName, String employeeID);




}