package problems;

import java.util.Scanner;

public class GenerateMultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
        int num;
        System.out.print ( "Enter any number : " );
        num = input.nextInt ();

        for (int i = 1; i <= 10; i++) {
            System.out.println ( num + " X " + i + " =" + num * i );

        }
    }
}