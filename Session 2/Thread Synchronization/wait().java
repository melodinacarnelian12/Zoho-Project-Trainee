class Threada extends Thread{
    synchronized public void run(){
       for(int i=1;i<5;i++){
           try{
           wait();
           System.out.println("i="+((2*i)));
           }
           catch(Exception e){
               System.out.println(e);
           }
       }
   }
}

class Main {

   public static void main (String []args){
       Threada t1 = new Threada();
       t1.start();
       t1.notify();
     for(int i=10;i<15;i++){
         System.out.println(i);
     }
      
   }
}

waits until the main program notifies it 
