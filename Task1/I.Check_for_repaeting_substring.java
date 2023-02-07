//2. Write a program to print the repeating substring of minimum length 2 in a given sentence.

//same as the red green blue problem instead of deleting and looping just check if its same and print the character

import java.util.Scanner;

class Check_substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        for (int i = 0; i < str.length(); i++) {
            int asciiValue1 = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                int asciiValuen = str.charAt(j);
                if (asciiValue1 == asciiValuen) {
                    str = str.replaceAll("\n", "");
                    System.out.println(str.charAt(j));
                }
            }
        }
    }
}
