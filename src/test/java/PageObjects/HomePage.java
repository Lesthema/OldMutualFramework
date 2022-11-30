package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {

    WebDriver driver = null;

    @FindBy(xpath = "//strong[contains(.,'Bank and Borrow')]")
    WebElement LandingPage_xpath;

    public HomePage(WebDriver driver){ this.driver=driver; }

    public void PageVerify(){
        Assert.assertEquals(LandingPage_xpath.getText(), "Bank and Borrow");
    }

}
