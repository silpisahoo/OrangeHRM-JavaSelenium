package com.zoho.pages.normal;

import com.zoho.base.pages.OrangeHRMBasePage;
import com.zoho.base.pages.OrangeHRMPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class DirectoryPage extends OrangeHRMBasePage {
        public DirectoryPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }

        @FindBy(xpath = "//input[@placeholder='Type for hints...']")
        WebElement employeeNameAutoSuggest;
        @FindBy(xpath = "//div[@class='oxd-select-text-input']")
        WebElement Selectdropdown;

        @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]")
        WebElement Selectdropdown2;

        @FindBy(xpath = "//button[@type='submit']")
        WebElement searchButton;

        @FindBy(xpath = "//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--white orangehrm-directory-card']")
        WebElement empfield;

        public OrangeHRMPage directory(String empName) {
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
            searchButton.click();
            getDriver().Scrolltobuttom();
            empfield.click();
            return this;
        }
    }
