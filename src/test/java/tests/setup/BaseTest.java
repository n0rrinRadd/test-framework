package tests.setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import objects.Game;
import objects.Keyboard;
import objects.Modal;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public abstract class BaseTest {

    public WebDriver driver;
    public Modal modal = new Modal(driver);
    public Game game = new Game(driver);
    public Keyboard keyboard = new Keyboard(driver);

    @BeforeAll
    void setupClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.nytimes.com/games/wordle/index.html");
        driver.manage().deleteAllCookies();
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }
}
