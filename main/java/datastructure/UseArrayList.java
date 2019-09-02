package datastructure;

import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {

		/**
		 * @author Jahidul Islam
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<Integer> number = new ArrayList<Integer>();
		System.out.println("size = "+number.size () );

		number.add(23);
		number.add(53);
		number.add(73);
		number.add(63);

		System.out.println(number);
		System.out.println("size = "+number.size());
	

	}

}
