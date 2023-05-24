package AutomationHW4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;

import java.time.Duration;

public class FirstTest {
    private WebDriver driver;
    private PageObject webFormPage;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        webFormPage = PageFactory.initElements(driver, PageObject.class);
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
    }

    @Test
    public void eightComponents() throws InterruptedException {
        String title = driver.getTitle();
        assertEquals("Web form", title);

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        webFormPage.enterText("Selenium");
        sleep(2000);
        webFormPage.clickSubmitButton();

        String value = webFormPage.getMessage();
        assertEquals("Received!", value);
        sleep(2000);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
