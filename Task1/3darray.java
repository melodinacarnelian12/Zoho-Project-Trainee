import java.util.Scanner;
import java.util.Arrays;
public class Main {
public static void removeDuplicates(int[][] array) {
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
                for (int l = 0; l < array.length; l++) {
                    for (int m = 0; m < array[l].length; m++) {
                            if (array[i][j] == array[l][m] && i != l && j != m ) {
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
                    String[] bin = new String[10];
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











or 







import java.util.Scanner;
import java.util.Arrays;

public class Sudo1 {
    public static void removeDuplicates(int[][][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    for (int l = 0; l < array.length; l++) {
                        for (int m = 0; m < array[l].length; m++) {
                            for (int n = 0; n < array[l][m].length; n++) {
                                if (array[i][j][k] == array[l][m][n] && i != l && j != m && k != n) {
                                    array[l][m][n] = 0;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static int[][][] getArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();
        System.out.print("Enter the number of depth: ");
        int depth = input.nextInt();
        int[][][] array = new int[rows][columns][depth];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print("Enter the value of array[" + i + "][" + j + "][" + k + "]: ");
                    array[i][j][k] = input.nextInt();
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][][] array = getArray();
        removeDuplicates(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}










or



import java.util.Scanner;
import java.util.Arrays;

import java.util.*;
import java.lang.*;
public class supper {
    private byte[] convertIntArrayToByteArray(int[] data) {
        if (data == null)
            return null;
        byte[] byts = new byte[data.length * 4];
        for (int i = 0; i < data.length; i++){
    System.arraycopy(convertIntToByteArray(data[i]), 0, byts, i *4, 4);
       } return byts;
    }

    public static void removeDuplicates(int[][][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    for (int l = 0; l < array.length; l++) {
                        for (int m = 0; m < array[l].length; m++) {
                            for (int n = 0; n < array[l][m].length; n++) {
                                if (array[i][j][k] == array[l][m][n] && i != l && j != m && k != n) {
                                    array[l][m][n] = 0;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * @return
     */
    public static int[][][] getArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();
        System.out.print("Enter the number of depth: ");
        int depth = input.nextInt();
        int[][][] array = new int[rows][columns][depth];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print("Enter the value of array[" + i + "][" + j + "][" + k + "]: ");
                    array[i][j][k] = input.nextInt();
                    final supper s = new supper();
                  //  convertIntArrayToByteArray(int[i][j][k]);
                  s.convertIntArrayToByteArray(array[i][j]);
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][][] array = getArray();
        removeDuplicates(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
