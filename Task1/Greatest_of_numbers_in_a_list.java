3.Write a program to traverse an array from left to right and replace each number with the next greater number present within the remaining elements from its position. For example, from (4, 9, 23, 7) the next greater number to 4 is 7. If no such number is found, then replace the remaining array elements with -1.

Examples:

Input: 2, 5, 7
Output: 5, 7, -1

Input: 2, 4, 8, 90, 77, 54
Output: 4, 8, 54, -1, -1, -1

Input: 2, -1, 0, -1, 3
Output: 3, 0, 3, 3, -1


class Greatest_of_numbers_in_a_list
{
    public static void greternumber(int[] num)
    {
        if (num == null) {
            return;
        }
        for (int i = 0; i < num.length; i++)
        {
            int next = -1;
            for (int j = i + 1; j < num.length; j++)
            {

                if (num[j] > num[i])
                {
                    next = num[j];
                    break;
                }
            }
 
            System.out.print(next + " ");
        }
    }
 
    public static void main(String[] args)
    {
        int[] num = { 2, 4, 8, 90, 77, 54 };
       greternumber(num);
    }
}
