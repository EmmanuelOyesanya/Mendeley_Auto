package pages;

import helpers.CommonUtil;
import helpers.PropertyUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.DriverUtil.getDriver;

/**
 * Created by Isaac on 12/05/2017.
 */
public class AccountSetupPage {
    private CommonUtil commonUtil = new CommonUtil();
    private PropertyUtil propUtil = new PropertyUtil();
    public static WebDriver driver = getDriver();

    private String myaccounttext = propUtil.getElementProperty("account.xpath");
    private String continuetext = propUtil.getElementProperty("continue.xpath");
    private String emailtext = propUtil.getElementProperty("email.xpath");
    private String passwordtext = propUtil.getElementProperty("password.xpath");
    private String titletext = propUtil.getElementProperty("title.xpath");
    private String firsttext = propUtil.getElementProperty("first.xpath");
    private String lasttext = propUtil.getElementProperty("last.xpath");
    private String daytext = propUtil.getElementProperty("day.xpath");
    private String monthtext = propUtil.getElementProperty("month.xpath");
    private String yeartext = propUtil.getElementProperty("year.xpath");
    private String phonetext = propUtil.getElementProperty("phone.xpath");
    private String submitbutton = propUtil.getElementProperty("submit.xpath");

    public void clickAccount( ) throws Throwable {
        commonUtil.waitForElementToBeVisible(By.xpath(myaccounttext));
        commonUtil.clickElement(myaccounttext,"xpath");
        commonUtil.waitForElementToBeVisible(By.xpath(continuetext));
        commonUtil.clickElement(continuetext,"xpath");
    }

    public void setEmailtext( String Email) throws Throwable {
        driver.findElement(By.xpath(emailtext)).sendKeys(Email);
    }

    public void passwordText( String password ) throws Throwable {
        driver.findElement(By.xpath(passwordtext)).sendKeys(password);
    }
    public void setTitletextt( String title ) throws Throwable {
        driver.findElement(By.xpath(titletext)).sendKeys(title);
    }
    public void setfirsttextt( String firstname ) throws Throwable {
        driver.findElement(By.xpath(firsttext)).sendKeys(firstname);
    }
    public void setlasttext( String lastname ) throws Throwable {
        driver.findElement(By.xpath(lasttext)).sendKeys(lastname);
    }
    public void setDaytext( String day ) throws Throwable {
        driver.findElement(By.xpath(daytext)).sendKeys(day);
    }
    public void setmonthtext( String month ) throws Throwable {
        driver.findElement(By.xpath(monthtext)).sendKeys(month);
    }
    public void setyeartext( String year ) throws Throwable {
        driver.findElement(By.xpath(yeartext)).sendKeys(year);
    }
    public void  setPhonetext(String phone)throws Throwable{
        driver.findElement(By.xpath(phonetext)).sendKeys(phone);
    }
    public void  clickContinue() throws Throwable{
        commonUtil.clickElement(submitbutton,"xpath");


    }
}

