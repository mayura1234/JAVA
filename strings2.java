public class strings2 {
    public static void main(String args[])
    {
        String s;
        int a=42;
        StringBuffer sb=new StringBuffer(4);
        System.out.println(sb);
       // System.out.println(sb.length());
        //System.out.println(sb.capacity());
         s=sb.append("a=").append(a).append("!").toString();
        //System.out.println(sb.append("strings2.java"));
        System.out.println(sb);
    }
    
}
