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

Where is varargs mainly used?
//Varargs help us avoid writing boilerplate code by introducing the new syntax that can handle an arbitrary number of parameters automatically.
//Whenever we dont know the number of arguments to be used.
a)Example:(where no varags are used)
class NoVararg {
    public int sumNumber(int a, int b){
        return a+b;
    }
    public int sumNumber(int a, int b, int c){
        return a+b+c;
    }
    public static void main( String[] args ) {
        NoVararg obj = new NoVararg();
        System.out.println(obj.sumNumber(1, 2));
        System.out.println(obj.sumNumber(1, 2, 3));
    }
}
b)When varargs are used:
class VarargExample {

    public int sumNumber(int ... args){//dont oknow the number of arhuments to be summed up
        System.out.println("argument length: " + args.length);
        int sum = 0;
        for(int x: args){//method or syntax for varags
            sum += x;
        }
        return sum;
    }
    public static void main( String[] args ) {
        VarargExample ex = new VarargExample();
        int sum3 = ex.sumNumber(1, 3, 5);
        System.out.println("sum3 = " + sum3);
        int sum4 = ex.sumNumber(1, 3, 5, 7);
        System.out.println("sum4 = " + sum4);
    }
}
//used in the case where we dont know the number of arguments and have to write code for all the number of avarags present,instead use varags.
//Real time example :Medicinal pill remainder (No matter how many inputs we give at a particular time
//all the inputs should be displayed at the right time)

Why inner classes and where it is used?
//Java inner class or nested class is a class that is declared inside the class or interface.
//We use inner classes to logically group classes and interfaces in one place to be more readable and maintainable.
//It can access all the members of the outer class, including private data members and methods.
Example:
class BankAcct { //outer class
 private class Interest {//inner class which has to be protected
  private double rate;
  void calInterest() {
    double interest = bal * rate/100;
    bal += interest;
    System.out.println("Balance = " +bal);
   }
//To keep the rate of interest private and safe we keep the secured data and methods inside the inner class and its privated.
//And it can access the outer class but the outer class cannot modify the inner class.


 Where anonymous classes are used ?
 class Zoho{
	void display() {
		System.out.println("I work at Zoho");
	}}
public class Main {
public static void main(String[] args) {
		Zoho c = new Zoho()   // anonymous class
				{void display() {
						System.out.println("I dont work at Zoho ");
					}};
				Zoho c2 = new Zoho();
		c.display();//I dont work at Zoho
		c2.display();//I work at Zoho
}
//If nothing is given its going to anonymously produce the data of the main class.
//Hence called anonymous

























Where is abstract classes are used?
Abstact classes are used when a particular in two cases where a particular method has a same function + the same method with different function.  
Example:
abstract class nationality {
    public void laugh() {//same method for all the objects 
        System.out.println("hahahahahahahahahaha");
    }
    public void greet() {//same method for all the objects 
        System.out.println("Greet with a hand shake");
    }
     abstract void talk();//diffirent method for the objects 
     abstract void sayhello();//diffirent method for the objects
}
    class indian extends nationality {
         void talk() {
            System.out.println("India");//diffirent method for indian function 
        }
         void sayhello() {
            System.out.println("Namaste");
        }
    }
    class british extends nationality {
         void talk() {
            System.out.println("england");//diffirent method for british function but with the same method name declared in the abstract
        }
         void sayhello() {
            System.out.println("hello");
        }
    }
public class Main{
    public static void main(String[] args) {
        indian  in = new indian();
        in.sayhello();
        british b=new british();
        b.laugh();
        b.talk();
  }
}

Where interfaces are used ?
Its used in a case where all the methods inside has the same name but the functionality is different.
Example:
interface nationality {
      void talk();//same name of the method but for each object its going to perform a diffirent function 
      void sayhello();
}
    class indian implements nationality {
         public void talk() {
            System.out.println("India");
        }
         public void sayhello() {
            System.out.println("Namaste");
        }
    }
    class british implements nationality {
         public void talk() {
            System.out.println("england");
        }
         public void sayhello() {
            System.out.println("hello");
        }
    }
    
public class Main{
    public static void main(String[] args) {
        indian in = new indian(); 
        in.talk();
        in.sayhello();
        british b=new british();
        b.talk();
        b.sayhello();  
    }
}

	
Where is enum used ?
//An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
Example:
//Days of the week is unchanged
//months are unchanged 
Syntax:
enum Level {
  LOW,
  MEDIUM,
  HIGH
}
Level a = Level.MEDIUM;

Where enums are not used?
//Cannot be used in the case of single objects 
//Also when the particular objected has to be changed or mutable.



	






  

  
  
  
  
  
  
  
  
  
  
  
  
  
