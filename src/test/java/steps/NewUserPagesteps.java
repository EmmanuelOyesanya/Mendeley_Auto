package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.CommonUtil;
import org.openqa.selenium.WebDriver;
import pages.NewUserPage;

import static helpers.DriverUtil.getDriver;

public class NewUserPagesteps {

    private CommonUtil commonUtil = new CommonUtil();

    NewUserPage MainUserPage= new NewUserPage();
    public static WebDriver driver = getDriver();



    @Given("^I am on mendeley homepage$")
    public void i_am_on_mendeley_homepage() throws Throwable {
       MainUserPage.BaseUrl();
    }

    @When("^I select create account$")
    public void i_select_create_account() throws Throwable {
        MainUserPage.clickCreate();
    }

    @When("^I should see the first create account page$")
    public void i_should_see_the_first_create_account_page() throws Throwable {
        MainUserPage.confirm();
    }

    @When("^I enter invalid email address in the email address field$")
    public void i_enter_invalid_email_address_in_the_email_address_field() throws Throwable {
        MainUserPage.enterInvalid();
    }

    @When("^I click continue$")
    public void i_click_continue() throws Throwable {
        MainUserPage.clickContinue();
    }

    @Then("^I should see an error message$")
    public void i_should_see_an_error_message() throws Throwable {
        MainUserPage.confirmation();
    }

}
