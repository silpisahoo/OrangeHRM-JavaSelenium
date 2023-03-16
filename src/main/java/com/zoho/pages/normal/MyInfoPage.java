package com.zoho.pages.normal;

import com.zoho.base.pages.OrangeHRMBasePage;
import com.zoho.base.pages.OrangeHRMPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyInfoPage extends OrangeHRMBasePage {
    public MyInfoPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    WebElement savebtn;
    @FindBy(xpath = "//a[text()='Contact Details']")
    WebElement contacttab;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[8]")
    WebElement mobilebox;
    @FindBy(xpath = "//a[text()='Emergency Contacts']")
    WebElement emrgcont;
    @FindBy(xpath = "//a[text()='Dependents']")
    WebElement dependentMenu;

    @FindBy(xpath = "//a[text()='Immigration']")
    WebElement immigrationMenu;
    @FindBy(xpath = "//a[text()='Job']")
    WebElement jobMenu;
    @FindBy(xpath = "//a[text()='Salary']")
    WebElement salaryMenu;
    @FindBy(xpath = "//a[text()='Tax Exemptions']")
    WebElement taxMenu;
    @FindBy(xpath = "//a[text()='Report-to']")
    WebElement reporttoMenu;
    @FindBy(xpath = "//a[text()='Qualifications']")
    WebElement qualificationMenu;
    @FindBy(xpath = "//a[text()='Memberships']")
    WebElement membershipMenu;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--text']")
    WebElement addbtn;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement name;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement relationship;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[4]")
    WebElement mobileno;
    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    WebElement Selectdropdown;

    public OrangeHRMPage personalDetails(){
        getDriver().Scrolltobuttom();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        savebtn.click();
        getDriver().ScrolltoTop();
        return this;

    }
    public OrangeHRMPage contactDetails(String mobileNum) {
        contacttab.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        mobilebox.sendKeys(mobileNum);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        getDriver().Scrolltobuttom();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        savebtn.click();
        getDriver().ScrolltoTop();
        return this;
    }
    public OrangeHRMPage emergencyContact(String empnamr , String relationshipName ,String mobileNo){

        emrgcont.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        addbtn.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        name.sendKeys(empnamr);
        relationship.sendKeys(relationshipName);
        mobileno.sendKeys(mobileNo);
        savebtn.click();

        return this;
    }
    public OrangeHRMPage dependent(String empnamr ){

        dependentMenu.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        addbtn.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        name.sendKeys(empnamr);
        Selectdropdown.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ENTER);
        savebtn.click();

        return this;
    }
    public OrangeHRMPage immigration( ){
        immigrationMenu.click();
        return this;
    }
    public OrangeHRMPage job(){
        jobMenu.click();
        return this;
    }
    public OrangeHRMPage salaryPage(){
        salaryMenu.click();
        return this;
    }
    public OrangeHRMPage taxPage(){
        taxMenu.click();
        return this;
    }
    public OrangeHRMPage reportPage(){
        reporttoMenu.click();
        return this;
    }
    public OrangeHRMPage qualificationPage(){
        qualificationMenu.click();
        return this;
    }
    public OrangeHRMPage membershipPage(){
        membershipMenu.click();
        return this;
    }
}
