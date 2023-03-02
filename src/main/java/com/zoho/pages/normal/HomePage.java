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
}
