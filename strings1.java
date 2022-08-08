public class strings1 {
    public static void main(String args[]) {
        StringBuffer sb=new StringBuffer("Hello");
        System.out.println("\n");
        System.out.println("buffer before " + sb);
        System.out.println("charAt(1) before : " + sb.charAt(1));
        sb.setCharAt(1, 'i');
        sb.setLength(2);
        System.out.println("buffer after : " + sb);
       // System.out.println("length= " + sb.length());
        System.out.println("CharAt(1) after : "+ sb.charAt(1));
        System.out.println("capacity:"+ sb.capacity());

        

    }
    
}
