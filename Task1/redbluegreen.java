
import java.util.Scanner;
class Stringcombine 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ch=sc.next();
        while(str){
         for(int i=0; i<1; i++)
           {
              int asciiValue1 = str.charAt(i);
              
               for(int j=i; j<str.length(); j++)
                   {
                      int asciiValuen = str.charAt(j);
                      if(asciiValue1==asciiValuen)
                      {
                         System.out.println(str.charAt(j));
                      }
                      
                   }str=str.replace(ch,"");
                   System.out.println(str);
           }    
          }
         }
    }
