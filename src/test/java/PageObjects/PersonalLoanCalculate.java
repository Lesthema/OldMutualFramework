package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PersonalLoanCalculate {
    WebDriver driver = null;

    @FindBy(xpath = "//span[@class='om-button-text'][contains(.,'CALCULATE')]")
    WebElement calculate_xpath;

    @FindBy(xpath = "//a[contains(.,'personal loan calculator')]")
    WebElement calculatorLabel_xpath;

    @FindBy(xpath = "//use[contains(@href,'down')]")
    WebElement amountDropdown_xpath;

    @FindBy(xpath = "//li[@id='R50000']")
    WebElement amount_xpath;

    @FindBy(xpath = "//button[@class='theme-default secondary-large'][contains(.,'Next')]")
    WebElement next_xpath;

    @FindBy(xpath = "(//span[@class='selected-value-container'])[1]")
    WebElement monthsDropdown_xpath;

    @FindBy(xpath = "//li[@id='60 Months']")
    WebElement months_xpath;

    @FindBy(xpath = "(//span[@class='om-button-text'][contains(.,'Calculate')])[1]")
    WebElement calculateButton_xpath;

    @FindBy(xpath = "//strong[contains(.,'R1 656.43 - R1 810.05')]")
    WebElement monthlyRepayment_xpath;

    public PersonalLoanCalculate(WebDriver driver) {
        this.driver = driver;
    }

    public PersonalLoanCalculate calculate() {
        calculate_xpath.click();
        return this;
    }
    public void TabSwitch(WebDriver driver) {
    driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
    }

    public PersonalLoanCalculate validatepage(){
        Assert.assertEquals(calculatorLabel_xpath.getText(),"personal loan calculator");
        return this;
    }

    public PersonalLoanCalculate amount() {
        new WebDriverWait(driver, 40).until(ExpectedConditions.visibilityOf(amountDropdown_xpath));
        amountDropdown_xpath.click();
        return this;

    }

    public PersonalLoanCalculate selectAmount() {
        amount_xpath.click();
        return this;
    }

    public PersonalLoanCalculate nextButton() {
        next_xpath.click();
        return this;
    }

    public PersonalLoanCalculate monthsDropdown() {
        monthsDropdown_xpath.click();
        return this;
    }

    public PersonalLoanCalculate selectMonths() {
        months_xpath.click();
        return this;

    }

    public PersonalLoanCalculate calculateButton() {
        calculateButton_xpath.click();
        return this;

    }

    public PersonalLoanCalculate monthlyRepayment() {
        Assert.assertEquals(monthlyRepayment_xpath.getText(), "R1 656.43 - R1 810.05");
        return this;

    }

}