package datastructure;

public class TwoDimensionalArrayDemo {

    /**
     * @author Jahidul Islam
     * Construct Two Dimensional array reference variable and
     * store all the data of testData.xlsx from data directory
     * You do not have to read xlsx file only the similar data need to be
     * stored in 2D Array reference variable
     * Later get those value by index and also by using any iteration process
     *
     *  */
    public static void main(String[] args){

        int[] [] number = new int [2] [3];
        number [0] [0] = 13;
        number [0] [1] = 34;
        number [1] [2] = 24;
        number [1] [1] = 35;
        number [1] [2] = 50;

        for (int row = 0; row < 2;row++){
            for (int col = 0; col <3; col++){
                System.out.print(" "+number[row] [col]);
            }
            System.out.println();
        }
    }
}
