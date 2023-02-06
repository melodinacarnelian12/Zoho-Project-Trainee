5.Given an mixed array of Red, Blue and Green colour balloons, arrange all the same colour balloons together by maintaining the order of colours based on first occurrence in the input array.
Input: arr[] = {R, G, B, G, B, G, R}
Output:{R, R, G, G, G, B, B}

Input: arr[] = {B, G, B, R, G, R, B, G, R, R, B}
Output: {B, B, B, B, G, G, G, R, R, R, R}



Approach A:
import java.util.Scanner;
class Stringcombine
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        while(str != null && !str.isEmpty())
        {
            for (int i = 0; i < 1; i++) //get the first element 
            {
                int asciiValue1 = str.charAt(i);//get the ascii value of the first element
                for (int j = i; j < str.length(); j++) //compare with other elements of the array 
                {
                    int asciiValuen = str.charAt(j);//get the ascii value of it 
                    if (asciiValue1 == asciiValuen)//if both asciis are equal
                    {
                        str = str.replaceAll("\n", "");
                        System.out.println(str.charAt(j));//print it 
                    }
                }
                char k = (char) asciiValue1;
                String h = String.valueOf(k);
                str = str.replace(h, "");
            }
        }
    }
}




or


Approach B:
//USING arrays and printing in order 

import java.util.Scanner;
import java.util.Arrays;

class String_combine {
    static String str;

    public static void main(String[] args) {
        String sb[] = { "B", "G", "B", "R", "G", "R", "B", "G", "R", "R", "B" };
        StringBuffer stra = new StringBuffer();
        for (int i = 0; i < 1; i++) {
            stra.append(sb[i]);
            str = Arrays.toString(sb);
        }
        System.out.println(str);
        str = str.replace(",", "");
        str = str.replace("[", "");
        str = str.replace("]", "");
        str = str.replace(" ", "");
        str = str.replaceAll("\n", "");
        while (str != null && !str.isEmpty()) {
            for (int i = 0; i < 1; i++) {
                int asciiValue1 = str.charAt(i);
                for (int j = i; j < str.length(); j++) {
                    int asciiValuen = str.charAt(j);
                    if (asciiValue1 == asciiValuen) {
                        System.out.println(str.charAt(j));
                    }
                }
                char k = (char) asciiValue1;
                String h = String.valueOf(k);
                str = str.replace(h, "");
            }
        }
    }
}
