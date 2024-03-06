import java.util.*;

public class rearrange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number of elements in array");
        int val =sc.nextInt();
        System.out.println("enter elements in array");
        int arr[] = new int[val];
        for(int i=0;i<val;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<val;i++)
        {
            if(arr[i]<0)
            {
                for(int j=0;j<val;j++)
                {
                    if(arr[j]>0)
                    {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp; 
                    break;
                    }
                }
            }
        }
        for(int i=0;i<val;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();

        
        
    }
    
}
