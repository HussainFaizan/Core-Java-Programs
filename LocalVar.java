class LocalVar {

    LocalVar() {
        int a = 10;
        System.out.println("Inside the Cons::" + a);
    }
    // System.out.println("Outside the Cons::" + a);

    public static void main(String[] args) {
        new LocalVar();

    }
}