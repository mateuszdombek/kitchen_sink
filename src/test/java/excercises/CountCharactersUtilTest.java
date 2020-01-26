package excercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountCharactersUtilTest {

    @Test
    public void countTest() {
        //Given and When
        int number_of_chars = CountCharactersUtil.count("abcd");
        //Then
        assertEquals(number_of_chars, 4);
        System.out.println("test");
    }
}
