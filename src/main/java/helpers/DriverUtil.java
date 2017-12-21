package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.File;

/**
 * Created by Isaac on 04/01/2017.
 */
public class DriverUtil {
    public static WebDriver driver;
    public static File file;


    public static void setDriver() {


        if (driver == null) {


            file = new File("C:\\Users\\User\\Downloads\\chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
            driver = new ChromeDriver();
            driver.manage() .window().maximize();
        }
    }


		/*	driver = new FirefoxDriver();
			file = new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefoxDriver.exe");
			System.setProperty("webdriver.firefox.driver", file.getAbsolutePath());
			driver = new FirefoxDriver();

		}
	}


            file = new File("C:\\Users\\Isaac\\Desktop\\IEDriverServer.exe");
            System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
            driver = new InternetExplorerDriver();
            driver.manage().window().maximize();
            */



    public static WebDriver getDriver() {
        setDriver();
        return driver;

    }

    public static void closeDriver() {
        driver.close();
    }
}

