import java.util.Scanner;

public class Matrix {
    int[][] matrix;
    int size;

    public Matrix(int size) {
        this.size = size;
        matrix = new int[size][size];
    }

    public void moveLeft() {
        for (int i = 0; i < size; i++) {
            int z = 0;
            int j = 0;
            while (j < size) {
                if (matrix[i][j] == 0) {
                    z++;
                } else {
                    if (j > z) {
                        matrix[i][j - z] = matrix[i][j];
                        matrix[i][j] = 0;
                    }
                    if (j + 1 < size && matrix[i][j] == matrix[i][j + 1]) {
                        matrix[i][j - z] = 2 * matrix[i][j];
                        z++;
                        j++;
                    }
                }
                j++;
            }
            for (int k = size - z; k < size; k++) {
                matrix[i][k] = 0;
            }
        }
    }

    public void moveRight() {
        for (int i = 0; i < size; i++) {
            int z = 0;
            int j = size - 1;
            while (j >= 0) {
                if (matrix[i][j] == 0) {
                    z++;
                } else {
                    if (j < size - z - 1) {
                        matrix[i][j + z] = matrix[i][j];
                        matrix[i][j] = 0;
                    }
                    if (j - 1 >= 0 && matrix[i][j] == matrix[i][j - 1]) {
                        matrix[i][j + z] = 2 * matrix[i][j];
                        z++;
                        j--;
                    }
                }
                j--;
            }
            for (int k = 0; k < z; k++) {
                matrix[i][k] = 0;
            }
        }
    }

    public void moveUp() {
        for (int j = 0; j < size; j++) {
            int z = 0;
            int i = 0;
            while (i < size) {
                if (matrix[i][j] == 0) {
                    z++;
                } else {
                    if (i > z) {
                        matrix[i - z][j] = matrix[i][j];
                        matrix[i][j] = 0;
                    }
                    if (i + 1 < size && matrix[i][j] == matrix[i + 1][j]) {
                        matrix[i - z][j] = 2 * matrix[i][j];
                        z++;
                        i++;
                    }
                }
                i++;
            }
            for (int k = size - z; k < size; k++) {
                matrix[j][k] = 0;
            }
        }
    }

    public void moveDown() {
        for (int j = 0; j < size; j++) {
            int z = 0;
            int i = size - 1;
            while (i >= 0) {
                if (matrix[i][j] == 0) {
                    z++;
                } else {
                    if (i < size - z - 1) {
                        matrix[i + z][j] = matrix[i][j];
                        matrix[i][j] = 0;
                    }
                    if (i + 1 < size && matrix[i][j] == matrix[i + 1][j]) {
                        matrix[i + z][j] = 2 * matrix[i][j];
                        z++;
                        i--;
                    }
                }
                i--;
            }
            for (int k = size - z; k < size; k++) {
                matrix[j][k] = 0;
            }
        }

    }

    public void insertAt(int i, int j, int value) {
        matrix[i][j] = value;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int size = sc.nextInt();
        Matrix mat = new Matrix(size);

        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mat.insertAt(i, j, sc.nextInt());
            }
        }

        System.out.println("Original Matrix: ");
        mat.display();
        mat.moveLeft();
        mat.moveRight();
        System.out.println("Matrix after moving all elements : ");
        mat.display();
    }
}
