import java.util.Scanner;
public class KmToMile {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double dist = sc.nextDouble();
    System.out.println("km = "+dist+"\nmile = "+(dist*0.6214));

    boolean b = sc.hasNextInt();
    System.out.println(b);
}
}
