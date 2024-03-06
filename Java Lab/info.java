import java.util.*;

public class info {
    public static void main(String args[]) {
        int choice;
        double amount = 0;
        double principal, roi, time, installment;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your choice\n" + "Press 1  -  TERM DEPOSIT\n" + "Press 2  -  RECURRING DEPOSIT\n");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter Principal amount: ");
                principal = sc.nextDouble();
                System.out.print("Enter Rate of Interest: ");
                roi = sc.nextDouble();
                System.out.print("Enter Time(in years): ");
                time = sc.nextDouble();
                amount = principal * Math.pow((1 + (roi / 100)), time);
                break;
            case 2:
                System.out.print("Enter monthly installment ");
                installment = sc.nextDouble();
                System.out.print("Enter Rate of Interest: ");
                roi = sc.nextDouble();
                System.out.print("Enter Time(in months): ");
                time = sc.nextDouble();
                amount = installment * time + (installment * time *(((time + 1) / 2) *
                        (roi / 100) ) / 12);
                break;
            default:
                System.out.println("invalid option\n");
        }

        System.out.println("\nMaturity amount  = " + amount);
        sc.close();

    }

}
