1.Printing numbers with an odd thread and an even thread with random thread sleep timings

class Threada extends Thread{
     public void run(){
        for(int i=1;i<10;i++){
            try{
            sleep(1003);
            System.out.println("i="+(2*i));
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class Threadb extends Thread{
     public void run(){
        for(int i=1;i<10;i++){
            try{
            sleep(1000);
            System.out.println("i="+((2*i)-1));
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class Main {
    
    public static void main (String []args){
       // final Throws Exception e
        Threada t1 = new Threada();
        Threadb t2=new Threadb();
        System.out.println(t2.isAlive());//false
    
        t1.start();
       // t1.join();
        System.out.println(t1.isAlive());//true
        System.out.println(t2.isAlive());//false
        t2.start();
        System.out.println(t2.isAlive());//true 
    }
}


op:
  1
  2
  3
  4
  5
  6
  7
  8
  9
  10
  
