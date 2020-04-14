package demo;
import java.util.*;
class OTPValidate {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (i <= 3) {
            double x = 1000 * Math.random();
            int otp = (int) x;
            System.out.println(otp);
            System.out.println("Enter OTP U Got");
            int otp1 = sc.nextInt();
            if (otp1 == otp) {
                System.out.println("Validated... ");
                System.exit(0);
            }

            Thread.sleep(1000000000);
            i++;
sc.close();
        }

        Thread.sleep(5000000);
    }
    
}