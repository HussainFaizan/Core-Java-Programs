import java.util.*;

public class VectorEx {
    public static void main(String args[]) {
        Vector<String> v = new Vector<String>();
        v.add("One");
        v.add("Two");
        v.add("Three");
        v.add("Four");
        v.add("Five");
        Iterator<String> itr = v.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}