
class StrConcat {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter First Name::");
        String s1 = sc.nextLine();

        System.out.println("Enter Middle Name::");
        String s2 = sc.nextLine();

        System.out.println("Enter Last Name::");
        String s3 = sc.nextLine();

        System.out.println("Full Name::" + s1.concat(s2));
        System.out.println("Complete Name::" + s1 + s2 + s3);
        sc.close();

    }
}
