package datastructure;

import java.util.HashSet;

public class HashSetDemo {

    /**
     * @author Jahidul Islam
     * Create HashSet and store data
     * Get the data from HashSet and print
     * Get the data from HashSet and insert it in db table
     *
     * */
    public static void main(String[]args){

        HashSet <String> donutsName = new HashSet<String>();
        donutsName.add ( "Boston cream" );
        donutsName.add("cocolate");
        donutsName.add ( "pumkin" );

        System.out.println(donutsName);
        System.out.println("size= "+ donutsName.size ());
    }
}
