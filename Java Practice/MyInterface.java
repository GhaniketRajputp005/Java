
interface Bicyle{
    int a =89;
     void applyBrake(int decrement);
    void speedUp(int increment);
}
interface Tricyle{
   // int a =89;
    void applyBrake();
    void speedUp();
}

class AvonCyle implements Bicyle,Tricyle{
    int speed = 0;
    void blowHorn(){
        System.out.println("poo p op p op");
    }
    public void applyBrake(int decrement){
        System.out.println("applying ");
        speed-=decrement;
        
    }
    public void speedUp(int increment){
        System.out.println("accelerator");
        speed+=increment;
    }
    public void applyBrake(){
            System.out.println("ateme e ");
    }
    public void speedUp(){
        System.out.println("hemlooo");
    }
}

public class MyInterface {
    public static void main(String[] args) {
        AvonCyle obj = new AvonCyle();
        obj.applyBrake(0);
        System.out.println(obj.speed);
        obj.blowHorn();
        obj.speedUp(9);
        obj.speedUp(9);
        obj.applyBrake(8);
        Bicyle by;
        by= obj;
        by.speedUp(10);




        System.out.println(obj.speed);
        obj.applyBrake();
        obj.speedUp();
       // Bicyle.a =9;
        System.out.println(AvonCyle.a);
    }
    
}
