1.Reverse the number in java without inbuilt functions

import java.util.Scanner;
public class Reverse_the_number 
{
    static int remainder, reverse;
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reveresed: ");
        int number = sc.nextInt();
        while (number != 0) 
        {
            remainder = number % 10;// 4 //3 //2 //1
            reverse = reverse * 10 + remainder;// 4 //43 //432 //4321
            number = number / 10;// 123 //12 //1 //0
        }
        System.out.println("The number reversed is:" + reverse);
    }
}

Formula:
rem=num%10(remainder)
rev=rev*10+rem(adding the values of reverse)
num=num/10(delete that number after reversing)
