import java.util.Scanner;

public class Methods {

    public void table(int num) {
        int i = 1;
        while (i != 11) {
            System.out.print(num * i + " ");
            i++;
        }
    }

    static int fib(int a) {
        if (a == 1 || a == 2)
            return a - 1;
        else
            return fib(a - 1) + fib(a - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        Methods obj = new Methods();
        obj.table(num);

        System.out.println("\nFibonacci series:");
        for (int i = 1; i <= num; i++) {
            System.out.print(fib(i) + " ");
        }

        sc.close();
    }
}
