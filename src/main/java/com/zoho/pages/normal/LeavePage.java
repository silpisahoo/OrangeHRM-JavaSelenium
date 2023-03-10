package com.zoho.pages.normal;

import com.zoho.base.pages.OrangeHRMBasePage;
import com.zoho.base.pages.OrangeHRMPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage extends OrangeHRMBasePage {
    public LeavePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[text()='Leave List']")
    WebElement leavelistTopMenu;

    @FindBy(xpath = "//a[text()='Apply']")
    WebElement ApplyTopMenu;

    @FindBy(xpath = "//a[text()='Assign Leave']")
    WebElement AssignleaveTopMenu;

    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    WebElement Selectdropdown;

    @FindBy(xpath = "(//button[@class='oxd-icon-button'])[2]")
    WebElement MoreOption;

    @FindBy(xpath = "//p[text()='Add Comment']")
    WebElement Adcomment;

    @FindBy(xpath = "//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
    WebElement commenthere;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    WebElement Savebtn;

    @FindBy(xpath = " //button[@type='reset']")
    WebElement Resetbtn;

    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    WebElement leaveTypeDropdown;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeNameAutoSuggest;



    @FindBy(xpath = "//i[@class='oxd-icon bi-calendar oxd-date-input-icon']")
    WebElement fromDate;

    @FindBy(xpath = "//*[contains(text(),'1')]")
    WebElement firstDayofMonth;

    @FindBy(xpath = "(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[2]")
    WebElement toDate;




    public OrangeHRMPage AddLeaveComment(String comment){

        leavelistTopMenu.click();
        getDriver().Scrolltoelement(Resetbtn);
        MoreOption.click();
        Adcomment.click();
        commenthere.sendKeys(comment);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Savebtn.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return this;
    }


    public OrangeHRMPage Applyleave( ){
       ApplyTopMenu.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return this;
    }
    public OrangeHRMPage Assignleave(String empName ){
        AssignleaveTopMenu.click();
        employeeNameAutoSuggest.sendKeys(empName);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ENTER);
        Selectdropdown.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        fromDate.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        firstDayofMonth.click();
        return this;
    }
}
