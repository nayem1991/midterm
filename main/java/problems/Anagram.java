package problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String str1 = "ARMY";
        String str2 = "MARY";
        System.out.println("Booth are Angram"+anagramCheck ( str1,str2 ));
    }

        public static boolean anagramCheck(String str1,String str2){
        char[] charArreyFromstring1=str1.toCharArray ();
            char[] charArreyFromstring2=str2.toCharArray ();
            Arrays.sort (charArreyFromstring1);
            Arrays.sort (charArreyFromstring2);
            return Arrays.equals (charArreyFromstring1, charArreyFromstring2);

    }
}
