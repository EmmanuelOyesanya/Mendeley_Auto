package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.CommonUtil;
import helpers.PropertyUtil;
import org.openqa.selenium.WebDriver;
import pages.openAccountPage;

import static helpers.DriverUtil.getDriver;

/**
 * Created by Isaac on 13/05/2017.
 */
public class openAccountPagesteps {
    public static WebDriver driver = getDriver();
    private PropertyUtil propUtil = new PropertyUtil();
    private CommonUtil commonUtil = new CommonUtil();

    private openAccountPage openAccountPage= new openAccountPage();

    @Given("^Am on the next page$")
    public void am_on_the_next_page() throws Throwable {
        driver.get(propUtil.getProperty("baseURL"));

    }

    @When("^I enter my account criteria$")
    public void i_enter_my_account_criteria() throws Throwable {
        openAccountPage.clickAccount();
        openAccountPage.enterAccountCriteria();

    }

    @When("^Select continue$")
    public void select_continue() throws Throwable {
        openAccountPage.clickSubmit();
    }
    @Then("^should get confirmation$")
    public void should_get_confirmation() throws Throwable {
        openAccountPage.seeInformation();
    }
}
