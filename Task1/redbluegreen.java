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




or




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
