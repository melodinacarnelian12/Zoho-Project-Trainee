//Has a relationship
//But both class can exist without the other class 
//An author can exist without a book 
//And a book can Exist without the author 
//Advantages reusability of codes!
//week entity that both can exist without each other 

class Author
{
  String authorName;
  int age;
  String place;
  Author(String name, int age, String place)
  {
    this.authorName = name;
    this.age = age;
    this.place = place;
  }
}

class  Book
{
  String name;
  int price;
  Author auther;//using the other class 
  Book(String n, int p, Author auther)
  {
    this.name = n;
    this.price = p;
    this.auther = auther;
    }
  
}


//Aggregation:
When you want to use some property or behaviour of any class
without the requirement of modifying it or adding more functionality to it, in such case Aggregation.
But if you want to modify the parameters on the code later then use inheritance
