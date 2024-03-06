import java.util.*;

class A extends Thread
{
    public void run(){
        for(int i=0; i<10;i++ ){
            System.out.println("hi");
             try{
            Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
           
        }
    }
}

class B extends Thread{
   public   void run(){
        for(int i=0; i<10;i++ ){
            System.out.println("hello");
             try{
            Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }




}
public class ExtendThreadss {
    public static void main(String[] args) {
        
        A obj =  new A();
        B obj1 = new B();

        System.out.println(obj.getPriority());
        System.out.println(obj1.getPriority());
        obj.setPriority(7);
        obj.start();
        //  try{
        //     Thread.sleep(10);
        //     }
        //     catch(InterruptedException e){
        //         e.printStackTrace();
        //     }
        obj1.start();
    }

    
    
}
