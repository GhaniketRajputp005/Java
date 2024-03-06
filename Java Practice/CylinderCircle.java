

class Circle{
    Circle(int r){
        
    }
    
}

class Cylinder extends Circle{
    double height,radius;
    Cylinder(int r,int h){
        super(r);
        radius =r ;
        height = h;

    }
    double area(){

    return Math.PI*radius*radius*height;
    }

}



public class CylinderCircle {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder(12,34);
        obj.area();
    }
}
