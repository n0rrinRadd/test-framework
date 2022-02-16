package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Modal {

    public WebDriver driver;

    public Modal(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".close-icon")
    public WebElement close;

    @FindBy(css = ".content")
    public WebElement content;

    @FindBy(css = ".message")
    public WebElement message;

}
