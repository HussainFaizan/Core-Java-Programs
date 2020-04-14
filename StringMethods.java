class StringMethods {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter Any String");
        String s1 = sc.nextLine();
        System.out.println("Enter index postion");
        int n = sc.nextInt();

        char ch = s1.charAt(n);
        System.out.println(n + "Index Char is :" + ch);
        System.out.println(n + "index char is=" + s1.codePointAt(n));
        System.out.println(n + "index before UNICODE value=" + s1.codePointBefore(n));
    }
}