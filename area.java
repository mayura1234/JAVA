public class area {
    public static void main(String[] args) {
        Area a=new Area();
        float s=20,b=3;
        double e=12,f=5,d=3;
       double tri=a.areaa(s,b);
        double rec=a.areaa(e,f);
        double sqr=a.areaa(d);
        System.out.println("_________________________________________");
        System.out.println("AREA USING METHOD OVERLOADING");
        System.out.println("_________________________________________");
        System.out.println("Triangle : "+tri);
        System.out.println("Rectangle : "+rec);
        System.out.println("Square : "+sqr);
        System.out.println("_________________________________________");
        
    }
    
}
class Area{
    double areaa(float b,float h)
    {
     return ((0.5)*b*h);
    }
    double areaa(double l,double b)
    {
        return l*b;
    }
    double areaa(double l)
    {
        return 2*l;
    }
}