import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        System.out.println(v.capacity());
        v.add("Faizan");
        v.add("hussain");
        v.add("Salman");
        v.add("khan");
        System.out.println(v.capacity());

        System.out.println("OutPut Based On the S.O.P.L Statement");
        System.out.println(v);

        System.out.println("OutPut Based On the Enumeration");
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement() + "\t");
        }

        System.out.println("\n Output BAsed on the Iterator");
        Iterator it = v.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + "\t");
        }

        System.out.println("\n Output based on the List Iterator Backword Direction");
        ListIterator li = v.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next() + "\t");
        }

        System.out.println("\n Output based on the List Iterator Forword Direction");
        while (li.hasPrevious()) {
            System.out.println(li.previous() + "\t");
        }

        System.out.println("\n Output based on the For loop");
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i) + "\t");
        }

        System.out.println("Output Based on the For Each loop");
        for (String o : v) {
            System.out.println(o + "\t");
        }

    }
}