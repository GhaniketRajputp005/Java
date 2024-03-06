import java.util.*;

public class saddlepoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows/columns in array");
        int num = sc.nextInt();
        int matrix[][] = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int min = 0, flag = 0, tempi = 0, tempj = 0,ctr=0;
        for (int i = 0; i < num; i++) {
            min = matrix[i][0];
           // tempi = i;
            for (int j = 0; j < num; j++) {
                if (matrix[i][j] <= min) {
                    min = matrix[i][j];
                    tempi=i;
                    tempj = j;
                }
            }
            flag = 0;
            for (int k = 0; k < num; k++) {
                if (matrix[k][tempj] > min) {

                    flag = 1;
                    break;
                }
            }

            if (flag != 1) {
                ctr=1;
                System.out.println("\n" + tempi + " " + tempj);
            }

        }
        if(ctr==0)
        {
            System.out.println("NO saddle point found");

        }
        sc.close();

    }

}
