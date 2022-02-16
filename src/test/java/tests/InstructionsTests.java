package tests;

import objects.Modal;
import org.junit.jupiter.api.Test;
import tests.setup.InstructionsSetup;

import static org.assertj.core.api.Assertions.assertThat;

public class InstructionsTests extends InstructionsSetup {

    Modal modal = new Modal(driver);

    @Test
    public void testExitAlert(){
        modal.close.click();
        assertThat(modal.content.isDisplayed()).isFalse();
    }
}
