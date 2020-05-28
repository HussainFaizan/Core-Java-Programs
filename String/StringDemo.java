public class StringDemo {
    public static void main(String[] args) {
        String str1 = "about_java";
        char ch[] = { 'j', 'a', 'v', 'a' };
        String str2 = new String(ch);
        String str3 = new String("about_java");
        System.out.println("First String::" + str1.length());
        System.out.println("Second String::" + str2.length());
        System.out.println("Third String::" + str3.length());
    }
}