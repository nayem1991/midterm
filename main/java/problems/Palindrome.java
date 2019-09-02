package problems;

public class Palindrome {
    public static void main(String[] args) {
        /**
         *If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
         * Palindrome. So write java code to check if a given String is Palindrome or not.
         *
         **/
        String x1 = "223";

        StringBuffer xy = new StringBuffer ( x1 );
        xy.reverse ();

        if(x1.equals ( xy )) {
            System.out.println ( "Palindrome" );
        }else{
            System.out.println("not a Palindrome");
        }

    }
}
