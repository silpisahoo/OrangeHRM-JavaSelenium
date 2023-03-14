package com.zoho.pages.normal;

import com.zoho.base.pages.OrangeHRMBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MyInfoPage extends OrangeHRMBasePage {
    public MyInfoPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
