import java.util.Scanner;



 class Employee{
    Scanner sc = new Scanner(System.in);
    int salary;
    String name;
    int getSalary()
    {
        salary = sc.nextInt();
        return salary;
    }
    String getName()
    {
        return name;
    }
    void setName(String n)
    {
        name = n;
    }
    
}

public class CustomClass {
    public static void main(String[] args) {
        Employee obj =  new Employee();
       // obj.salary = 34000;
        obj.name = "lalan";
        System.out.println(obj.getSalary()+obj.getName());
        obj.setName("lallu");
        System.out.println(obj.getName());
    
       
    }
}
