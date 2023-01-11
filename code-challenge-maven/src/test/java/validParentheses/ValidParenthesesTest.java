package validParentheses;

import org.junit.Test;
import org.nielsen.validParentheses.ValidParentheses;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertFalse;

public class ValidParenthesesTest {

    @Test
    public void isValidParenthesesTest() {
        var valid = Arrays.asList("{[]}", "(([]))", "{([])}", "[[[]]]", "{}", "()");
        var listAssert = new ArrayList<Boolean>();

        //Act
        valid.forEach(str -> listAssert.add(ValidParentheses.isValid(str)));
        //Assert
        assertFalse(listAssert.contains(false));
    }

    @Test
    public void isInvalidValidParenthesesTest() {
        var invalid = Arrays.asList("{[]", "(([])))", "{([{])}", "}", "", "()}]");
        var listAssert = new ArrayList<Boolean>();

        //Act
        invalid.forEach(str -> listAssert.add(ValidParentheses.isValid(str)));
        //Assert
        assertFalse(listAssert.contains(true));
    }
}
