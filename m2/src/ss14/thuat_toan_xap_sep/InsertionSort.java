package ss14.thuat_toan_xap_sep;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
      int[] array ={1,5,3,6,2};
      insertionSort(array);
        System.out.println(Arrays.toString(array));

    }
    public static void insertionSort(int[] array){
        int pos;
        int x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
        }
    }
}
