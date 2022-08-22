public class insertdemo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("I Java");
        sb.insert(2,"like ");
        System.out.println(sb);
        sb.insert(2,"Don't ");
        System.out.println(sb);
        sb.delete(2, 7);
        System.out.println(sb);
        sb.delete(3, 7);
        System.out.println(sb);
        sb.insert(2, "hate ");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
    
}
