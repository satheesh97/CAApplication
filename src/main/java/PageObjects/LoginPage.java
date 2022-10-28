package PageObjects;

import DataProvider.ConfigFileReader;

import Managers.AllDriverManager;
import Utilities.TestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

    ConfigFileReader configFileReader = new ConfigFileReader();
    AllDriverManager driver = new AllDriverManager();

    WebDriver webDriver ;
public  LoginPage(WebDriver webDriver){
    PageFactory.initElements(webDriver,this);
}

    TestContext testContext;


    @FindBy(id = "un")
    private WebElement username;

    @FindBy(id = "pw")
    private WebElement password;


    @FindBy(xpath = "//input[@type=\"submit\"]")
    private WebElement signIN;

 @FindBy(xpath = "//a/div[contains(text(),'Audits')]")
 private  WebElement AuditMenu;

    @FindBy(xpath = "//button[contains(text(),'Audit')]")
    private  WebElement crateAudits ;

    By Signin = By.xpath("//button[contains(text(),'Audit')]");
    public void signPage(String name, String pwd){
        username.sendKeys(name);

        password.sendKeys(pwd);
       // signIN.click();
    }

    public void clickSubmit(){
       // webDriver =testContext.getDriverManager().getDriver();
        webDriver.findElement(Signin).click();
       // signIN.click();
      //  webDriver.
    }


public void createAudits(){
    AuditMenu.click();
    crateAudits.click();
   //Select se = new Select(crateAudits);
}


}
