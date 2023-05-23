import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;
public class AutomationHW5 {
    /*WebDriver driver = new ChromeDriver();
    driver.get("http://example.com");

    WebElement table = driver.findElement(By.id("table-id"));

    List<WebElement> rows = table.findElements(By.tagname("tr"));
    int rowCount = rows.size();

    for (WebElement row : rows) {
        List<WebElement> columns = row.findElements(By.tagname("tr"));
        for (WebElement column : columns) {
            String cellText = columns.getText();
            System.out.println("Cell text: " + cellText);
        }
    }*/

    private WebDriver driver = new ChromeDriver();

    public void TableDataProcessing() {
        driver.get("http://example.com");

        WebElement table = driver.findElement(By.id("table-id"));

        List<WebElement> rows = table.findElements(By.tagName("tr"));
        int rowCount = rows.size();

        rows.stream().forEach(this::rowProcessing);
    }

    private void rowProcessing (WebElement row) {
        List<WebElement> columns = row.findElements(By.tagName("td"));
        columns.stream().forEach(this::columnrowProcessing);
    }

    private void columnrowProcessing(WebElement column) {
        String cellText = column.getText();
        System.out.println("Cell text: " + cellText);
    }

}
