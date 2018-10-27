
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Task2 {
    private final By WEBTITLES = By.xpath(".//a[@class = 'top2012-title']");
    private final By MOBTITLES = By.xpath(".//a[@class = 'md-scrollpos']");
    private final String WEB_PAGE = "http://rus.delfi.lv/";
    private final String MOB_PAGE = "http://m.rus.delfi.lv/";

    @Test
    public void DelfiWebAndMobTitlesTest() {

        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        WebDriver browser = new FirefoxDriver();
        browser.manage().window().maximize();
        browser.get(WEB_PAGE);
        for (int i = 0; i < 5; i++) {
            List<WebElement> webElements = browser.findElements(WEBTITLES);
            System.out.println(webElements.get(i).getText());
        }
        browser.get(MOB_PAGE);
        for (int i = 0; i < 5; i++) {
            List<WebElement> mobElements = browser.findElements(MOBTITLES);
            System.out.println(mobElements.get(i).getText());
        }

        browser.close();


    }
}

