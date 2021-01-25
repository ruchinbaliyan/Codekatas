package sortingItOut;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class SortingcharTest {
    @Test
    public void SortcharTest() throws IOException {
        SortingChar obj =new SortingChar();
        obj.loadWords();
        assertEquals(obj.printSorted(),"aaaaabbbbcccdeeeeeghhhiiiiklllllllmnnnnooopprsssstttuuvwyyyy");



    }


}
