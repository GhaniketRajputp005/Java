public class Array {
    public static void main(String[] args) {
        int marks[]=new int[6];
        //marks[0]=9;
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=i;
        }
        System.out.println(marks[0]);
        System.out.println(marks.length);
        for(int x:marks)
        {
            System.out.println(x);
        }

    }
    
}
