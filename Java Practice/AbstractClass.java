abstract class Parent{
    Parent(){
        System.out.println("Hello lboy im parent");
    }
    public void sayHello(){
        System.out.println("hwllo");

    }
    abstract void greet(int n);
}

class Child1 extends Parent{ 
    void greet(int n){
        System.out.println("good morning");
    }
}

abstract class Child2 extends Parent{
    // void greet(){
    //     System.out.println("good evening");
    // }
    void help(){

    }
}



public class AbstractClass {
    public static void main(String[] args) {
        Child1 obj1 = new Child1();
        obj1.sayHello();
        obj1.greet(0);
        Parent p=obj1;
        p=obj1;
        p.greet(0);
        
    }
}
