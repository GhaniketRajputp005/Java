

class csthread implements Runnable{

    public void run(){
    for(int i=0;i<=4;i++){
        System.out.println("CSthread " + i);
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

}

class itthread implements Runnable{

    public void run(){

    for(int i=0;i<=4;i++){
        System.out.println("ITthread " + i);
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
}



public class CstIthreadIt {

    public static void main(String[] args) {

        Runnable obj = new csthread();
        Runnable obj1  = new itthread();

        Thread CSthread = new Thread(obj);
        Thread Itthread = new Thread(obj1);


        CSthread.start();
        Itthread.start();


        
    }


    


}
