package WebBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PageObject {
    public WebDriver driver;
    private static PageObject webBrowserSetup = null;

    public static PageObject getInstance() {
        if (webBrowserSetup == null) {
            webBrowserSetup = new PageObject();
        }
        return webBrowserSetup;
    }
    private PageObject(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.get("https://www.google.com.br");
        this.driver.manage() .window().maximize();
    }
    public WebDriver getDriver(){
        return this.driver;
    }

}
