import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();// Create ArrayList
        al.add("One"); // Adding string in Array
        al.add("Two");
        al.add("Three");
        al.add("Four");
        al.add("Five");
        Iterator itr = al.iterator();// Traversing array Using Iterator
        while (itr.hasNext()) {
            System.out.println(itr.next());// Printing one by one String
        }
    }
}