/**
 * Created by qwmqza on 2017/9/8.
 */
public class InsertionSort {
    public int[] insertionsortnond (int [] inputarray) {
        int [] rt = new int [inputarray.length];
        rt[0] = inputarray[0];
        for (int i = 1; i < rt.length; i++) {
            int j = i;
            while (j > 0 && rt[j] < rt[j - 1] ) {
                rt[j] = rt[j - 1];
                rt[j - 1] = inputarray[j];
                j--;
            }
        }
        return rt;
    }
}
