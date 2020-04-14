class SwapDemo {
    void interchange(int x, int y) {
        System.out.println("OutPut Before Swapping");
        System.out.println(x);
        System.out.println(y);

        int z = x;
        x = y;
        y = z;
        System.out.println("OutPut After Swapping");
        System.out.println(x);
        System.out.println(y);

    }

    void Swap(int x, int y) {
        System.out.println("OutPut Before Swapping");
        System.out.println(x);
        System.out.println(y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("OutPut After Swapping");
        System.out.println(x);
        System.out.println(y);

    }

    public static void main(String[] args) {
        SwapDemo d = new SwapDemo();
        d.interchange(10, 20);
        d.Swap(30, 40);
    }
}