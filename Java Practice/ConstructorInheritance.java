class Base {
    Base() {
        System.out.println("Hello i'm base class constructor");
    }

    int a;

    Base(int a) {
        System.out.println("now value of a is" + a);
    }
}

class Derived extends Base {
    Derived() {
        super(10);

        System.out.println("now i'm in base class");
    }
    Derived(int a,int b){
        super(a);
        System.out.println("i am overloaded in derived class");
    }

}

class DerivedLatest extends Derived{
    DerivedLatest(){
        System.out.println("grandchild");
    }
    DerivedLatest(int x,int y,int z){
        super(x,y);
        System.out.println("two values passed to superclass and one is"+z);
    }
}

public class ConstructorInheritance {
    public static void main(String[] args) {
        // Base b = new Base();
        DerivedLatest d = new DerivedLatest(12,13,14);

    }
}