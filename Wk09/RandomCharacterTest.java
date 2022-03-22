package Wk09;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RandomCharacterTest {
    @Test
    public final void testLowerCaseLetter() {
        char r = RandomCharacter.getRandomLowerCaseLetter();
        assertTrue(r >= 97 && r <= 122);
    }

    @Test
    public final void testUpperCaseLetter() {
        char r = RandomCharacter.getRandomUpperCaseLetter();
        assertTrue(r >= 65 && r <= 90);
    }

    @Test
    public final void testDigitCharacter() {
        char r = RandomCharacter.getRandomDigitCharacter();
        assertTrue(r >= 48 && r <= 57);
    }

    @Test
    public final void testCharacter() {
        char r = RandomCharacter.getRandomCharacter();
        assertTrue(r>=33 && r <= 47);
    }
}
