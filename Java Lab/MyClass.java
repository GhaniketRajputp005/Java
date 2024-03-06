import java.util.Scanner;
class Bank{
    int accountNumber,balance=0;
    String address,name;

    void generateAccountNumber(int val){
        accountNumber = val;

    }
    void display(){
        System.out.println("Name is : " +name);
        System.out.println("Address is : "+address);
        System.out.println("balance is : "+balance);
        System.out.println("account number is : "+accountNumber);

    }
    void deposit(int credit){
        balance +=credit;
        display();
    }
    void withdraw(int debit){
        balance-=debit;
        display();
    }
    void changeAddress(String str){
        address = str;
        display();
    }


}

public class MyClass {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        int num =  sc.nextInt();
        Bank obj[]=new Bank[num];
        //Bank obj = new Bank();
        int val =1001;
        for(int i=0;i<num;i++){
            obj[i]=new Bank();
            obj[i].accountNumber = val;
            obj[i].balance = sc.nextInt();
            sc.nextLine();
            obj[i].name = sc.nextLine();
            obj[i].address = sc.nextLine();

            obj[i].display();
            obj[i].deposit(2300);
            val++;
        }
        //obj.withdraw(1200);
       // obj.changeAddress("dehradun");
        sc.close();




        
    }
    
}
