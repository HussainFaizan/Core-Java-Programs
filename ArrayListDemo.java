import java.util.ArrayList;

class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(55);
        al.add(65);
        al.add(75);
        al.add(85);
        al.add(null);
        al.add(64);

        // System.out.println(al);

        java.util.Iterator it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + "\t");
        }
    }
}