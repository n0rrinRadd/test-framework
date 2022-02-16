package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Keyboard {

    public WebDriver driver;

    public Keyboard(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement Key (char c){
        return driver.findElement(By.xpath("//button[@data-key='" + String.valueOf(c) + "'"));
    }


    @FindBy(css = ".one-and-a-half")
    public WebElement enter;

    public void EnterWord(String str){

        // Creating array of string length
        char[] ch = new char[str.length()];

        // Copy character by character into array
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        for (char c : ch) {
            Key(c).click();
        }
        enter.click();

    }
}
