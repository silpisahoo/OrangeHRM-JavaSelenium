package com.zoho.pages.normal;

import com.zoho.base.pages.OrangeHRMBasePage;
import com.zoho.base.pages.OrangeHRMPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuzzPage extends OrangeHRMBasePage{

        public BuzzPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }

    @FindBy(xpath = "//p[text()='Buzz Newsfeed']")
    WebElement buzzNewsFeedHeader;
    @FindBy(xpath = "//h6[text()='Buzz']")
    WebElement buzzHeader;


    @FindBy(xpath = "//textarea[@class='oxd-buzz-post-input']")
    WebElement comment;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement postbtn;

    @FindBy(xpath = "//*[name()='svg' and @id='heart-svg']")
    WebElement likebtn;
    @FindBy(xpath = "//i[@class='oxd-icon bi-chat-text-fill']")
    WebElement commentbtn;
    @FindBy(xpath = "//input[@placeholder='Write your comment...']")
    WebElement commenttxt;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-warn orangehrm-post-filters-button']")
    WebElement mostrecentdpost;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--text orangehrm-post-filters-button']")
    WebElement mostlikedpost;
    @FindBy(xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--text orangehrm-post-filters-button'])[2]")
    WebElement mostCommentedpost;

    public OrangeHRMPage BuzzNewsfeedtest( String statusUpdate ,String commentBox) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        comment.sendKeys(statusUpdate);
        postbtn.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        likebtn.click();
        commentbtn.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        commenttxt.sendKeys(commentBox);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        commenttxt.sendKeys(Keys.ENTER);

            return this;

    }
    public OrangeHRMPage mostrecentposttest(){
        mostrecentdpost.click();
        return this;

    }
    public OrangeHRMPage mostLikedposttest(){
        mostlikedpost.click();
        return this;

    }

    public OrangeHRMPage mostComentedtest(){
        mostCommentedpost.click();
        return this;

    }
}
