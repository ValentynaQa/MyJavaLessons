package AutomationHW4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObject {
    @FindBy(name = "my-text")
    private WebElement textBox;

    @FindBy(css = "button")
    private WebElement submitButton;

    @FindBy(id = "message")
    private WebElement message;

    public void enterText(String text) {
        textBox.sendKeys(text);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public String getMessage() {
        return message.getText();
    }
}
