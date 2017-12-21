package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.CommonUtil;
import helpers.PropertyUtil;
import org.openqa.selenium.WebDriver;
import pages.AccountSetupPage;

import static helpers.DriverUtil.getDriver;

/**
 * Created by Isaac on 12/05/2017.
 */


public class AccountSetupPagesteps {
    public static WebDriver driver = getDriver();
    private PropertyUtil propUtil = new PropertyUtil();
    private CommonUtil commonUtil = new CommonUtil();

    private AccountSetupPage AccountSetupPage = new AccountSetupPage();

    @Given("^am on the Landing page$")
    public void am_on_the_Landing_page() throws Throwable {
        driver.get(propUtil.getProperty("baseURL"));
    }

    @Given("^I click my Account$")
    public void i_click_my_Account() throws Throwable {
        AccountSetupPage.clickAccount();
    }

    @When("^I enter my  \"(.*?)\" &\"(.*?)\"$")
    public void i_enter_my(String Email, String Password) throws Throwable {
        AccountSetupPage.setEmailtext(Email);
        AccountSetupPage.passwordText(Password);

    }

    @When("^Also select \"(.*?)\"$")
    public void also_select(String Title) throws Throwable {
        AccountSetupPage.setTitletextt(Title);
    }

    @When("^Iinsert   \"(.*?)\" and \"(.*?)\"$")
    public void iinsert_and(String Firstname, String Lastname) throws Throwable {
        AccountSetupPage.setfirsttextt(Firstname);
        AccountSetupPage.setlasttext(Lastname);
    }

    @When("^I pick   \"(.*?)\" \"(.*?)\" \"(.*?)\"$")
    public void i_pick(String Day, String Month, String Year) throws Throwable {
        AccountSetupPage.setDaytext(Day);
        AccountSetupPage.setmonthtext(Month);
        AccountSetupPage.setyeartext(Year);
    }
    @Given("^I insert   \"(.*?)\"$")
    public void i_insert(String MobileNumber) throws Throwable {
        AccountSetupPage.setPhonetext(MobileNumber);
    }
    @When("^I  click    Continue$")
    public void i_click_Continue() throws Throwable {
        AccountSetupPage.clickContinue();
    }

    @Then("^my account is setup$")
    public void my_account_is_setup() throws Throwable {
        Thread.sleep(3000);
    }


}
