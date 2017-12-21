package pages;

import helpers.CommonUtil;
import helpers.PropertyUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.DriverUtil.getDriver;

public class NewUserPage {


    private CommonUtil commonUtil = new CommonUtil();
    private PropertyUtil propUtil = new PropertyUtil();
    public static WebDriver driver = getDriver();

    private String hit = propUtil.getElementProperty("hit.xpath");
    private String fill = propUtil.getElementProperty("fill.xpath");
    private String tap = propUtil.getElementProperty("tap.xpath");
    private String msg = propUtil.getElementProperty("msg.xpath");

    public void BaseUrl(){
        driver.get(propUtil.getProperty("baseURL"));
    }

    public void clickCreate() {
        commonUtil.waitForElementToBeClickable(By.xpath(hit));
        commonUtil.clickElement(hit,"xpath");
    }

    public void confirm() {

    }
    public void enterInvalid() {
        commonUtil.waitForElementToBeVisible(By.xpath(fill));
        driver.findElement(By.xpath(fill)).sendKeys("abc@def.com");
    }

    public void clickContinue() {
        commonUtil.waitForElementToBeClickable(By.xpath(tap));
        commonUtil.clickElement(tap,"xpath");
    }

    public void confirmation() {
        String confirmation = driver.findElement((By.xpath("//*[@id=\"maincontent\"]"))).getText();
        System.out.println(confirmation);
    }

}

