package datastructure;

import java.util.Hashtable;

public class HashTable {

    /**
     * SHow your understanding on HashTable
     * Use some methods from HashTable Class
     * */
    public static void main(String[] args) {
        Hashtable<String, String> Employees = new Hashtable<String, String> ();
        Employees.put ( "one", "Nayem" );
        Employees.put ( "twe", "Midul" );
        Employees.put ( "three", "Rahul" );

        for (String itm : Employees.keySet ())
        {
            System.out.println(itm + " " + Employees.get ( itm ));
        }

    }
}
