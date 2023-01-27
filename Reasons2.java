//What is the meaning of the main method in java ?
        "public static void main(String args[])"
         --> Public : To call by JVM anywhere.That is to call this method anywhere in the JVM.
         --> Static : Methods can be used or called, only when an objcet is created.
                      So without the need of craeting an object and calling the method main,Static keyword is used.
                      Also signifies "main" method doesnt belong to an object.
         --> Void   : This particular method doesnt return anything.
         --> Main   : The name main is configured my the JVM that wherever the main is located in the program it should start from there.
         -->String[]: Going to use an array of String type and considered as teh command line arguments.
         -->args    : Just a keyword to give the name of the array String.
                      Can be typed into the program on the terminal directly.
        Example:
        public class Test1 {
            public static void main(String args[]) {
                System.out.println("Enter the string:");
                for(String i : args)//for each loop 
                {
                    System.out.println(i);
                }      
            }    
        }
If the same syntax is not followed in the code for the main method then "NOSUCHMETHODERROR" will be shown.

//How to compile a code in java terminal(backend)?
 //Compile Time:
1.Java code (File-java.java)\
2.Invoke the java compiler -"javac myprogram.java" (syntax errors)
3.Bytecode stage -if no error the code is changed to bytecode(java myprogram).class 
 
 //Run time:
1.JVM 
class loader- loads into memory 
byte code verification- errors or bugs 
2.Interpreter - line by line verification 
3.Jit(Just in time) compiler- for faster execution (optimizable and more effiecient)
4.JRE(java run time environment)-will have some libraries 
3.OS or Hardware 

//Why there is no multiple inheritance in java ?
 Ambiguity problem: if who classes has a overiden method then a third class extending these two 
 classes wont know which class mathod should be used !
Example:
                import java.util.*;  
                public int  add(){  
                    System.out.println("Please enter your first num");
                    int a =sc.nextInt();
                    System.out.println("Please enter your second num");
                    int b =sc.nextInt();
                    a=a+b;
                        System.out.println(a);
                    return a; 
                }  
                public int  sub(){
                    System.out.println("Please enter your first num");
                    int a =sc.nextInt();
                    System.out.println("Please enter your second num");
                    int b =sc.nextInt();
                    a=a-b;
                    System.out.println(a);
                   return a;
                }
                class math implements add,sub{  
                Scanner sc= new Scanner(System.in);
                public static void main(String args[]){  
                  math answer= new math();
                  answer.add();
                 answer.sub();
                }
                }  
 
//why only Interface is used in inheritance?
Interface is a set of specifications or statements that define what a class can do without specifying how the class will do it. 
Hence the main function is only defined in a class and not on the interface!
Example:
                import java.util.*;  
                interface add{  
                int add();  
                }  
                interface sub{
                int sub();
                }
                class math implements add{  
                Scanner sc= new Scanner(System.in);
                public int add(){
                    System.out.println("Please enter your first num");
                    int a =sc.nextInt();
                    System.out.println("Please enter your second num");
                    int b =sc.nextInt();
                    a=a+b;
                        System.out.println(a);
                    return a;

                }
                public  int  sub(){
                    System.out.println("Please enter your first num");
                    int a =sc.nextInt();
                    System.out.println("Please enter your second num");
                    int b =sc.nextInt();
                    a=a-b;
                    System.out.println(a);
                   return a;
                }
                public static void main(String args[]){  
                  math answer= new math();
                  answer.add();
                 answer.sub();
                }
                }  

//Why object wrappers and why is it needed?
     Wrapper Class will convert primitive data types into objects.
     In java we cant intake a primitive data type as int hence we must convert everything as objects.
     Hence these data types are wrapped around objects with object wrappers.
     //Data structures in the Collection framework such as ArrayList and Vector store only the objects (reference types) and not the primitive types.
     //The object is needed to support synchronization in multithreading.
       
 //1.Autoboxing with example:
                import java.util.*;
                public class AutoBoxingTest {
                    public static void main(String args[]) {
                       int num = 1000; //
                       Integer obj = Integer.valueOf(num); 
                       System.out.println(num + " " + obj);
                    }
                 }
