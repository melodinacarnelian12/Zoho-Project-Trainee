1.Reverse the number in java without inbuilt functions

Approach A:
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

    
    
Approach B:
import java.util.*;
import java.util.stream.*;
public class Reverse_the_integer_array
{
    public static void main(String[] args) 
    {
        Integer[] intArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Original Array:");
        for(int i=0;i<intArray.length;i++)
            System.out.print(intArray[i] + "  ");
            System.out.println();
            System.out.println("Reversed Array:");
            for(int i=intArray.length-1;i>=0;i--)
                System.out.print(intArray[i] + "  ");
    }
}


Formula:
i=end;i=start;i--(function=decrement)
    
