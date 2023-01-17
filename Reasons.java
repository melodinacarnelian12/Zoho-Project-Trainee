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

What is LAMBDA EXPRESSION?
//They accept a set of parameters as input and return a value as an output.
//Doesnt requirespecific name
//Shortens code length

eg:without lambda
cube c=new cube;
 with lambda
cube c = (int a)->aaa;

What is GENERICS:
//Older versions of java takes all the inputs as objects.for example if u wanna add a and b,it takes them as objects and not as integers.
//To avoid any errors,new java version introduced generics
//Java Generic methods and generic classes helps to specify the data type of a class or method.
//For example,consider an integer array and ur passing string to tht array ,older java will accept the string but throw error but new java versions wont even accept it.
//Hence less errors

 eg: ArrayList<String> a= new ArrayList<String>();
        a.add("Melo");
        a.add("Emy");
	
	
What is WRAPPER:
//Just a class defined for a primitive data type such as int,floar,char.
//Wrapping a data type in a class
	
why wrapper?
//Java is pure OOPS so everything should be as classes and objects
//The wrapper classes in Java are used to convert primitive types (int, char, float, etc) into corresponding objects.
eg:
int a = 5;
// converts into object
Integer aObj = a;

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
	
what is polymorphism?
//Many classes that are inheritant by each other
//many forms

What is Method overloading?
//Same name and same class but has a different arguments.
//Also called as a Compile time polymorphism.

Example:
class Main{
    public void ctp(){
        System.out.println("Same name and has a same class");}
    public void ctp(int a){
        System.out.println("But has a different argument");}

public static void main(String[] args) {
        Main m1= new Main();
        m1.ctp();
        m1.ctp(676);
    }
}

Real word examples ?
//The payment option on any ecommerce website has several options like netbanking, COD, credit card, etc. 
//That means, a payment method is overloaded several times to perform single payment function in various ways.
or 
//A transaction is done from a sender to a reciever.
//Can be done either by paytm or gpay or Neft or any other means of online transaction.
	
What is compile time and run time?
//Compile time means that a programming language liek java is converted into a bytecode.
//Runtime means the byte code is converted into a machine understandable code or executable code.

What is method overrding?
//Same name but different classes with inheritance and has the same arguments.
//Also called as run time polymorphism.

Example:
class Main1{
    public void ctp(){
        System.out.println("Same name and different class");}}
        class Main2 extends Main1{
    public void ctp(){
        System.out.println("But has a same  argument");}

public static void main(String[] args) {
        Main1 m1= new Main1();
        m1.ctp();
        Main2 m2=new Main2();
        m2.ctp();
    }
}

Real time EAXMPLES:
//suppose there is a method getInterestRate() which returns the interest rate of a bank. 
//RBI is the superclass and it returns 7 for getInterestRate(). 
//There are various banks like sbi, axis, icici, etc which extend RBI class and override the getInterestRate() method to return 7.5, 8, 8.5, etc respectively.
	

What is String pool?
//String pool is nothing but a storage area in Java heap where string literals stores. 
//It is also known as String Intern Pool or String Constant Pool.
//It only stores strings as they are unmuttable.

Where is stringbuffer and stringbuilder stored?
//Both are stored on the heap memory because both these are mutable and changes can be only done on the heap memory and not on string constant pool.
	
What is inheritance and where it can be used ?
//Inherit the use of properties from one class into another class.

Types of inheritance with examples:
//Single Inheritance-Single parent and a single base class (Father son relationship)
//Multi-level Inheritance- single parent -single base class-from which single derieved class(food-pizza-pineapple pizza)
//Hierarchical Inheritance-single parent class and many subclass(vegetables-carrort,raddish)
//Hybrid Inheritance-many inheritance grouped together 
//multiple inheritance-chain of types of inheritance
	
What is super and subclasses in inheritance?
//the parental node or the main class is known as the super class and the derived class is known as the subclass.
//Extra features will be included in the subclass with respect to the super class.
	
	
	
	
	
	
	
	
	
	
	
	



	

  
  
