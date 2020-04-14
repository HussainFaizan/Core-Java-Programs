import java.util.*;

class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Two Numbers::");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum::" + (a + b));
        try {
            System.out.println("Div::" + (a / b));

        } catch (Exception e) {

            e.printStackTrace();
            System.out.println(e);
        }

        System.out.println("Mul::" + (a * b));
        System.out.println("Sub::" + (a - b));
        System.out.println("OK");
        System.out.println("This Statement Executes If Exception");
    }

}