package steps;/*
 * Created by USER on 27/07/2017.
 */

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.CommonUtil;
import helpers.PropertyUtil;
import org.openqa.selenium.WebDriver;
import pages.AldiPage;

import static helpers.DriverUtil.getDriver;
import static pages.AldiPage.seeSalutation;

public class AldiPagesteps {

    public static WebDriver driver = getDriver();
    private PropertyUtil propUtil = new PropertyUtil();
    private CommonUtil commonUtil = new CommonUtil();

    private AldiPage AldiPage = new AldiPage();



    @Given("^I navigate to the landing page$")
    public void i_navigate_to_the_landing_page() throws Throwable {
        driver.get(propUtil.getProperty("baseURL"));
    }

    @When("^I click on the log in/register button$")
    public void i_click_on_the_log_in_register_button() throws Throwable {
        AldiPage.clickLogin();
    }

    @When("^I click on create an account$")
    public void i_click_on_create_an_account() throws Throwable {
        AldiPage.clickCreate();
    }

    @When("^I fill all the required text fields$")
    public void i_fill_all_the_required_text_fields() throws Throwable {
        AldiPage.fillFields();
    }

    @Then("^I should be able to see a welcome salutation of my name$")
    public void i_should_be_able_to_see_a_welcome_salutation_of_my_name() throws Throwable {
        seeSalutation();
    }

}
