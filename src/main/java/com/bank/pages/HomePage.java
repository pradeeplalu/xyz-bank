package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankManagerLoginField;
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLoginField;

    public void clickOnManagerLogiNTab() {
//        Reporter.log("click On Manager LogiN Tab "+bankManagerLoginField.toString()+"<br>");
//        CustomListeners.node.log(Status.PASS,"click On Withdraw Money Tab  "+bankManagerLoginField.toString()+"<br>" );
        clickOnElement(bankManagerLoginField);
    }


    public void clickOnCustomerLoginTab() {
//        Reporter.log("click On Customer Login Tab "+customerLoginField.toString()+"<br>");
//        CustomListeners.node.log(Status.PASS,"click On Customer Login Tab "+customerLoginField.toString()+"<br>" );
        clickOnElement(customerLoginField);

    }
}