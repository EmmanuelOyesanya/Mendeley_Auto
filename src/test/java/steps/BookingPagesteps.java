package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.CommonUtil;
import helpers.PropertyUtil;
import org.openqa.selenium.WebDriver;
import pages.BookingPage;

import static helpers.DriverUtil.getDriver;

/**
 * Created by Isaac on 04/01/2017.
 */

public class BookingPagesteps {

        public static WebDriver driver = getDriver();
        private PropertyUtil propUtil = new PropertyUtil();
        private CommonUtil commonUtil = new CommonUtil();

        private BookingPage bookingPage = new BookingPage();

    @Given("^Am on the landing page$")
    public void am_on_the_landing_page() throws Throwable {
        driver.get(propUtil.getProperty("baseURL"));

    }

    @When("^I enter my names$")
    public void i_enter_my_name() throws Throwable {
        bookingPage.setName();

    }

    @When("^Select check-in&check-out date$")
    public void select_checkin_checkout_date() throws Throwable {
        bookingPage.selectDate();

    }
    @When("^I make a deposit$")
    public void i_make_a_deposit() throws Throwable {
        bookingPage.makeDeposit();

    }
    @When("^I enter my First\\$ Surname$")
    public void i_enter_my_First$_Surname() throws Throwable {
          bookingPage.enterName();
    }

    @When("^I didn't make a deposit nor select date$")
    public void i_didn_t_make_a_deposit() throws Throwable {
        bookingPage.deposit();
    }

    @Then("^am unable to make a booking$")
    public void am_unable_to_make_a_booking() throws Throwable {
        bookingPage.unable();
    }

    @When("^I select a past date for Check-in and Check-out$")
    public void i_select_a_past_date_for_Check_in_and_Check_out() throws Throwable {
        bookingPage.pastDate();

    }

    @Then("^I click save$")
    public void i_click_save() throws Throwable {
        bookingPage.clickSave();
    }


    @Then("^should see confirmation$")
    public void should_see_confirmation() throws Throwable {
        bookingPage.confirmation();

    }


    }




