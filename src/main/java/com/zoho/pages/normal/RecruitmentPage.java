package com.zoho.pages.normal;

import com.zoho.base.pages.OrangeHRMBasePage;
import com.zoho.base.pages.OrangeHRMPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage extends OrangeHRMBasePage {
    public RecruitmentPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement Addbtn;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement candidatefirstname;

    @FindBy(xpath = "//input[@placeholder='Middle Name']")
    WebElement candidatemiddlename;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement candidatelastname;

    @FindBy(xpath = "//input[@placeholder='Type here']")
    WebElement candidategmailid;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement savebtn;

    @FindBy(xpath = "//a[text()='Vacancies']")
    WebElement vacanciesTopMenu;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")
    WebElement Resetbtn;

    public OrangeHRMPage addCandidatesdetails(String firstName , String middleName, String lastName ,String gmailId) {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAA");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Addbtn.click();

        candidatefirstname.sendKeys(firstName);
        candidatemiddlename.sendKeys(middleName);
        candidatelastname.sendKeys(lastName);
        candidategmailid.sendKeys(gmailId);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        savebtn.click();

        return this;
    }

    public OrangeHRMPage viewVacanciesdetails(){

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        vacanciesTopMenu.click();
        getDriver().Scrolltoelement(Resetbtn);

        return this;
    }
}
