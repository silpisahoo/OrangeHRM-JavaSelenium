package com.zoho.pages.normal;

import com.zoho.base.pages.Constants;
import com.zoho.base.pages.OrangeHRMBasePage;
import com.zoho.base.pages.OrangeHRMPage;

public class HomePage extends OrangeHRMBasePage {

    public OrangeHRMPage gotoAdmin() {
        getDriver().click(Constants.ADMIN_LEFT_MENU);
        return new AdminPage(getSession().getCon().getCurrentDriver());
    }
    public OrangeHRMPage gotoPIM() {
        getDriver().click(Constants.PIM_LEFT_MENU);
        return new PIMPage(getSession().getCon().getCurrentDriver());
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

    public OrangeHRMPage gotoPerformance() {

        getDriver().click(Constants.PERFORMANCE_LEFT_MENU);
        return new PerformancePage((getSession().getCon().getCurrentDriver()));
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
        return new BuzzPage((getSession().getCon().getCurrentDriver()));
    }
    public OrangeHRMPage gotoSearchtab() {

        getDriver().click(Constants.SEARCH_TAB_MENU);
        return new SearchPage((getSession().getCon().getCurrentDriver()));
    }
    }

