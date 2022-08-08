import java.util.Scanner;

class Account{
    String owner;
    double AccNo;
    double Bal;
    Account(String s,double a )
    {
        owner=s;
        AccNo=a;
        Bal=500;
    }
    void deposit(double d)
    {
      Bal+=d;
    }
    void withdraw(double d)
    {
        if(Bal-d<500)
        {
            System.out.println("Low Balance\n");
            return;
        }
        Bal-=d;

    }
       void Display()
       {
           System.out.println("Balance="+Bal);
       }

}
public class prg5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Owner Name : ");
        String name=sc.next();
        System.out.print("Enter the Account Number : ");
        double acc=sc.nextDouble();
        //System.out.println("Balance");
        //double bal=sc.nextDouble();
        Account a=new Account(name,acc);
        Boolean opt=true;
        while(opt)
        {
            System.out.println("1.Deposit\n2.Withdarwal\n3.Display\n");
            System.out.println("Enter your choice : ");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1: System.out.println("Enter the amount to be deposited : ");
                        Double amt=sc.nextDouble();
                        a.deposit(amt);
                        break;
                case 2:System.out.println("Enter the amount to be Withdrawed : ");
                        Double amt1=sc.nextDouble();
                        a.withdraw(amt1);
                        break;
                case 3 : a.Display();
                         break;
                case 4 : 
                         System.exit(0);
            }
        }

    
}
}
