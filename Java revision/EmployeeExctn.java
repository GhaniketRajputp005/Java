import java.util.*;

class MyException extends Exception{

    MyException(String msg ){
        super(msg);
    }
}


public class EmployeeExctn {

    public static void main(String[] args) {
        String name;
        int empId,deptId;
        
        Scanner sc  = new Scanner(System.in);
        try{
             empId = sc.nextInt();
            if(!(empId>=2001 && empId <= 5001)){
                throw new MyException("employee id must b between 2001 to 5001");
            }
            String str = sc.nextLine();
        name = sc.nextLine();
        if(!(name.charAt(0)>='A'&&name.charAt(0)<='Z'))
            throw new MyException("First letter must be capital");
        

       
        deptId = sc.nextInt();
            if(!(deptId>=1 && deptId <= 5)){
                throw new MyException("it must be between 1 to 5");
            }

            System.out.println(empId+" \n"+deptId+" \n"+name);
        }
        catch(MyException e){
            System.out.println(e);
        }
        finally{
            System.out.println("thank you");
        }

        sc.close();
        

    }
    
}
