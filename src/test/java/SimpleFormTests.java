import Pages.BasePage;
import Pages.SimpleFormPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Pages.BasePage;
import Pages.SimpleFormPage;

public class SimpleFormTests extends BasePage {
    private SimpleFormPage simpleFormPage;
    private final By simpleFormDemoLink = By.linkText("Simple Form Demo");

    @BeforeMethod
    public void setUp() {
        super.setUp();
        simpleFormPage = new SimpleFormPage(driver);
}

    @Test
    public void enterMessageAndClickGetCheckedValue() {
        driver.findElement(simpleFormDemoLink).click(); // Use the constant locator
        simpleFormPage.enterTextInTextField("Test");
        simpleFormPage.clickOnGetCheckedValueButton();

        String actualResult = driver.findElement(By.id("message")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Test"));
    }

    //1. caractere speciale
    //2. cifre
    //3. spatii

    @Test
    public void enterMessageAndClickGetCheckedValue1() {
        driver.findElement(simpleFormDemoLink).click(); // Use the constant locator
        simpleFormPage.enterTextInTextField("?");
        simpleFormPage.clickOnGetCheckedValueButton();

        String actualResult = driver.findElement(By.id("message")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("?"));
    }

    @Test
    public void enterMessageAndClickGetCheckedValue2() {
        driver.findElement(simpleFormDemoLink).click(); // Use the constant locator
        simpleFormPage.enterTextInTextField("5");
        simpleFormPage.clickOnGetCheckedValueButton();

        String actualResult = driver.findElement(By.id("message")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("5"));
    }

    @Test
    public void enterMessageAndClickGetCheckedValue3() {
        driver.findElement(simpleFormDemoLink).click(); // Use the constant locator
        simpleFormPage.enterTextInTextField("Spatii");
        simpleFormPage.clickOnGetCheckedValueButton();

        String actualResult = driver.findElement(By.id("message")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Spatii"));
    }

    // adaugati 3 teste pentru Two Input Fields
    @Test
    public void enterMessageAndClickGetCheckedValue4() {
        driver.findElement(simpleFormDemoLink).click(); // Use the constant locator
        simpleFormPage.enterTextInFirstTextField("2");
        simpleFormPage.enterTextInSecondTextField("3");
        simpleFormPage.clickOnGetSumButton();

        String actualResult = driver.findElement(By.id("addmessage")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("5"));

    }
}
