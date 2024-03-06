class Animal{
    private String name = "Animals";
    void display(){
        System.out.println("we are in class"+name);
    }
}
class Dog extends Animal{
    private String name = "Dog";
    void show(){
        System.out.println("we are in class"+name);
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.show();
        obj.display();
        
        
    }
}
