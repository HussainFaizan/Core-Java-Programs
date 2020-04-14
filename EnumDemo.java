import java.util.*;

enum Demo {
    ;
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Java Program Without Class");
        int a, b;
        System.out.println("Enter Two No To find Addition::");
        a = sc.nextInt();
        b = sc.nextInt();
        int sum = a + b;
        System.out.println("The Sum is::" + sum);
    }
}