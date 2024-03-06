
import java.util.*;

class GhaniketException extends Exception{
    GhaniketException(String msg){
        super(msg);

    }
}

public class ExceptionHandling {
    public static void main(String[] args){

        
        int arr[] = new int[5];
        try{
            int i=6;
        int j = 0;
        int k = 1;
            //  if(j==0){
            //     // throw new ArithmeticException("nai hoga terse");
            //     throw new GhaniketException("mera h mera");
            // }
            int z = i/j;
            //int y = arr[6];
           

        }
        // catch(GhaniketException e){
        //     System.out.println(e);
        // }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("hello");
        }
        catch(ArithmeticException e){
            System.out.println("yo "+e);
        }
        // // catch(Exception e){
        //     System.out.println("helmlo "+e);
        // }
       finally{
        System.out.println("please check your denominator");
        

       }
        System.out.println("After Exception");
    }
    
}
