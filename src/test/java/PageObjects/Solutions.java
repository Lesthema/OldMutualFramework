package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Solutions {

    WebDriver driver = null;

    @FindBy(xpath = "(//a[contains(.,'Our Solutions')])[1]")
    WebElement OurSolutions_xpath;

    @FindBy(xpath = "(//span[contains(.,'Personal Loans')])[1]")
    WebElement  PersonalLoans_xpath;

    @FindBy(xpath = "//h1[contains(.,'Old Mutual Personal Loan')]")
    WebElement OmPersonalLoan_xpath;

    public Solutions(WebDriver driver){ this.driver = driver;}

    public Solutions ourSolutions(){
        OurSolutions_xpath.click();
        return this;
    }
    public Solutions personalLoans(){
        PersonalLoans_xpath.click();
        return this;
    }
    public Solutions VerifyPersonalLoanPage(){
        Assert.assertEquals(OmPersonalLoan_xpath.getText(), "Old Mutual Personal Loan");
        return this;
    }
}
