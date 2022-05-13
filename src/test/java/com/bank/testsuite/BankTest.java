package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BankTest extends TestBase {


    HomePage homePage;
    AddCustomerPage addCustomerPage;
    BankManagerLoginPage bankManagerLoginPage;
    OpenAccountPage openAccountPage;
    CustomerLoginPage customerLoginPage;
    CustomersPage customersPage;
    AccountPageStoreTDW accountPageStoreTDW;


    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        addCustomerPage = new AddCustomerPage();
        bankManagerLoginPage = new BankManagerLoginPage();
        openAccountPage = new OpenAccountPage();
        customerLoginPage = new CustomerLoginPage();
        customersPage = new CustomersPage();
        accountPageStoreTDW = new AccountPageStoreTDW();

    }

    @Test(groups = {"sanity", "regression"})
    public void bankManagerShouldAddCustomerSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        homePage.clickOnManagerLogiNTab();
        Thread.sleep(1000);
        bankManagerLoginPage.clickOnAddCustomerTab();
        addCustomerPage.enterFirstNameTab("noha");
        addCustomerPage.enterLastNameTab("sing");
        addCustomerPage.enterPostCodeTab("234567");
        addCustomerPage.clickOnAddCustomerTab();
        addCustomerPage.customerAddedSuccessfullyVerify();
        addCustomerPage.acceptAlertPopUpDisplay();

    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        homePage.clickOnManagerLogiNTab();
        bankManagerLoginPage.clickOnOpenAccountTab();
        Thread.sleep(1000);
        openAccountPage.selectCustomerFromDropDownTab("Harry Potter");
        openAccountPage.selectCurrencyFromDropDownTab("Pound");
        openAccountPage.clickOnProcessTab();
        openAccountPage.accountcreatedSuccessfullyVerify("Account created successfully");
        openAccountPage.acceptAlertPopUpDisplay1();

    }

    @Test(groups = {"smoke", "regression"})
    public void customerShouldLoginAndLogoutSuceessfully() {
        homePage.clickOnCustomerLoginTab();
        customerLoginPage.selectYourNameFromDropDownMenu("Harry Potter");
        customerLoginPage.clickOnLogInTab();
        customersPage.yourNameMessageVerify("Your Name :");


    }

    @Test(groups = {"smoke", "regression"})
    public void customerShouldDepositMoneySuccessfully() {
        homePage.clickOnCustomerLoginTab();
        customerLoginPage.selectYourNameFromDropDownMenu("Neville Longbottom");
        customerLoginPage.clickOnLogInTab();
        customersPage.clickOnDepositTab();
        customersPage.enterAmountTab("100");
        customersPage.clickOnDepositMoneyLinkTab();
        customersPage.DepositSuccessfullyMessageVerify("Deposit Successful");
    }

    @Test(groups = {"smoke", "regression"})
    public void customerShouldWithdrawMoneySuccessfully() {
        homePage.clickOnCustomerLoginTab();
        customerLoginPage.selectYourNameFromDropDownMenu("Hermoine Granger");
        customerLoginPage.clickOnLogInTab();
        customersPage.clickOnWithdrawlTab();
        customersPage.enterAmountTab("50");
        customersPage.clickOnWithdrawMoneyTab();
        customersPage.transactionSuccessfullyMessageVerify("Transaction Successful");


    }

}


