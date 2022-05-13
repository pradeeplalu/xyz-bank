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


public class AddCustomerPage  extends Utility {
    public AddCustomerPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@ng-model='fName']")
    WebElement firstNameField;
    @FindBy(xpath = "//input[@ng-model='lName']")
    WebElement lastNameField;
    @FindBy(xpath = "//input[@ng-model='postCd']")
    WebElement postCodeField;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement addCustomerField;

    public void enterFirstNameTab(String text){
//        Reporter.log("enter First Name "+text+firstNameField.toString()+"<br>");
//        CustomListeners.node.log(Status.PASS,"enter First Name "+text+firstNameField.toString()+"<br>" );
        sendTextToElement(firstNameField,text);
    }

    public void enterLastNameTab(String text){
//        Reporter.log("enter Last Name "+text+lastNameField.toString()+"<br>");
//        CustomListeners.node.log(Status.PASS,"enter Last Name"+text+firstNameField.toString()+"<br>" );
        sendTextToElement(lastNameField,text);

    }
    public void enterPostCodeTab(String text){
//        Reporter.log("enter PostCode Tab "+text+postCodeField.toString()+"<br>");
//        CustomListeners.node.log(Status.PASS,"enter PostCode Tab "+text+postCodeField.toString()+"<br>" );
        sendTextToElement(postCodeField,text);

    }

    public  void clickOnAddCustomerTab(){
//        Reporter.log("click and Add Customer Tab "+addCustomerField.toString()+"<br>");
//        CustomListeners.node.log(Status.PASS,"click and Add Customer Tab "+addCustomerField.toString()+"<br>" );

        clickOnElement(addCustomerField);
    }

    public void customerAddedSuccessfullyVerify(){
//        Reporter.log("customer Added Successfully Message"+"<br>");
//        CustomListeners.node.log(Status.PASS,"customer Added Successfully Message"+"<br>" );
        Alert alert= driver.switchTo().alert();
        String actualmessage =alert.getText();
        String expectedmessage = "Customer added successfully";
        SoftAssert softAssert =new SoftAssert();
        softAssert.assertEquals(actualmessage,expectedmessage,expectedmessage + "  It is not display");

    }
    public void acceptAlertPopUpDisplay(){
//        Reporter.log("accept Alert PopUp Display" +"<br>");
//        CustomListeners.node.log(Status.PASS,"accept Alert PopUp Display"+"<br>" );
        Alert alert= driver.switchTo().alert();
        alert.accept();
    }

}
