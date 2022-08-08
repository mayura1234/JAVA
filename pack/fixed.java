package pack;

public class fixed implements stack_inter{
      char [] data;
      int tos;
    fixed(int s)
    {
        data=new char[s];
        tos=0;
    }
    public void push(char i)
    {
        
        if(isfull())
        {
            System.out.println("Stack is full......");
            return;
        }
        data[tos]=i;
        tos++;

    }
    public char pop()
    {
       if(isempty())
       {
        System.out.println("Stack is Empty......");
        return (char) 0;
       }
       tos--;
     return data[tos];
    }
    public boolean isempty() {

     return tos==0;
    }
    public boolean isfull()
    {
     return tos==data.length;
    }

    
}
