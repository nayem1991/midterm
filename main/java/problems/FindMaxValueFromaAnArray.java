package problems;

import java.util.ArrayList;
import java.util.List;

public class FindMaxValueFromaAnArray {
    public static void main(String[] args) {
        int i, max = 0;
        int arr[] = {10, 20, 30, 55,5};
        for (i = 0; i < 5; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println ( "max number of array :" + max );

    }
}

