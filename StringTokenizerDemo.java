import java.util.*;

class StringTokenizerDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any String");
        String s1 = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s1);

        System.out.println(st.countTokens());// Divided Strings into Tokens
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken(","));
            sc.close();
        }
    }
}