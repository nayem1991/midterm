package problems;

import java.util.Scanner;

public class FindFactorials {
    /**
     * factorials of n n! = 1 * 2 * 3 * ......* n
     */

    public static void main(String[] args) {
        Scanner Joy = new Scanner ( System.in );
        int num, fact = 1;
        System.out.print ( "Enter any Number : " );
        num = Joy.nextInt ();

        for (int i = num; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println ( "Factorial =" + fact );
    }
}
