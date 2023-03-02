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

        @FindBy(name = "lastName")
        WebElement txtLastName;

        @FindBy(className = "oxd-switch-input")
        public WebElement toggleButton;

        @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
        public WebElement txtUserCreds;

        @FindBy(css = "[type = submit]")
        WebElement btnSubmit;

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

            //txtUserCreds.sendKeys(Keys.CONTROL, "A");
            //txtUserCreds.clear();

            //txtUserCreds.sendKeys(employeeID);
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            btnSubmit.click();
            return null;
        }

}
