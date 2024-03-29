package com.zoho.pages.normal;

import com.zoho.base.pages.OrangeHRMBasePage;
import com.zoho.base.pages.OrangeHRMPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PerformancePage extends OrangeHRMBasePage {
    public PerformancePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeNameAutoSuggest;
    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    WebElement Selectdropdown;

    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]")
    WebElement Selectdropdown2;

    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[3]")
    WebElement Selectdropdown3;

    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[4]")
    WebElement Selectdropdown4;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement searchButton;

    @FindBy(xpath = "//li[@class='oxd-topbar-body-nav-tab --parent --visited']")
    WebElement MangreviewsTopMenu;
    @FindBy(xpath = "//a[text()='My Reviews']")
    WebElement MyreviewsTopMenu;

    @FindBy(xpath = "//a[text()='My Trackers']")
    WebElement MytrackerTopMenu;

    @FindBy(xpath = "//a[text()='Employee Trackers']")
    WebElement EmpTopMenu;
    @FindBy(xpath = "//button[@class='oxd-icon-button oxd-table-cell-action-space']")
    WebElement viewbtn;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    WebElement searchbtn;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement addlogbtn;

    @FindBy(xpath = "//input[@placeholder='Type here']")
    WebElement logcommenthere;

    @FindBy(xpath = "//textarea[@placeholder='Type here']")
    WebElement textcommenthere;
    @FindBy(xpath = "//i[@class='oxd-icon bi-chevron-down']")
    WebElement configTopMenu;
    @FindBy(xpath = "//a[text()='KPIs']")
    WebElement KpisMenu;
    @FindBy(xpath = "//a[text()='Trackers']")
    WebElement TrackerMenu;


    public OrangeHRMPage manageReviewstest(String empName) {
        System.out.println("gg");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
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
        Selectdropdown2.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Selectdropdown2.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown2.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown2.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown2.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown2.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Selectdropdown3.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Selectdropdown3.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown3.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown3.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown3.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown3.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Selectdropdown4.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Selectdropdown4.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown4.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown4.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown4.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown4.sendKeys(Keys.ENTER);
        searchButton.click();
        MangreviewsTopMenu.click();
        return this;
    }

    public OrangeHRMPage myReviewstest() {
        MyreviewsTopMenu.click();
        viewbtn.click();
        return this;
    }

    public OrangeHRMPage myTrackerstest(String log, String comment) {
        MytrackerTopMenu.click();
        viewbtn.click();
        addlogbtn.click();
        logcommenthere.sendKeys(log);
        textcommenthere.sendKeys(comment);

        return this;
    }

    public OrangeHRMPage cinfigureTest(String empName) {
        configTopMenu.click();
        KpisMenu.click();
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
        searchbtn.click();
        configTopMenu.click();
        TrackerMenu.click();
        employeeNameAutoSuggest.sendKeys(empName);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        searchbtn.click();

        return this;
    }

    public OrangeHRMPage employeeTrackerstest(String empName) {
        EmpTopMenu.click();
        employeeNameAutoSuggest.sendKeys(empName);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        searchbtn.click();
        return this;
    }
}