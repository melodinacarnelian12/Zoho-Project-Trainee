Using bitflags:



import java.util.Scanner;  
import java.util.Arrays;

class Check_the_number{
    private static void check(int[] arr, int toCheckValue){
        boolean test = false;3
		for (int element : arr) {
			if ((element^toCheckValue)==0) {//using the operator xor 
				test = true;
				break;
			}
		}
		System.out.println("Is " + toCheckValue + " present in the array: " + test);
	}
	public static void main(String[] args)
	{
       Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of number of arrays:");
        int n=sc.nextInt();
         int[] arr = new int[10];  
        System.out.println("Enter the value of arrays:");
	            for(int i=0; i<n; i++)  
                   {  
                      arr[i]=sc.nextInt();  
                    }         
        System.out.println("The value to be checked is:");
		int toCheckValue = sc.nextInt();

		System.out.println("Array: "+ Arrays.toString(arr));
     	check(arr, toCheckValue);
	}
}







