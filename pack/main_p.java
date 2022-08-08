package pack;

public class main_p {
    public static void main(String[] args) {
        stack_inter fix;
       stack_inter dyn;
        fixed f1=new fixed(10);
        dynamic d1=new dynamic(5);
        fix=f1;
        dyn=d1;
        for(int i=0;i<11;i++){ 
            fix.push((char)('A'+i));
        }
        System.out.println("\n");
        for(int i=0;i<11;i++){
            System.out.print(fix.pop()+" ");
        }
        System.out.println("\n");
        for(int i=0;i<50;i++){
            dyn.push((char)('A'+i));
        }
        for(int i=0;i<50;i++)
        {
            System.out.print(dyn.pop()+" ");
        }
        System.out.println("\n");
    }
}