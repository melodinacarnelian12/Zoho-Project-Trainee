1. Find the Kth largest and Kth smallest number in an array. Get the array and k as input

//using swapping and sorting the values to find the first and the last element 

import java.util.Scanner;
public class Kth_value
{
    static int temp;
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kth value(number of elements in an array):");
        int n=scan.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter "+n+ " K integer values:");
        for(int i=0; i < n; i++) 
        {
          arr[i] = scan.nextInt();
          System.out.print(arr[i]+"\n");
        }
        for (int i=0; i <n; i++) 
        {//sorting 
             for(int j = i+1; j<n; j++)
             {
                if(arr[i]>arr[j])
                {//whichever is lesser to the firstindex
                   temp = arr[i];
                   arr[i] = arr[j];//swapping function 
                   arr[j] = temp;
                }
             }
        }System.out.print("The Kth smallest value is "+arr[0]+"\n");
        System.out.print("The Kth largest value is "+arr[n-1]+"\n");
    }
}
