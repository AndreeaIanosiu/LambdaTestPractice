package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleFormPage extends BasePage {

    public SimpleFormPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    //=========================================================

    @FindBy(css = "input[placeholder='Please enter your Message']")
    private WebElement textField;
    public void enterTextInTextField(String text) {
        textField.sendKeys(text);
    }

    @FindBy(id = "showInput")
    private WebElement getCheckedValueButton;

    public void clickOnGetCheckedValueButton(){
        getCheckedValueButton.click();
    }

    @FindBy(id = "message")
    private WebElement checkMessage;



    //Exercitiu
    @FindBy(id = "sum1")
    private WebElement firstTextField;
    public void enterTextInFirstTextField(String A) {
        firstTextField.sendKeys(A);
    }

    @FindBy(id = "sum2")
    private WebElement secondTextField;
    public void enterTextInSecondTextField(String B) {
        secondTextField.sendKeys(B);
    }

    @FindBy(xpath = "//*[@id=\"gettotal\"]/button")
    private WebElement getSumButton;

    public void clickOnGetSumButton(){
        getSumButton.click();
    }


    public void CheckYourValue(){
        checkMessage.getText();
    }

}
