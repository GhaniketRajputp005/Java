import java.util.*;


interface CalVolume{
    double pi = 3.14;
    void displayVolume();
}

class Cone implements CalVolume{

        double rad,hgt;
    Cone(double r,double h){
        rad = r;
        hgt = h;
    }
    public void displayVolume(){
        System.out.println((1/3.0)*pi*rad*hgt);
    }

}

class Hemisphere implements CalVolume{
    double rad;
    Hemisphere(double r,double h){
        rad = r;
       
    }
    public void displayVolume(){
        System.out.println((2.0/3)*pi*rad*rad*rad);
    }

}

class Cylinder implements CalVolume{
         double rad,hgt;
    Cylinder(double r,double h){
        rad = r;
        hgt = h;
    }
    public void displayVolume(){
        System.out.println(pi*rad*rad*hgt);
    }

}


public class VolumeInterface {

    public static void main(String[] args) {
        CalVolume rf ;
        Cone obj = new Cone(10,10);
        rf = obj;
        rf.displayVolume();
        Hemisphere obj1 = new Hemisphere(10,10);
        rf = obj1;
        rf.displayVolume();
        Cylinder obj2= new Cylinder(10,10);
        rf = obj2;
        rf.displayVolume();

    }


    
}
