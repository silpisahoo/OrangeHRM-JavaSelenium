package com.zoho.pages.normal;

import com.zoho.base.pages.Constants;
import com.zoho.base.pages.OrangeHRMBasePage;
import com.zoho.base.pages.OrangeHRMPage;
import org.openqa.selenium.Keys;

public class HomePage extends OrangeHRMBasePage {

    public OrangeHRMPage gotoAdmin() {
        getDriver().click(Constants.ADMIN_LEFT_MENU);
        return this;
    }
    public OrangeHRMPage gotoPIM() {
        getDriver().click(Constants.PIM_LEFT_MENU);
        return new EmployeePage(getSession().getCon().getCurrentDriver());
    }
    public OrangeHRMPage searchEmployee(String empName) {
        getDriver().type(Constants.EMPNAME_SEARCH_FIELD_KEY, empName);
        getDriver().type(Constants.EMPNAME_SEARCH_FIELD_KEY, Keys.TAB+"");
        //getDriver().type(Constants.EMPNAME_SEARCH_FIELD_KEY, "Y");
        //getDriver().type(Constants.EMPNAME_SEARCH_FIELD_KEY, Keys.ARROW_DOWN+"");
        getDriver().click(Constants.EMPNAME_SEARCH_DROPDOWN_KEY);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
        return this;
    }
    public OrangeHRMPage gotoleave() {

        getDriver().click(Constants.LEAVE_LEFT_MENU);
        return new  LeavePage((getSession().getCon().getCurrentDriver()));
    }
    public OrangeHRMPage gotoTime() {

        getDriver().click(Constants.TIME_LEFT_MENU);
        return new TimePage((getSession().getCon().getCurrentDriver()));
    }
    public OrangeHRMPage gotoMyInfo() {

        getDriver().click(Constants.MYINFO_LEFT_MENU);
        return new MyInfoPage((getSession().getCon().getCurrentDriver()));
    }
    public OrangeHRMPage gotoRecruitment() {

        getDriver().click(Constants.RECRUITMENT_LEFT_MENU);
        return new RecruitmentPage((getSession().getCon().getCurrentDriver()));
    }

    public OrangeHRMPage gotoDirectory() {

        getDriver().click(Constants.DIRECTORY_LEFT_MENU);
        return new DirectoryPage((getSession().getCon().getCurrentDriver()));
    }

    public OrangeHRMPage gotoMaintenance() {

        getDriver().click(Constants.MAINTENANCE_LEFT_MENU);
        return new MaintenancePage((getSession().getCon().getCurrentDriver()));
    }

    public OrangeHRMPage gotoBuzz() {

        getDriver().click(Constants.BUZZ_LEFT_MENU);
        return new MaintenancePage((getSession().getCon().getCurrentDriver()));
    }
    }

