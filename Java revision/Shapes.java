import java.util.*;


abstract class Sape{
    abstract   double rectangle(int len ,int br);
    abstract   double square(int side);
    abstract  double circle(int rad);
}

class Area extends Sape{
    double rectangle(int len ,int br){
        return len*br;
    }
    double square(int side){
        return side*side;
    }
    double circle(int rad){
        return 3.14*rad*rad;
    }

}

public class Shapes {
    public static void main(String[] args){

        Area obj = new  Area();
        
        System.out.println(obj.rectangle(10,20));
            System.out.println( obj.square(4)  );

                System.out.println(obj.circle(5));


  


        





        
    }
    
}
