package karateChop02;

public class KarateChop {

    public int chopRecursive(int find, int[] array) {
        if(array == null || array.length == 0)
            return -1;
        else
            return chopRecursive(find, array, 0, array.length - 1);
    }

    public int chopRecursive(int find, int[] array, int start, int end) {
        if(start > end) return -1;

        int mid = (start + end) / 2;

        if(array[mid] > find)
            return chopRecursive(find, array, start, mid - 1);
        else if(array[mid] < find)
            return chopRecursive(find, array, mid + 1, end);
        else
            return mid;
    }

    public int chopIterative(int find, int[] array) {
        if(array == null || array.length == 0) return -1;
        else {
            int start = 0;
            int end = array.length - 1;

            while(start <= end) {
                int mid = (start + end) / 2;

                if(array[mid] > find)
                    end = mid - 1;
                else if(array[mid] < find)
                    start = mid + 1;
                else
                    return mid;
            }
        }

        return -1;
    }
}
