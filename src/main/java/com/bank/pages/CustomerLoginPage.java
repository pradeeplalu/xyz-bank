package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;



public class CustomerLoginPage extends Utility {

    public CustomerLoginPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement yourNameDropDownField;
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement logInField;
//    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
//    WebElement yourNameField;

    public void selectYourNameFromDropDownMenu(String text){
//        Reporter.log("select YourName From DropDown Menu "+text+yourNameDropDownField.toString()+"<br>");
//        CustomListeners.node.log(Status.PASS,"select YourName From DropDown Menu "+text+yourNameDropDownField.toString()+"<br>" );
        selectByVisibleTextFromDropDown(yourNameDropDownField,text);

    }
    public void clickOnLogInTab(){
//        Reporter.log("click On LogIn Tab "+logInField.toString()+"<br>");
//        CustomListeners.node.log(Status.PASS,"click On LogIn Tab "+logInField.toString()+"<br>" );
        clickOnElement(logInField);

    }

//    public void YourNameVerify(String text){
//       verifyAssertText(yourNameField,text);}




}
