
public class NestedTryBlock {
    public static void main(String[] args) {
        try {

            try {
                String str = null;
                System.out.println(str);

            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            try {
                int a = 100 / 0;
                System.out.println(a);
            } catch (ArithmeticException e) {

                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}