package Pages;

import Pages.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KeyPressPage extends BasePage {
    public KeyPressPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "my_field")
    private WebElement textField;

    public void typeInTheTextField(String text) {
        textField.sendKeys(text);
    }

    public void typeInShiftKey() {
        textField.click();
        Actions action = new Actions(driver);
        action.keyDown(Keys.SHIFT).perform();
    }
}
