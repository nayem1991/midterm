package problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        Set<String>dups = new HashSet<> (  );
        Set<String> set = new HashSet<> (  );

        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        String[] words = st.split ( " " );
        for (String word : words){
            boolean isAdded = set.add ( word );
            if (!isAdded){
                dups.add(word);
            }
        }
        System.out.println(dups);

    }

}
