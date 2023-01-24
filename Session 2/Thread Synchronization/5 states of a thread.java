1.new
2.Runnable
3.Running
4.Dead
5.Blocked 

class Threada extends Thread{
     public void run(){
        for(int i=1;i<5;i++){
            try{
            sleep(1000);
            System.out.println("i="+((2*i)));
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class Threadb extends Thread{
     public void run(){
        for(int i=1;i<5;i++){
            try{
            sleep(2000);
            System.out.println("i="+((2*i)-1));
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class multithreadw {

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
