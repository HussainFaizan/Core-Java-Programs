import java.util.*;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> al = new LinkedList<String>();
        al.add("One");
        al.add("Two");
        al.add("Three");
        al.add("Four");
        al.add("Five");

        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}