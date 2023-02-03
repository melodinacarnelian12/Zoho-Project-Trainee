3.Given an array of 0s and 1s. Write a program to find the largest sub-array (start
and end index) that has the equal number of 0s and 1s.

Examples:

Input: {1, 0, 1, 1, 1, 0, 0, 0}
Output: 0 to 7

Input: {1, 0, 1, 1, 1, 0, 0}
Output: 1 to 6

Input: {1,1,1}
Output: No sub-array found.
  
  
  class Subarray {
	int find(int arr[], int n)
	{
		int sum = 0;
		int max= -1, start = 0;
		int end = 0;
		for (int i = 0; i < n - 1; i++) {
			sum = (arr[i] == 0) ? -1 : 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] == 0)
					sum += -1;
				else
					sum += 1;
				if (sum == 0 && max < j - i + 1) {
					max = j - i + 1;
					start = i;
				}
			}
		}
		end = start+ max - 1;
		if (max == -1)
			System.out.println("False");
		else
			System.out.println(start + " to " + end);
		return max;
	}
	public static void main(String[] args)
	{
		Subarray sub;
		sub = new Subarray();
		int arr[] = { 0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0};
		int size = arr.length;

		sub.find(arr, size);
		System.out.println(arr.length);
	}
}


//using 0 as -1 and 1 as 1 and summing all the values to get 0 
//until it gets 0 the start and end array index is printed 
