class LocalVar {

    LocalVar() {
        int a = 10;
        System.out.println("Inside the Cons::" + a);
    }
    /*
     * System.out.println("Outside the Cons::" + a); We cannot access the varable
     * outside the Block
     */

    public static void main(String[] args) {
        new LocalVar();

    }
}