//2.Unboxing with example:
               public class UnboxingTest {
               public static void main(String args[]) {
                  Integer obj = new Integer(1000); 
                  int num = obj.intValue(); 
                  System.out.println(num + " " + obj);
               }
            }
//When to use comparable and comparator?
      if sorting of objects needs to be based on natural order then use Comparable 
      whereas if you sorting needs to be done on attributes of different objects, 
      then use Comparator in Java.
      One object --> use comparable
      Many object --> use comparator
              comparable:                         comparator:
              homogenous data                     hetrogenous as well as homogenous data to sort
              java.lang package                   java util package 
              one method :                        Two methods:
                 CompareTo(obj)                         compare(o1,o2)
                                                        equals(obj)
              affects original class              doesnt affects original class 
                
Eaxmple of comparable:
            import java.io.*;
            import java.util.*;
            class Icecream implements Comparable<Icecream>
            {
                double rating;
                 String name;
                 int year;
            public int compareTo(Icecream m)
                {
                    return this.year - m.year;
                }
            public Icecream(String nm, double rt, int yr)
                {
                    this.name = nm;
                    this.rating = rt;
                    this.year = yr;
                }
             double getRating() { return rating; }
             String getName()   {  return name; }
             int getYear()      {  return year;  }
            }

            class Main
            {
                public static void main(String[] args)
                {
                    ArrayList<Icecream> list = new ArrayList<Icecream>();
                    list.add(new Icecream("Chocolate", 8.3, 2001));
                    list.add(new Icecream("Vanilla", 8.7, 2000));
                    list.add(new Icecream("Butterscotch", 8.8, 2009));
                    list.add(new Icecream("Bluberry", 8.4,2005));

                    Collections.sort(list);

                    System.out.println("Icecream after sorting : ");
                    for (Icecream icecream: list)
                    {
                        System.out.println(icecream.getName() + " \n" +
                                           icecream.getRating() + " " +
                                           icecream.getYear());
                    }
                }
            }

Example of comparator:
            import java.io.*;
            import java.util.*;
            class Icecream implements Comparable<Icecream>
            {
                double rating;
                 String name;
                 int year;
            public int compareTo(Icecream m)
                {
                    return this.year - m.year;
                }
            public Icecream(String nm, double rt, int yr)
                {
                    this.name = nm;
                    this.rating = rt;
                    this.year = yr;
                }
             double getRating() { return rating; }
             String getName()   {  return name; }
             int getYear()      {  return year;  }
            }
            class RatingCompare implements Comparator<Icecream>
            {
                public int compare(Icecream m1, Icecream m2)
                {
                    if (m1.getRating() < m2.getRating()) return -1;
                    if (m1.getRating() > m2.getRating()) return 1;
                    else return 0;
                }
            }

            class Main
            {
                public static void main(String[] args)
                {
                    ArrayList<Icecream> list = new ArrayList<Icecream>();
                    list.add(new Icecream("Chocolate", 8.3, 2001));
                    list.add(new Icecream("Vanilla", 8.7, 2000));
                    list.add(new Icecream("Butterscotch", 8.8, 2009));
                    list.add(new Icecream("Bluberry", 8.4,2005));

                    Collections.sort(list);

                    System.out.println("Icecream after sorting : ");
                    for (Icecream icecream: list)
                    {
                        System.out.println(icecream.getName() + " \n" +
                                           icecream.getRating() + " " +
                                           icecream.getYear());
                    }
                    System.out.println("\nSorted by rating ");
                    RatingCompare ratingCompare = new RatingCompare();
                   Collections.sort(list, ratingCompare);
                    for (Icecream icecream: list)
                        System.out.println(icecream.getYear() + "\n " +
                                           icecream.getRating() + " " +
                                           icecream.getName()+" ");
                }
            }













  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  





