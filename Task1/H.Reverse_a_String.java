1. Write a program to reverse the given string

//Ny just using the reverse in a for loop 
import java.lang.*;
import java.io.*;
import java.util.*;

class Reversing_a_string {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the string to be reversed: ");
		String str= sc.nextLine();  
		char[] ch = str.toCharArray();//convert to char

		for (int i = ch.length - 1; i >= 0; i--)//printing in reverse order
			System.out.print(ch[i]);
	}
}
