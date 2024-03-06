class first{
    public void display()
    {
        System.out.println("im in first");
    }
    void display1(){
        System.out.println("helle");
    }
}

class second extends first{
    int a,b,c;
    static int d;
    @Override
   public void display(){
    super.display();
        System.out.println("im in second");
    }
    static void cycle(){
        d = 0;
        System.out.println(d);

        System.out.println("in cycle");
    }
   
}

public class MethodOveriding {
    public static void main(String[] args) {
       // first obj = new second();
        second obj1 = new second();
        obj1.display();


        // second obj = new second();

    // obj.display();
    // obj.display1();
    // second.cycle();
    // obj1.cycle();
    
    }
    
}
