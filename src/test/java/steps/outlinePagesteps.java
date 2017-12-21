package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.CommonUtil;
import helpers.PropertyUtil;
import org.openqa.selenium.WebDriver;
import pages.outlinePage;

import static helpers.DriverUtil.getDriver;
/**
 * Created by Isaac on 18/01/2017.
 */

public class outlinePagesteps {

   public static WebDriver driver = getDriver();
   private PropertyUtil propUtil = new PropertyUtil();
   private CommonUtil commonUtil = new CommonUtil();

   private outlinePage  outlinePage= new outlinePage();

    @Given("^Am on the booking page$")
    public void am_on_the_landing_page() throws Throwable {
        driver.get(propUtil.getProperty("baseURL"));

    }

    @When("^I enter my \"(.*?)\"$")
    public void i_enter_my(String Firstname)throws Throwable {
         outlinePage.setFirstName(Firstname);
   }

    @When("^Also enter \"(.*?)\"$")
    public void also_enter(String Surname) throws Throwable {
       outlinePage.setSurName(Surname);
 }
    @When("^Iinsert  \"(.*?)\"$")
    public void iinsert(String Price) throws Throwable {
        outlinePage.setPrice(Price);
   }
    @When("^enter  \"(.*?)\"$")
    public void enter(String Deposit) throws Throwable {
        outlinePage.deposit(Deposit);
    }
    @When("^Select \"(.*?)\"$")
    public void select(String Checkin) throws Throwable {
       outlinePage.setcheckin(Checkin);

   }

    @When("^enter the  \"(.*?)\" Date$")
    public void enter_the_Date(String Checkout) throws Throwable {
        outlinePage.setCheckOut(Checkout);
   }
    @Then("^should save booking$")
   public void should_see_confirm() throws Throwable {
        outlinePage.setSave();
    }
}


