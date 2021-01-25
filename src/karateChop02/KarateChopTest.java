package karateChop02;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KarateChopTest {
    @Test
    public void testRecursiveChop() throws Exception {
        int[] array = new int[]{1, 2, 3, 4, 5, 7, 8};
        KarateChop kata = new KarateChop();

        assertEquals(kata.chopRecursive(1, new int[]{}), -1);
        assertEquals(kata.chopRecursive(1, null), -1);
        assertEquals(kata.chopRecursive(-1, null), -1);
        assertEquals(kata.chopRecursive(1, array), 0);
        assertEquals(kata.chopRecursive(2, array), 1);
        assertEquals(kata.chopRecursive(3, array), 2);
        assertEquals(kata.chopRecursive(4, array), 3);
        assertEquals(kata.chopRecursive(5, array), 4);
        assertEquals(kata.chopRecursive(6, array), -1);
        assertEquals(kata.chopRecursive(0, array), -1);

    }

    @Test
    public void testIterativeChop() throws Exception {
        int[] array = new int[]{1, 2, 3, 4, 5};
        KarateChop kata = new KarateChop();

        assertEquals(kata.chopIterative(1, array), 0);
        assertEquals(kata.chopIterative(2, array), 1);
        assertEquals(kata.chopIterative(3, array), 2);
        assertEquals(kata.chopIterative(4, array), 3);
        assertEquals(kata.chopIterative(5, array), 4);
        assertEquals(kata.chopIterative(6, array), -1);
        assertEquals(kata.chopIterative(0, array), -1);
        assertEquals(kata.chopIterative(1, new int[]{}), -1);
        assertEquals(kata.chopIterative(1, null), -1);
        assertEquals(kata.chopIterative(-1, null), -1);
    }
}
