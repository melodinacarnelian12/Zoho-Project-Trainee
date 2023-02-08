/*2.A number is called stepping number if all of its adjacent digits, as well as the
first and the last digits, differ by one.
For example, 8789 is a stepping number whereas 234 is not. A single digit number is considered as a stepping number.
Write a program to find all the stepping numbers in a given range.
Examples:
Input:  4000, 5000
Output: 4323, 4343, 4345, 4543, 4545, 4565

Input: 0, 21
Output: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 21

Input: 100, 150
Output: No stepping numbers*/

Approach 1:
import java.util.Scanner;

public class stepper {
    static int reverse, temp, temp1, sub, sub1, firstDigit, lastDigit;

    public static boolean Singledigit(int c) {
        if (c >= 0 && c <= 9) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean LastFirst(int b) {
        lastDigit = b % 10;
        while (b != 0) {
            firstDigit = b % 10;
            b /= 10;
        }
        sub = firstDigit - lastDigit;
        sub1 = lastDigit - firstDigit;
        if (sub == 1 || sub1 == -1 || sub == -1 || sub1 == 1) {
            return true;
        } else {
            return false;

        }
    }

    public static boolean AdjascentValues(int a) {
        while (a != 0) {
            temp = a % 10;
            a = a / 10;
            temp1 = a % 10;
            sub = temp - temp1;
            sub1 = temp1 - temp;

            if (sub == 1 || sub1 == -1 || sub == -1 || sub1 == 1) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static void Display_the_stepping_number(int a, int b) {
        for (int i = a; i <= b; i++)
            if (LastFirst(i) && AdjascentValues(i) || Singledigit(i)) {
                System.out.print(i + " \n");
            }

    }

    public static void main(String[] args) {
        int a = 0, b = 100;
        Display_the_stepping_number(a, b);
    }

}







