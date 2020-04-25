
public class Palindrome {
    public static void main(String[] args) {
        int n = 123, rev = 0, rem;
        int num = n;
        while (n > 0) { // n=123,rev=0;
            rem = n % 10; // n rem rev
            n = n / 10; // 12 3 3
            rev = rev * 10 + rem; // 1 2 32
                                  // 0 1 321
        }
        if (num == rev) {
            System.out.println("The Number is Palindrome");
        } else {
            System.out.println("The Number is not Palindrome");
        }
    }
}