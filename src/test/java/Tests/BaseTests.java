package Tests;

import PageObjects.HomePage;
import PageObjects.PersonalLoanCalculate;
import PageObjects.Solutions;
import Utils.BrowserSetup;
import Utils.TakeScreenShot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseTests {

    BrowserSetup StartBrowser = new BrowserSetup();
    final WebDriver driver = StartBrowser.startBrowser("chrome", "https://www.oldmutualfinance.co.za");
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    Solutions solutions = PageFactory.initElements(driver, Solutions.class);
    PersonalLoanCalculate personalLoanCalculate = PageFactory.initElements(driver, PersonalLoanCalculate.class);
    TakeScreenShot takeSnapshot = new TakeScreenShot();
        }

