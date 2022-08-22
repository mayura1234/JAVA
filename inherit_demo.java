class Shape {
    private double width;
    private double height;
    // private double length;
    // private double breadth;
    // double getBreadth()
    // {
    //     return breadth;
    // }
    // double getLength()
    // {
    //     return length;
    // }
    double getWidth()
    {
        return width;
    }
    double getHeight()
    {
        return height;
    }
    void setWidth(double w)
    {  
      width=w;
    }
    void setHeight(double h)
    {
        height=h;
    }
    
      Shape(double w, double h)
       {
           width=w;
           height=h;
       }

    // void print_sup()
    // {
    //     System.out.println("I am in Super Class - Shape");
    // }
}
class Triangle extends Shape{
    
     Triangle(double w, double h)
      {
           super(w,h);
     }
      double area()
       {
           return getWidth() * getHeight() / 2;
       }
    // void print_sub()
    // {
    //     System.out.println("I am in Sub Class - Triangle");
    // }
}
class Rectangle extends Shape{
      Rectangle(double l, double b)
      {
        super(l,b);
      }
       double area()
       {
         return getWidth() * getHeight();
       }
} 
public class inherit_demo {
    public static void main(String[] args) {
        Triangle t1=new Triangle(20,40);
        //   t1.setWidth(10);
        //   t1.setHeight(20);
        Rectangle r1=new Rectangle(50, 50);
        System.out.println("\n");
        System.out.println("Area of triangle is :"+t1.area());
        System.out.println("Area of Rectangle is : "+r1.area());
        System.out.println("\n");
    }
}
