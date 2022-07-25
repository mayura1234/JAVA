public class constructor_demo {
    
   
    


public static void main(String[] args) {
    System.out.println("Constructor");
    constr cubo=new constr(6,7,2);
   constr cube=new constr(15);
    int v1=cubo.volume();
    int v2=cube.volume();
    cubo.print();
    //cube.print();
    cubo.print(v1);
    cube.print();
    cube.print(v2);
}
}
class constr{
    int le,br,hg;
   constr(int l,int b,int h)
    {
       le=l;
       br=b;
       hg=h;
    }
    constr(int l)
    {
       le=br=hg=l;
    }
    int volume()
    {
    return le*br*hg;
    }
    void print()
    {
        System.out.println("Method overloading");
    }
    void print(int v)
    {
        System.out.println("Volume :"+v);
    }
}