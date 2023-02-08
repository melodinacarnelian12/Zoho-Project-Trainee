import java.util.Scanner;
import java.util.Arrays;
public class Main {
public static void removeDuplicates(int[][] array) {
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
                for (int l = 0; l < array.length; l++) {
                    for (int m = 0; m < array[l].length; m++) {
                            if (array[i][j] == array[l][m] && i != l && j != m ) {//cant use the XOR operation must be converted into binary not the integer array 
                                array[l][m] = 0;
                            }
                        }
            }
        }
    }
}
public static int[][] getArray() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int rows = input.nextInt();
    System.out.print("Enter the number of columns: ");
    int columns = input.nextInt();
    int[][] array = new int[rows][columns];
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter the value of array[" + i +"][" + j + "]: ");
                array[i][j] = input.nextInt();
                    String[] bin = new String[10];//The method toBinaryString(int) in the type Integer is not applicable for the arguments (int[])
                    for ( i = 0; i < 10; i++) {
                    bin[i] = Integer.toBinaryString(array[i]);
}
            }
        }
    return array;
}

    public static void main(String[] args) {
        int[][] array = getArray();
        removeDuplicates(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
