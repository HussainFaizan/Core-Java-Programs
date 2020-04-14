class StringDemo {
    public static void main(String[] args) {
        // 1...String as A Constant Type:::
        String s1 = "Faizan";

        // 2..String as A Object Type
        String s2 = new String("Faizan");

        // 3...String as a Char Array Type/....

        char name[] = { 'F', 'A', 'I', 'Z', 'A', 'N' };
        String s3 = new String(name);

        // 4.///String as Null Constant....

        String s4 = null;
        // Priting Statments of alla the elelemnts...
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

    }
}