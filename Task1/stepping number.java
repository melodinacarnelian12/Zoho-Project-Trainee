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


import java.util.Scanner;

public class stepper {
    static int reverse, temp, temp1, sub, sub1, firstDigit, lastDigit;

    public static boolean singledigit(int c) {
        if (c >= 0 && c <= 9) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean lastfirst(int b) {
        lastDigit = Math.abs(b % 10);
        while (b != 0) {
            firstDigit = Math.abs(b % 10);
            b /= 10;
        }
        sub = firstDigit - lastDigit;
        sub1 = lastDigit - firstDigit;
        if (sub == 1 || sub1 == -1 || sub == -1 || sub1 == 1) {
            return true;
        } else {
            return false;

        }
        // return false;
    }

    public static boolean Step(int a) {
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

    public static void displayStepping(int a, int b) {
        for (int i = a; i <= b; i++)
            if (lastfirst(i) && Step(i) || singledigit(i)) {
                System.out.print(i + " \n");
            }

    }

    public static void main(String[] args) {
        int a = 0, b = 26;
        displayStepping(a, b);
    }

}
