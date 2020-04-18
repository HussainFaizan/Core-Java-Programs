
public class Demo {
    public static void main(String[] args) {
        int x = 2;
        int y = 4;
        switch (x + 2) {
            case 4:

                --y;
                ++x;

            case 5:
                System.out.println(x);
                ++y;
                --x;
            default:
                ++y;
                --x;
        }
        System.out.println(y + " " + x);
    }
}