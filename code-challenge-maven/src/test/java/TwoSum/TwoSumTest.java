package TwoSum;

import org.junit.Test;
import org.nielsen.twoSum.TwoSum;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TwoSumTest {

    @Test
    public void TwoSumTestCase1() {
        var nums = Arrays.asList(2, 7, 11, 15);
        var target = 13;

        //Act
        var result = TwoSum.run(nums, target);

        //Assert
        assertEquals(0, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    public void TwoSumTestCase2() {
        var nums = Arrays.asList(3, 2, 4);
        var target = 6;

        //Act
        var result = TwoSum.run(nums, target);

        //Assert
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    public void TwoSumTestCase3() {
        var nums = Arrays.asList(3, 3);
        var target = 6;

        //Act
        var result = TwoSum.run(nums, target);

        //Assert
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    public void TwoSumTestCase4() {
        var nums = Arrays.asList(1, 3, 6, 7, 9);
        var target = 10;

        //Act
        var result = TwoSum.run(nums, target);

        //Assert
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
    }

    @Test
    public void TwoSumTestCase5() {
        var nums = new ArrayList<Integer>();
        var target = 2;

        //Act
        var result = TwoSum.run(nums, target);

        //Assert
        assertEquals(0, result.length);
    }
}
