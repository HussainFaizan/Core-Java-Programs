
class StrCmp {
    public static void main(String[] args) {
        String s = "admin";
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter Any String::");
        String s1 = sc.nextLine();
        int n = s1.compareTo(s);
        System.out.println("Compare to::" + n);
        int m = s1.compareToIgnoreCase(s);
        System.out.println("Compare to=" + m);
        sc.close();

    }
}