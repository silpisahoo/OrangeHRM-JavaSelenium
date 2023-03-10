package com.zoho.pages.normal;

import com.zoho.base.pages.OrangeHRMBasePage;
import com.zoho.base.pages.OrangeHRMPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EmployeePage extends OrangeHRMBasePage {


        @FindBy(className = "oxd-button")
        public List<WebElement> btnAddEmployee;

        @FindBy(name = "firstName")
        WebElement txtFirstName;

        @FindBy(xpath = "//a[text()='Add Employee']")
        WebElement addEmployeeTopMenu;

        @FindBy(xpath = "//div[@class='orangehrm-tabs-wrapper'][2]")
        WebElement ContactDetails;

        @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
        WebElement txtStreet1;

        @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
        public WebElement txtCity;

        @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[4]")
        public WebElement txtState;

        @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[5]")
        public WebElement txtZip;

        @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[7]")
        public WebElement txtMobileno;
        @FindBy(xpath = "//button[@type='submit']")
        public List <WebElement>  btnsSave;


        @FindBy(name = "lastName")
        WebElement txtLastName;


        @FindBy(className = "oxd-switch-input")
        public WebElement toggleButton;

        @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
        public WebElement txtUserCreds;


        @FindBy(css = "[type = submit]")
        WebElement btnSubmit;

        @FindBy(xpath = "(//button[@type='submit'])[2]")
        WebElement btnSave1;

        @FindBy(className = "oxd-main-menu-item--name")
        public List<WebElement> myInfo;

        @FindBy(className = "oxd-select-text-input")
        public List <WebElement>  dropdownBox;

        @FindBy(className = "oxd-radio-input")
        public List <WebElement> radioButton;

        @FindBy(className = "oxd-input-field-error-message")
        public WebElement lblValidationError;

        public EmployeePage(WebDriver driver){
            PageFactory.initElements(driver, this);
        }

        public String checkIfUserExists(String username){
            txtUserCreds.sendKeys(username);
            return lblValidationError.getText();
        }

        public OrangeHRMPage createEmployee(String firstName, String lastName, String employeeID){

            addEmployeeTopMenu.click();
            txtFirstName.sendKeys(firstName);
            txtLastName.sendKeys(lastName);


            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            btnSubmit.click();
            return this;
        }
    public OrangeHRMPage saveEmployeePersonalDetails()  {

        getDriver().Scrolltobuttom();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        btnsSave.get(0).click();
        return this;
    }

    public OrangeHRMPage createEmployeeContanctDetails(String street1, String city, String state,String zip,String mobileno){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        getDriver().ScrolltoTop();
        ContactDetails.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        txtStreet1.sendKeys(street1);

        txtCity.sendKeys(city);

        txtState.sendKeys(state);
        System.out.println("AAAA");
        txtZip.sendKeys(zip);
        System.out.println("AAAA");
        txtMobileno.sendKeys(mobileno);
        System.out.println("AAAA");


        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        btnSubmit.click();
        return this;
    }
}
