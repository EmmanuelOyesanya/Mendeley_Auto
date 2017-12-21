package pages;

import helpers.CommonUtil;
import helpers.PropertyUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import static helpers.DriverUtil.getDriver;

/**
 * Created by Isaac on 13/05/2017.
 */
public class openAccountPage {
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
    public void enterAccountCriteria()throws  Throwable{
        Thread.sleep(2000);
        driver.findElement(By.xpath(emailtext)).sendKeys("baddo@yahoo.co.uk");
        driver.findElement(By.xpath(passwordtext)).sendKeys("Bigboys24");
        Select dropdown = new Select(driver.findElement(By.xpath(titletext)));
        dropdown.selectByVisibleText("Mr");
        //driver.findElement(By.xpath(titletext)).sendKeys("Mr");
        driver.findElement(By.xpath(firsttext)).sendKeys("Tommy");
        driver.findElement(By.xpath(lasttext)).sendKeys("Webdriver");
        driver.findElement(By.xpath(daytext)).sendKeys("13");
        driver.findElement(By.xpath(monthtext)).sendKeys("6");
        driver.findElement(By.xpath(yeartext)).sendKeys("1944");
        driver.findElement(By.xpath(phonetext)).sendKeys("07400008908");
    }
    public void clickSubmit()throws Throwable{
        commonUtil.clickElement(submitbutton,"xpath");
    }
    public void seeInformation()throws Throwable{
        Thread.sleep(3000);
    }
}
