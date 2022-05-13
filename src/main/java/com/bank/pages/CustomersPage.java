package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CustomersPage extends Utility {
    public CustomersPage() {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logOutField;
    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement yourNameMessageField;
    @FindBy(xpath = "//button[@ng-click=\"deposit()\"]")
    WebElement depositField;
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement DepositSuccessfulMessageField;
    @FindBy(xpath = "//button[@type=\"submit\"]")
    WebElement depositMoneyLinkField;

    @FindBy(xpath = "//button[@ng-click=\"withdrawl()\"]")
    WebElement withdrawlField;

    @FindBy(xpath = "//button[@class=\"btn btn-default\"]")
    WebElement withdrawMoneyField;
    @FindBy(xpath = "//input[@placeholder=\"amount\"]")
    WebElement enterAmountField;

    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement TransactionsuccessfulMessageField;



    public void clickOnLogoutTab() {
//        Reporter.log("click On Logout Tab "+logOutField.toString()+"<br>");
//        CustomListeners.node.log(Status.PASS,"click On Logout Tab "+logOutField.toString()+"<br>" );
        clickOnElement(logOutField);

    }

    public boolean customerLogoutTabIsDisplayed() {
//        Reporter.log("customer Logout Tab IsDisplayed"+"<br>");
//        CustomListeners.node.log(Status.PASS,"customer Logout Tab IsDisplayed"+"<br>" );
        return logOutField.isDisplayed();
    }
    public void yourNameMessageVerify(String text) {
//        Reporter.log("your Name Message Verify"+"<br>");
//        CustomListeners.node.log(Status.PASS,"your Name Message Verify"+"<br>" );
        verifyAssertText(yourNameMessageField, text);
    }

    public void clickOnDepositMoneyLinkTab() {
//        Reporter.log("click On Deposit Money Link Tab "+depositMoneyLinkField.toString()+"<br>");
//        CustomListeners.node.log(Status.PASS,"click On Deposit Money Link Tab "+depositMoneyLinkField.toString()+"<br>" );
        clickOnElement(depositMoneyLinkField);
    }
    public void enterAmountTab(String amount) {
//        Reporter.log("enter Amount Tab "+amount+enterAmountField.toString()+"<br>");
//        CustomListeners.node.log(Status.PASS,"enter Amount Tab "+amount+enterAmountField.toString()+"<br>" );
        sendTextToElement(enterAmountField,amount);

    }

    public void clickOnDepositTab() {
//        Reporter.log("click On LogIn Tab "+depositField.toString()+"<br>");
//        CustomListeners.node.log(Status.PASS,"click On LogIn Tab "+depositField.toString()+"<br>" );
        clickOnElement(depositField);
    }

    public void DepositSuccessfullyMessageVerify(String text) {
//        Reporter.log("Deposit Successfully Message Verify"+"<br>");
//        CustomListeners.node.log(Status.PASS,"Deposit Successfully Message Verify"+"<br>" );
        verifyAssertText(DepositSuccessfulMessageField, text);
    }
    public void clickOnWithdrawlTab() {
//        Reporter.log("click On LogIn Tab "+withdrawlField.toString()+"<br>");
//        CustomListeners.node.log(Status.PASS,"click On LogIn Tab "+withdrawlField.toString()+"<br>" );
        clickOnElement(withdrawlField);
    }
    public void clickOnWithdrawMoneyTab() {
//        Reporter.log("click On Withdraw Money Tab "+withdrawMoneyField.toString()+"<br>");
//        CustomListeners.node.log(Status.PASS,"click On Withdraw Money Tab  "+withdrawMoneyField.toString()+"<br>" );
        clickOnElement(withdrawMoneyField);
    }

    public void YourNameVerify(String text) {
//        Reporter.log("Your Name Verify Message"+"<br>");
//        CustomListeners.node.log(Status.PASS,"Your Name Verify Message"+"<br>" );
        verifyAssertText(depositField, text);
    }

    public void  transactionSuccessfullyMessageVerify(String text){
//        Reporter.log("transaction Successfully Message"+"<br>");
//        CustomListeners.node.log(Status.PASS,"transaction Successfully Message"+"<br>" );
        verifyAssertText(TransactionsuccessfulMessageField, text);

    }
}