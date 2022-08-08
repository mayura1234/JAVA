interface Rectangle{
    float astamangala(float len, float bre);
}
interface Triangle{
   float area_tri(float len, float bre);
}
class Area implements Rectangle,Triangle
{
    public float astamangala(float len,float bre)
    {
        return (len*bre);
    }
    public float area_tri(float len,float bre)
    {
        return ((len*bre)/2);
    }
}
public class area1 {
    public static void main(String[] args) {
        Area a = new Area();
        System.out.println("Area of Rectangle is : "+a.astamangala(3,4));
       System.out.println("Area of triangle is : "+a.area_tri(5, 6));
    }
    
}
