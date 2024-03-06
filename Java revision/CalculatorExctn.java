import java.util.Scanner;

class MyCalculator{
    int power(int n,int p) throws Exception{
        if(n<0 || p<0){
            throw new Exception("it is negative");
        }
        else{
            return n*p;
        }
    }
}



public class CalculatorExctn {
    public static void main(String[] args) {
        
    

    Scanner sc =  new Scanner(System.in);
    int n,p ;
    n = sc.nextInt();
    p = sc.nextInt();

    MyCalculator obj = new MyCalculator();
    try{
    int res = obj.power(n,p);
    System.out.println(res);
    }
    catch(Exception e){
        System.out.println(e);
    }
    

    }


    
}
