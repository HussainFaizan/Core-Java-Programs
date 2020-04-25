import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number to Find a Fibonacci Series:");
        int n = sc.nextInt();
        System.out.print("1  1 ");
        int sum = 0;
        int a = 1, b = 1;
        while (sum <= n) {
            sum = a + b;
            System.out.print(sum + " ");
            a = b;
            b = sum;
        }
    }
}