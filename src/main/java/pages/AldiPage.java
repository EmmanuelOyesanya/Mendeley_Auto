package pages;/*
 * Created by USER on 27/07/2017.
 */

import helpers.CommonUtil;
import helpers.PropertyUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.DriverUtil.getDriver;


public class AldiPage {

    private CommonUtil commonUtil = new CommonUtil();
    private PropertyUtil propUtil = new PropertyUtil();
    public static WebDriver driver = getDriver();

    private String log = propUtil.getElementProperty("loginlinktext.xpath");
    private String hit = propUtil.getElementProperty("createtext.xpath");
    private String gender = propUtil.getElementProperty("title.xpath");
    private String first = propUtil.getElementProperty("firstnametextbox.xpath");
    private String last = propUtil.getElementProperty("lastnametextbox.xpath");
    private String email = propUtil.getElementProperty("emailtextbox.xpath");
    private String check = propUtil.getElementProperty("confirmtextbox.xpath");
    private String pass = propUtil.getElementProperty("passwordtextbox.xpath");
    private String verify = propUtil.getElementProperty("checkpasswordtextbox.xpath");
    private String register = propUtil.getElementProperty("createbuttontext.xpath");

    public  void clickLogin() {
        commonUtil.waitForElementToBeClickable(By.xpath(log));
        commonUtil.clickElement(log,"xpath");
    }

    public void clickCreate() {
        commonUtil.waitForElementToBeClickable(By.xpath(hit));
        commonUtil.clickElement(hit,"xpath");

    }

    public void fillFields() throws InterruptedException {
        driver.findElement(By.xpath(gender)).sendKeys("Mr.");
        driver.findElement(By.xpath(first)).sendKeys("Emmanuel");
        driver.findElement(By.xpath(last)).sendKeys("Abbey");
        Thread.sleep(3000);
        driver.findElement(By.xpath(email)).sendKeys("bankykiaz@yahoo.com");
        driver.findElement(By.xpath(check)).sendKeys("bankykiaz@yahoo.com");
        driver.findElement(By.xpath(pass)).sendKeys("Passw0rd2");
        Thread.sleep(3000);
        driver.findElement(By.xpath(verify)).sendKeys("Passw0rd2");
        Thread.sleep(5000);
        commonUtil.clickElement(register,"xpath");
        Thread.sleep(5000);





    }

    public static void seeSalutation() {

    }
}
