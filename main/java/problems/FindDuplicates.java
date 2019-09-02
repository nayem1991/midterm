package problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

    /**
     * Write Code To Filter Duplicate Elements From An Array?
     * */


    public static void main(String[] args) {
        String duplicates[]=new String[]{"Zahid","Nayem","Rahul","Midul","Zahid"};
        Set nonDuplicatesSet=new HashSet<>(  );
        Set duplicatesSet=new HashSet<> (  );
        for (String string : duplicates){

            if(!nonDuplicatesSet.contains ( string )){
                nonDuplicatesSet.add(string);

            }else{
                duplicatesSet.add(string);
            }
        }
        System.out.println(duplicatesSet);

    }
}