import java.util.*;


class C {
    static  int ctr =0;;
    synchronized  static void count(){
        // System.out.println("jkdfjsk");
        ctr++;

    }
}
class A extends C implements Runnable
{
    public void run(){
        for(int i=0; i<10;i++ ){
            System.out.println("hi");
            C.count();
             try{
            Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
           
        }
    }
}

class B extends C implements Runnable{
   public   void run(){
        for(int i=0; i<10;i++ ){
            System.out.println("hello");
            C.count();
             try{
            Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }




}

public class SynchroThread {


        public static void main(String[] args) throws Exception {
            
        
      Runnable obj =  new A();
        Runnable ob1 = new B();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(ob1);

        t1.start();
        t2.start();

        C ob;
        t1.join();
        t2.join();
        System.out.println(C.ctr);

    
         
    }

}

