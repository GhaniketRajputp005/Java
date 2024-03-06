import java.util.*;

class A{

    void my() throws Exception{
        int i=9;
        int j=0;
        int k=i/j;
        System.out.println("hello");
    }
}


public class ThrowsUse {

    public static void main(String[] args) {
        A obj = new A();
        try{

        obj.my();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }



    
}
