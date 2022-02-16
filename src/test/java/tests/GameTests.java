package tests;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tests.setup.GameSetup;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTests extends GameSetup {

    @Test
    public void testTitle(){
        Assertions.assertThat(game.title.getText().equals("Wordle")).isTrue();
    }

    @Test
    public void testGameBoardExistsAndRowsAndColumns(){
        Assertions.assertThat(game.board.isDisplayed()).isTrue();
        List<WebElement> rows = game.board.findElements(By.cssSelector(".row"));
        assertThat(rows.size()==5);
        for (WebElement row : rows){
            assertThat(row.findElements(By.tagName("game-tile")).size()==5);
        }
    }

    @Test
    public void testInvalidWordValidationMessage(){
        keyboard.EnterWord("chris");
        Assertions.assertThat(modal.message.isDisplayed()).isTrue();
        Assertions.assertThat(modal.message.getText().contains("not in word list")).isTrue();
    }

    @Test
    public void testValidWordValidationMessage(){
        keyboard.EnterWord("modal");
        Assertions.assertThat(modal.message.isDisplayed()).isFalse();
    }
}
