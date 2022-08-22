import java.io.Console;

public class strrev {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Kumar");
        System.out.println("\n");
        System.out.println(sb);
        StringBuffer ab=new StringBuffer(10);
       // System.out.println(sb.length());
      // for(int i=sb.length()-1;i>=0;i--)
           //ab.append(sb.charAt(i));
     for(int i=sb.length()-1;i>=0;i--)
       {
        ab.append(sb.charAt(i));
       }
     System.out.println(ab);
     System.out.println("\n");
    }
    
}
