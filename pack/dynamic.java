package pack;

public class dynamic implements stack_inter{
    char [] data;
    int tos;
    dynamic(int s)
    {
        data=new char[s];
        tos=0;
    }
    public void push(char s)
    {
        if(tos==data.length)
        {
            char[] ti=new char[data.length*2];
            for(int i=0;i<tos;i++)
            ti[i]=data[i];
            data=ti;
        }
        data[tos]=s;
        tos++;

    }
    public char pop(){
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


