import java.text.BreakIterator;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        int num = 29;
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " IS PRIME NUMBER ");
        } else {
            System.out.println(num + "IS NOT PRIME NUMBER");
        }
    }
}