import java.util.*;

public class Stringg {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // System.out.println(str.length());
        int flag = 0;
        for(int  i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }

        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        String st = sb.toString();

        if(str.equals(st)){
                        System.out.println("palindrome");

        }
         else {
            System.out.println("not palindrome");
        }
    }
    
}
