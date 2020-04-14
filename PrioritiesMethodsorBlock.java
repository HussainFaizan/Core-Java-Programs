class PrioritiesMethodsorBlock {
    static {

    }

    public static void main(String[] args) {

        System.out.print("Static Method");
        PrioritiesMethodsorBlock obj = new PrioritiesMethodsorBlock();
        obj.m1();
    }

    void m1() {
        System.out.println("Instance Method");// INSTANCE METHOD....
    }

    static {
        System.out.println("Static Block");

    }
    {
        System.out.println("Instance Block 1");
    }

    PrioritiesMethodsorBlock() {
        System.out.println("This is Construcutor");
    }

    {
        System.out.println("Instance Block 2");
    }

}