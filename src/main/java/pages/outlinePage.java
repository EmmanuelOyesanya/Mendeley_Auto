package pages;

import helpers.CommonUtil;
import helpers.PropertyUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.DriverUtil.getDriver;

/**
 * Created by Isaac on 17/01/2017.
 */
public class outlinePage {
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


    public void setFirstName(String Firstname) throws Throwable {
        Assert.assertEquals("Hotel booking form", driver.getTitle());
        driver.findElement(By.cssSelector(first)).sendKeys(Firstname);
    }

    public void setSurName( String Surname) throws Throwable {
        driver.findElement(By.cssSelector(surtext)).sendKeys(Surname);
    }

    public void setPrice(String Price) throws Throwable {
        driver.findElement(By.cssSelector(cost)).sendKeys(Price);
    }

    public void deposit(String Deposit) throws Throwable {
        commonUtil.waitForElementToBeClickable(By.cssSelector(deposit));
        driver.findElement(By.cssSelector(deposit)).sendKeys(Deposit);
        //commonUtil.clickElement(deposit, "css");
        commonUtil.waitForElementToBeClickable(By.xpath(falsetext));
        driver.findElement(By.xpath(falsetext)).sendKeys(Deposit);
    }

    public void setcheckin(String Checkin) {
        driver.findElement(By.cssSelector(arrival)).sendKeys(Checkin);
    }

    public void setCheckOut(String Checkout) throws Throwable {
        driver.findElement(By.cssSelector(departure)).sendKeys( Checkout);
    }


    public void clickSave() throws Throwable {
        // commonUtil.clickElement(submit,"css");
        // commonUtil.takeScreenshot();
    }

    public void setSave() throws Throwable {
        commonUtil.clickElement(submit, "css");
        Thread.sleep(5000);
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "http://hotel-test.equalexperts.io/");
        System.out.println(URL);
        commonUtil.takeScreenshot();

    }


    }

