
import java.util.*;

abstract class Temp{
    double tem;
    void setTempData(double tp){
        tem = tp;
    }
    abstract void changeTemp();
}

class Fahren extends Temp{
    double ctemp;
    void changeTemp(){
        ctemp = 5/9.0*(tem-32);
        System.out.println(ctemp);
    }
}

class Celsius extends Temp{
    double ftemp;
    void changeTemp(){
        ftemp  = (9/5.0)*(tem+32);
        System.out.println(ftemp);
    }
}

public class Temperature {

    public static void main(String[] main){

        Celsius obj = new Celsius();
        obj.setTempData(100);
        obj.changeTemp();
        Fahren obj1 = new Fahren();
        obj.setTempData(110);
        obj1.changeTemp();

    }
    
}
