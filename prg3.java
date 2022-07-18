import java.util.Scanner;

public class prg3 {
    public static void main(String[] args) {
        //StringBuffer sb=new StringBuffer();
        StringBuffer ab=new StringBuffer("");
        System.out.println("\n");
        System.out.print("Please Enter A String : ");
        Scanner sc=new Scanner(System.in);
       // System.out.println("Please Enter A String : ");
        String s=sc.next();
        StringBuffer sb=new StringBuffer(s);

        System.out.println("Capacity : "+sb.capacity());
        for(int i=sb.length()-1;i>=0;i--)
        {
            ab.append(sb.charAt(i));
        }
        System.out.println("Reverse : "+ab);
    
        String up=ab.toString().toUpperCase();
        System.out.println("Uppercase of reversed String : "+up);
        System.out.print("Enter another String : ");
        s=sc.next();
        ab=new StringBuffer(up);
        ab.append(s);
        System.out.println("Appended String is : "+ab);
        System.out.print("\n");
    }

    
    
}
