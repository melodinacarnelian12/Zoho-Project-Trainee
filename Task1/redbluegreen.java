import java.util.Scanner;
class Stringcombine
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        while(str != null && !str.isEmpty())
        {
            for (int i = 0; i < 1; i++) 
            {
                int asciiValue1 = str.charAt(i);
                for (int j = i; j < str.length(); j++) 
                {
                    int asciiValuen = str.charAt(j);
                    if (asciiValue1 == asciiValuen)
                    {
                        str = str.replaceAll("\n", "");
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
