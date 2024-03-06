import java.util.Scanner;

public class MarksCbse{
    public static void main(String[] args) {
        System.out.println("take input from user");
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte();
        byte b = sc.nextByte();
        byte c = sc.nextByte();
        byte d = sc.nextByte();
        byte e = sc.nextByte();
        float f = (a+b+c+d+e)/5.0f;
        System.out.println("percentage = "+f);
        sc.close();
    }
}