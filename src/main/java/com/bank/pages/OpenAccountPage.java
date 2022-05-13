package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class OpenAccountPage  extends Utility {

    public OpenAccountPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customerDropDownField;
    @FindBy(xpath = "//select[@id='currency']")
    WebElement currencyDropDownField;
    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement processBoxField;

    public void selectCustomerFromDropDownTab(String text){
//        Reporter.log("select Customer From DropDown Tab "+text+customerDropDownField.toString()+"<br>");
//        CustomListeners.node.log(Status.PASS,"select Customer From DropDown Tab "+text+customerDropDownField.toString()+"<br>" );
        selectByVisibleTextFromDropDown(customerDropDownField,text);
    }

    public void selectCurrencyFromDropDownTab(String currency){
//        Reporter.log("select Currency From DropDown Tab "+currency+currencyDropDownField.toString()+"<br>");
//        CustomListeners.node.log(Status.PASS,"select Currency From DropDown Tab "+currency+currencyDropDownField.toString()+"<br>" );
        selectByVisibleTextFromDropDown(currencyDropDownField,currency);
    }

    public void clickOnProcessTab(){
//        Reporter.log("click On Process Tab "+processBoxField.toString()+"<br>");
//        CustomListeners.node.log(Status.PASS,"click On Process Tab  "+processBoxField.toString()+"<br>" );
        clickOnElement(processBoxField);
    }
    public void accountcreatedSuccessfullyVerify(String message){
//        Reporter.log("account created Successfully"+"<br>");
//        CustomListeners.node.log(Status.PASS,"account created Successfully"+"<br>" );
        Alert alert= driver.switchTo().alert();
        String actualmessage =alert.getText();
        String expectedmessage = message;
        SoftAssert softAssert =new SoftAssert();
        softAssert.assertEquals(actualmessage,expectedmessage,expectedmessage + "  It is not display");
    }
    public void acceptAlertPopUpDisplay1(){
//        Reporter.log("accept Alert PopUp Display1"+"<br>");
//        CustomListeners.node.log(Status.PASS,"accept Alert PopUp Display1"+"<br>" );
        Alert alert= driver.switchTo().alert();
        alert.accept();
    }
    }

