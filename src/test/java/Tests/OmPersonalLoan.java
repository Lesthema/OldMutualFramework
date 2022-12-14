package Tests;

import Utils.BrowserSetup;
import Utils.TakeScreenShot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.IOException;

@Test
public class OmPersonalLoan extends BaseTests {

    public void HomepageValidation() throws InterruptedException, IOException {
        TakeScreenShot.takeSnapShot(driver, "HomePage_" + System.currentTimeMillis());
        homePage.PageVerify();
    }

    @Test(dependsOnMethods = "HomepageValidation")
    public void solutionsValidation() throws IOException, InterruptedException {
        solutions
                .ourSolutions();
        Thread.sleep(4000);
        TakeScreenShot.takeSnapShot(driver, "Our solutions_" +System.currentTimeMillis());
        solutions
                .personalLoans()
                .VerifyPersonalLoanPage();
        Thread.sleep(4000);
        TakeScreenShot.takeSnapShot(driver, "Personal loan_" + System.currentTimeMillis());

    }
    @Test (dependsOnMethods = "solutionsValidation")
    public void Calculate() throws IOException, InterruptedException {
        personalLoanCalculate
                .calculate()
                .TabSwitch(driver);

        personalLoanCalculate
                .validatepage()
                .amount()
                .selectAmount();
        Thread.sleep(4000);
        TakeScreenShot.takeSnapShot(driver, "Amount_" +System.currentTimeMillis());
        personalLoanCalculate
                .nextButton()
                .monthsDropdown()
                .selectMonths();
        Thread.sleep(4000);
        TakeScreenShot.takeSnapShot(driver,"Months_" +System.currentTimeMillis());
        personalLoanCalculate
                .calculateButton()
                .monthlyRepayment();
        Thread.sleep(4000);
        TakeScreenShot.takeSnapShot(driver,"Monthly repayment_" +System.currentTimeMillis());

    }
    @AfterTest
    public  void closeBrowser(){
        BrowserSetup.teardown();
    }
}
