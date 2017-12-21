package pages;

import helpers.CommonUtil;
import helpers.PropertyUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.DriverUtil.getDriver;

/**
 * Created by Isaac on 04/01/2017.
 */
public class BookingPage {

    private CommonUtil commonUtil = new CommonUtil();
    private PropertyUtil propUtil = new PropertyUtil();
    public static WebDriver driver = getDriver();


    private String first = propUtil.getElementProperty("firsttext.css");
    private String surtext = propUtil.getElementProperty("surnametext.css");
    private String cost = propUtil.getElementProperty("costtext.css");
    private String arrival = propUtil.getElementProperty("startdate.css");
    private String departure = propUtil.getElementProperty("enddate.css");
    private String deposit = propUtil.getElementProperty("true.css");
    private String falsetext = propUtil.getElementProperty("false.xpath");
    private String submit = propUtil.getElementProperty("save.css");
    private String checkin = propUtil.getElementProperty("check-in.css");




    public void setName() throws Throwable {

        Assert.assertEquals("Hotel booking form", driver.getTitle());
        driver.findElement(By.cssSelector(first)).sendKeys("isaac");
        driver.findElement(By.cssSelector(surtext)).sendKeys("Tester");
    }

   public void selectDate() throws Throwable {
       //driver.findElement(By.cssSelector(cost)).sendKeys("2300");
       driver.findElement(By.cssSelector(arrival)).sendKeys("13/07/2017");
       driver.findElement(By.cssSelector(departure)).sendKeys("20/07/2017");
   }

    public void makeDeposit() throws Throwable{
        driver.findElement(By.cssSelector(cost)).sendKeys("2300");

    }
    public void enterName()throws Throwable{
        driver.findElement(By.cssSelector(first)).sendKeys("Bull");
        driver.findElement(By.cssSelector(surtext)).sendKeys("Testers");
    }
    public void deposit() throws Throwable{
        commonUtil.waitForElementToBeClickable(By.cssSelector(deposit));
        commonUtil.clickElement(deposit,"css");

    }
    public void unable() throws Throwable {
        commonUtil.clickElement(submit,"css");
        commonUtil.takeScreenshot();

    }
    public  void pastDate ()throws Throwable{
        driver.findElement(By.cssSelector(cost)).sendKeys("0000");
        commonUtil.clickElement(falsetext,"xpath");
        driver.findElement(By.cssSelector(arrival)).sendKeys("01/07/2017");
        driver.findElement(By.cssSelector(departure)).sendKeys("04/07/2017");
        // commonUtil.waitForElementToBeClickable(By.cssSelector(falsetext));


    }
    public  void clickSave ()throws Throwable{
        commonUtil.clickElement(submit,"css");
    }

    public void confirmation()throws Throwable {

        commonUtil.clickElement(submit,"css");
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "http://hotel-test.equalexperts.io/" );
        //System.out.print(URL);
        System.out.println(URL);
        commonUtil.takeScreenshot();





    }


}
