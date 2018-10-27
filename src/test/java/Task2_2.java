import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Task2_2 {


    private final By WEBTITLES = By.xpath(".//a[@class = 'top2012-title']");
    private final By MOBTITLES = By.xpath(".//a[@class = 'md-scrollpos']");
    private final String WEB_PAGE = "http://rus.delfi.lv/";
    private final String MOB_PAGE = "http://m.rus.delfi.lv/";

    @Test

    public void DelfiWebAndMobTitlesTest() {

        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");

        for (int i = 0; i < 5; i++) {
            WebDriver browser = new FirefoxDriver();
            browser.manage().window().maximize();
            browser.get(WEB_PAGE);
            String webElementList = browser.findElements(WEBTITLES).get(i).getText();
            System.out.println(webElementList);
            browser.get(MOB_PAGE);
            String mobElementList = browser.findElements(MOBTITLES).get(i).getText();
            System.out.println(mobElementList);
            browser.close();

            Assertions.assertEquals(webElementList, mobElementList, "Titles are different");

        }

    }
}
