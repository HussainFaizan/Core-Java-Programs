import java.util.Scanner;

class StrMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Pattern::");
        String s1 = sc.nextLine();
        System.out.println("Enter Searching Char::");
        char ch = sc.next().charAt(0);

        System.out.println(s1.indexOf(ch));
        System.out.println(s1.lastIndexOf(ch));
        System.out.println(s1.length());
        System.out.println(s1.substring(1, 4));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.trim());
        sc.close();

    }
}