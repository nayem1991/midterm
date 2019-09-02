package problems;

import org.apache.poi.ss.formula.functions.Count;

import java.util.Scanner;

public class FindPrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner ( System.in );
        System.out.print("Enyter any positive number : ");
        int num = input.nextInt ();
        int count =0;

        for (int i = 2; i < num; i++) {
            if (num%i==0) {
                count++;
                break;
            }
        }
        if(count==0) {
            System.out.println ( "prime number" );
        }else{
            System.out.println("not prime");
        }

    }
}
