package mergeTwoSortedLists;

import org.junit.Test;
import org.nielsen.mergeTwoSortedLists.ListNode;
import org.nielsen.mergeTwoSortedLists.MergeTwoSortedLists;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MergeTwoSortedListsTest {

    @Test
    public void mergeTwoSortedListsTest() {
        var list1 = ListNode.fromList(Arrays.asList(1, 2, 4));
        var list2 = ListNode.fromList(Arrays.asList(1, 3, 4, 7));

        var result = MergeTwoSortedLists.mergeTwoLists(list1, list2);

        assertEquals(7, result.size());

        assertEquals(1, result.get(0));
        assertEquals(1, result.get(1));
        assertEquals(2, result.get(2));
        assertEquals(3, result.get(3));
        assertEquals(4, result.get(4));
        assertEquals(4, result.get(5));
        assertEquals(7, result.get(6));
    }
}
