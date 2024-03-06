

class A implements Runnable
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

class B implements Runnable{
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

public class ImplementRunnable {


        public static void main(String[] args) {
            
        
      Runnable obj =  new A();
        Runnable ob1 = new B();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(ob1);

        t1.start();
        t2.start();

    
         
    }

}

