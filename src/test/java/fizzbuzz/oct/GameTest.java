package fizzbuzz.oct;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author pi
 * @date 2020/10/27 10:43 PM
 **/
public class GameTest {

    @Test
    public void should_should_create_game_object_with_given_size() throws Exception {
        Game game = new Game(100);
        assertThat(game.size(), is(100));
    }

    @Test
    public void should_provide_words_to_be_spoken() throws Exception {
        Game game = new Game(100);
        List<String> wordsToBeSpoken = game.words();
        assertThat(wordsToBeSpoken.size(), is(100));
        assertThat(wordsToBeSpoken.get(0), is("1"));
    }

    @Test
    public void should_say_fizz_when_raw_number_is_13() throws Exception {
        assertThat(new GameNumber(13).toString(),is("Fizz"));
    }
}
