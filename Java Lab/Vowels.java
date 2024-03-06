import java.util.*;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println("Entered string "+ str);
        StringBuffer sb = new StringBuffer(str);
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)=='a'||sb.charAt(i)=='e'||sb.charAt(i)=='i'||sb.charAt(i)=='o'||sb.charAt(i)=='u')
            {
                 sb.deleteCharAt(i);
                i--;
            }
        }
        System.out.println("Final string "+ sb.toString());

        sc.close();
    }

}
