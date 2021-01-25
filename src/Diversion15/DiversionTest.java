package Diversion15;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// to find the number of binary numbers with length n ,which do not have two consecutive 1's
public class DiversionTest {
    @Test
    public void TestDiversion()
    {
        assertEquals( Diversion.findNumber(2),3);
        assertEquals( Diversion.findNumber(3),5);



    }


}
