Why Jvm Architecture?
//JVM in Java is the engine that drives the Java Code. It converts Java bytecode into machines language.
//JVM architecture in Java contains classloader, memory area, execution engine etc.
//In JVM, Java code is compiled to bytecode.
//Also performs the task of Garbage Collection.


Why java platform independant?
//Platform=Microprocessor + OS(Intel +Windows)
//Mll=Platform Dependant(will only work in the platform it was compiled)
//Platform independent(hll->java compiler->Bytecode(secured and which is platform independant)->JVM(platform dependant)
//JDK=JRE+JVM(of that particular platform)
  
  
Garbage Collection in Stack?
//Stack is last in first out so there is no need to garbage collect.
  
Stack vs Heap?
//Stack-Method invocations and Local variables live here(LIFO)-Object variables lives on the stack 
//Heap-Objects that would be deleted soon lives here-Object lives on Heap
  
Where is modifiers used in java?
//Access data to other files
//1.Default=Everyone can see it no restrictions(SPECIFIC PACKAGE)
//2.Public=Same as Default (ANYWHERE)
//3.Private=Privated to one class(SPECIFIC CLASS)
//4.Protected=Same package access and can be accessed by other packages with the help of "extends"(SUBSIDING CLASS)

  
Example of these modifiers?
//Default=Package the name of the employee at zoho people
//Public=ur name can be used and can be searched anywhere 
//Privated=ur personal details of your salary is hidden and only can be viewed to one who manages your salary account 
//Protected=your phone number can be accessed by your manager or reporting to member.
  
Where can static class/variables /methods can be used?
1.What is static?
  use global variables inside other classes without the need of creating an object and then refrencing it.
 example:
a)The error:
class Calender{
    int month=12;//global variable
    public static void main(String[] args) {
        int year=2022;
        System.out.println(year);
        System.out.println(month);/*error as non-static variable month cannot be referenced from a static context*/
    }
}
b)how to rectify:
class Calender{
    int month=12;//global variable
    public static void main(String[] args) {
        int year=2022;
        Calender cal=new Calender();//to remove the error we need to create and object and then reference it
        System.out.println(year );
        System.out.println("\n"+cal.month);
    }
}
c)Instead use Static keyword to globally access it:
class Calender{
    static int month=12;//global variable
    public static void main(String[] args) {
        int year=2022;
        System.out.println(year);
        System.out.println(month);
    }
}

2.What is a Static variable and static method  and where can it be used ?
//Can be used when we want to share instances of the same class 
//shared between all objects.
Example:
 class Melo {
     static int m2;//global variable can be accessed anywhere 
    static int age=20;//global variable can be accessed anywhere 
    static int height=140;//global variable can be accessed anywhere 
    static int weight=50;//global variable can be accessed anywhere 
    public static int bmi(){//static method is accessed anywhere inside the given class 
        int bmi;
        bmi=(height/2)+weight;
        return bmi;
    }
    public static void main(String[] args) {
        Melo m1=new Melo();
        m2=m1.bmi();
        System.out.println("The body mass index is " + m2);
    }
 }
//op:The body mass index is 120

3.Why static in public static void main?
//Its a type of a method.Static method can be called without a creation of the object inside the class.
//In general you cant call a method without creating an object.So obviosly you cant call the method "main"
//Hence you use static to call the mainmethod without craeting an object.

  
4.What is a static class and where can it be used?
class ZohoEmployee {//outer class
   private static String name = "Melo";

   public static class Manager {//inner class which is nested 

      public void testMethod() {
         System.out.println("This is a message from nested static class to " + name);
      }
   }
   public static void main(String args[]) {
      ZohoEmployee.Manager nested = new Manager();
      nested.testMethod();//Here, the inner class was able to access the field of the outer class because it is also a static member.
     //If the field is made a non-static variable, there will be a compiler error.
   }
}
//op:This is a message from nested static class to Melo
  
 
Where can Variable scopes can be used ?
1.LOCAL Variable :
public class Main {
  public static void main(String[] args) {
    int x = 100;// can be used only within the brackets 
    System.out.println(x);
  }System.out.println(x);//variable x cant be accessed outside the bracket 
}
//Only given and accessed only within the brackerts.

2.Static Variable:
public class Main {
    static int x = 100;// x is the sam evalue throughout the program 
    public static void main(String[] args) {
    System.out.println(x);
 } 
}
//Can be accessed anywhere without the use of creating the object


3.Instant Variable:(other than static)
//nstance variables are defined outside from any method declaration. 
//They are used to represent the state of the object, and every object of the class has its copy of the instance members.
Example:
class Person{
    int age;
    String name;
    Person(int age,String name){
    //Accessing the instance variable using this keyword.
        this.age=age;
        this.name=name;
    }
    //Method to print the name of the Person
    void printName(){
      System.out.println(this.name);
    }
    public static void main(String args[]){

    //Creating an instance of the class
       Person ob=new Person(20,"Melo");
     //Calling the method of the class
       ob.printName();
    }
}//

  
  
  
  
  
  
  
  
  
  
  
  
  
