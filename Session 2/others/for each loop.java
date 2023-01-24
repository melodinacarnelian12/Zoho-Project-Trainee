class ForEachExample1{  
  public static void main(String args[]){  
   int arr[]={10,11,14,44};  
   int total=0;  
   for(int i:arr){  
     total=total+i;  
   }  
  System.out.println("Total: "+total);  
 }   
}  

//accessing each element without the need of traversing an array.
//readable and best alterantive for the foor loop 

Syntax:
for(data_type variable : array | collection){  
//body of for-each loop  
}  
