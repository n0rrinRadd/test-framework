package tests.setup;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;


public abstract class GameSetup extends BaseTest {

    @BeforeEach
    void setupTest() {
        modal.close.click();
    }
}
