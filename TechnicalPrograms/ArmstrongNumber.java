
public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int rem, rev = 0;
        int num = n;
        while (n > 0) {

            rem = n % 10;
            n = n / 10;
            rev = rev + (rem * rem * rem);
        }
        if (num == rev) {
            System.out.println(num + " " + "is ArmStrong Number");
        } else {
            System.out.print(num + " " + "is Not Armstrong Number");
        }
    }
}