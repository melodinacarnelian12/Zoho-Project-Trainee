after 2 seconds 
class Threada extends Thread{
     public void run(){
        for(int i=1;i<5;i++){
            try{
            sleep(2000);
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
  
       
    }
}
