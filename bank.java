import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

class User{
    String name;
    User(String nm){
        name=nm;
    }
class Account{
    int accNo;
    double balance;
    Account(int Acc){
        accNo=Acc;
    }
}
    Account [] a=new Account[2];
    void Deposit(int amt,int acno){
      for(int i=0;i<2;i++)
      {
        int k=-1,found=0;
        if(a[i].accNo==acno){
            a[i].balance+=amt;
            k=i;
            break;
        if(found==1)
        {
        System.out.println("Balance Updated : ");
        display(a[k].accNo);
        }
    }
        else 
        System.out.println("Account Number Doesnot exists : ");
      }
    void withdraw(int amt,int acno)
    {
        int k=-1,found=0;
        if(a[i].accNo==acno)
        {
            k=i;
            found=1;
            break;
        }
        if(found==1)
        {
            if((a[k].balance<500) || (a[k].balance<amt))
            {
                System.out.println("Low balance");
            }
        }
    }
    void create_acc()
    {
        Scanner sc =new Scanner(System.in);
        for(i=0;i<2;i++)
        {
            System.out.println("Enter the Account Number : ");
            int ac=sc.nextInt();
            System.out.println("Enter the Balance : ");
            int bal=sc.nextInt();
            a[i]=new Account(ac);
        }
    }
    void display(int acn){
        int k=-1,found=0;
        if(a[i].accNo==acno)
        {
            k=i;
            found=1;
            break;
        }
        if(found==1)
        {
            System.out.println("Account details are : ");
            System.out.println("Name : "+name+"\n"+"AccNo : "+a[k].accNo+"\n"+"Balance : "+a[k].balance);
    }
    }
}

}
public class bank {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Create");
 }   
}
