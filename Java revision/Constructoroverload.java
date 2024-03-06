import java.util.*;


 class ArrayDemo{
    public void arrayFunc(int arr[],int target){
        for(int i=0 ; i<arr.length ; i++){
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(i + " " + j);
                }
            }
        }
    }

    public void arrayFunc(int a[],int p,int b[],int q){
        int temp;
        for(int i=0,j=0;i<p&&j<q;){
            if(a[i]>b[j]){
                System.out.println("hjdsfh");
                temp  = a[i];
                a[i] = b[j];
                b[j]  =temp;
                i++;
            }
            else{

                j++;
            }
        }
         for(int i=0;i<5;i++){
        System.out.print(a[i]+" ");
       }
        for(int i=0;i<3;i++){
        System.out.print(b[i]+" ");
       }
 }
}

public class Constructoroverload {

        public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
        int arr[] = {4,6,5,-10,8,2,20};
        ArrayDemo obj = new ArrayDemo();
        obj.arrayFunc(arr,10);

        int arr1[] = {1,5,7,-1,5};
        int arr2[] = {2,4,9};
        obj.arrayFunc( arr1,5,arr2,3);
      

            
        }

     
    
}
