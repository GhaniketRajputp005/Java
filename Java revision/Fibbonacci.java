import java.util.*;
class Demo{
    void fib(int a,int b,int num){
        int c =0;
        for(int i=2;i<num;i++){
            c= a+b;
           a=b;
           b=c;
        }
 System.out.println(c+" ");

}

public class Fibbonacci{
     


    }
    public static void main(String [] args){

        int a = 0 ;
        int b = 1;

        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
        Demo obj = new Demo();
        obj.fib(a,b,num);

    }
}