package com.zoho.testcases;

import com.zoho.base.pages.Constants;
import com.zoho.pages.normal.LaunchPage;
import com.zoho.session.OrangeHRMTestSession;
import com.zoho.util.DataUtil;
import com.zoho.util.Xls_Reader;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Hashtable;
import java.util.Random;

public class MaintenanceTest {
    OrangeHRMTestSession session;
    String testName = "MaintenanceTest";
    Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "//Data.xlsx");

    @BeforeMethod
    public void init() {
        session = new OrangeHRMTestSession();
        session.init("MaintenanceTest");

    }

    @AfterMethod
    public void quit() {
        session.generateReport();
    }

    @Test(dataProvider = "getData")
    public void loginTest(Hashtable<String, String> data) {
        session.log(data.toString());

        if (!DataUtil.isRunnable(testName, xls) || data.get("Runmode").equals("N")) {
            // skip in extent rep
            session.skipTest("Skipping the test as Runmode was NO");
            //skip - testng
            throw new SkipException("Skipping the test as Runmode was NO");
        }

        String username = data.get("Username");
        String password = data.get("Password");
        System.out.println("--AA-"+data.get("EmployeeName"));

        new LaunchPage()
                .openBrowser("chrome")
                .gotoLoginPage()
                .submitUsernameAndPassword(username, password)
                .validator(false).validateTitle(Constants.HOME_PAGE_TITLE_KEY)
                .gotoMaintenance()
                .loginTest(data.get("Password") , data.get("Vacancy"))
                .AccessRecords(data.get("EmployeeName"));

    }

    @DataProvider
    public Object[][] getData() {
        return DataUtil.getData(testName, xls);
    }
}
