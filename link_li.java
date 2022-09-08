import java.util.LinkedList;
import java.util.List;

public class link_li {
    public static void main(String[] args) {
        System.out.println(" ");
        LinkedList<Character> ll =new LinkedList<>();
        ll.add('A');
        ll.add('B');
        ll.add('C');
        ll.add('D');
        System.out.println("Initial contents..."+ll);
        ll.addLast('E');
        ll.addFirst('X');
        System.out.println("After Adding to first and last position.."+ll);
        ll.add(5,'Y');
        ll.add(1,'Z');
        System.out.println("Specifying position and adding..."+ll);
        System.out.println("Displaying First and last elements..."+ll.getFirst()+" "+ll.getLast());
        List<Character> sub=ll.subList(1,6);
        System.out.println("Sublist...from 1 to 6....."+sub);
        LinkedList<Character> ll2=new LinkedList<>(sub);
        ll2.removeFirst();
        System.out.println("After removing First element from sublist......"+ll2);
        ll2.removeLast();
        System.out.println("After removing Last element from sublist....."+ll2);
        System.out.println("Main List......"+ll);
        System.out.println("SubList......"+ll2);
       //  System.out.println("Deleting sublist contents..."+ll.removeAll(ll2));
       ll.removeAll(ll2);
       System.out.println("Remove Intersected elements..."+ll);
    }
}
