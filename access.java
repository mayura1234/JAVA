public class access {
    public static void main(String[] args) {
        Outer ob2=new Outer();
        ob2.display();
        Outer.Inner ob3=ob2.new Inner();
        ob3.imethod();
        
    }
    
}
class Outer
{
    int outer_x=100;
    class Inner
    {
        int inner_y=200;
        void imethod()
        {
            System.out.println("Accessing from inner class ");
            System.out.println(outer_x);
            System.out.println(inner_y+outer_x);
        }
    }
    void display()
    {
            Inner ob1=new Inner();
            System.out.println("The value of inner class : "+ob1.inner_y);
            System.out.println("The value of outer class : "+outer_x);
    }
}
