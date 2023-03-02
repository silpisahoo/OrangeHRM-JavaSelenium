package com.zoho.pages.normal;

import com.zoho.base.pages.Constants;
import com.zoho.base.pages.OrangeHRMBasePage;
import com.zoho.base.pages.OrangeHRMPage;

public class LaunchPage extends OrangeHRMBasePage {
	
	

    public OrangeHRMPage openBrowser(String browser) {
    	getDriver().openBrowser("browser");
    	return this;
    }
    
	public OrangeHRMPage gotoLoginPage() {
		log("Navigaing to https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		getDriver().navigate(Constants.URK_KEY);
		return new LoginPage();
	}



}
