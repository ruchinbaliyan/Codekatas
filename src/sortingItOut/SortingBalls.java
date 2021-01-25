package sortingItOut;

import java.util.Set;
import java.util.TreeSet;

public class SortingBalls {
    public static void main(String[] args) {

        int[] array = new int[]{ 5,4,6,2,23,65,12,2};

        Set<Integer> st =new TreeSet<>();
        for(int i =0;i<array.length;i++)
        {
            st.add(array[i]);
            System.out.println(st);
            System.out.println();

        }

    }
}
