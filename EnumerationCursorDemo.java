import java.util.*;

public class EnumerationCursorDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        for (int i = 0; i <= 10; i++) {
            v.addElement(i);
        }
        System.out.println(v);
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            Integer in = (Integer) e.nextElement();
            if (in % 2 == 0)
                System.out.println(in);
        }
        System.out.println(v);
    }
}