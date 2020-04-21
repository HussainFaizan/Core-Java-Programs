
public class ArrayIndexOutOfBoundsExc {
    public static void main(String[] args) {
        try {

            int a[] = new int[5];
            a[6] = 50;
            System.out.println(a[6]);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}