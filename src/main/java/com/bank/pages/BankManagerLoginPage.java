package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {

    public BankManagerLoginPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement addCustomerField;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[2]")
    WebElement openAccountField;

    public void clickOnAddCustomerTab(){
//        Reporter.log("click and Add Customer Tab "+addCustomerField.toString()+"<br>");
//        CustomListeners.node.log(Status.PASS,"click and Add Customer Tab "+addCustomerField.toString()+"<br>" );
        clickOnElement(addCustomerField);
    }

    public void clickOnOpenAccountTab(){
//        Reporter.log("click On Open Account Tab "+openAccountField.toString()+"<br>");
//        CustomListeners.node.log(Status.PASS,"click On Open Account Tab "+openAccountField.toString()+"<br>" );
        clickOnElement(openAccountField);
    }
}
