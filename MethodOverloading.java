class MethodOverloading {
    void sum(int x, int y) {
        int z = x + y;
        System.out.println("Sum =" + z);
    }

    void sum(int x, int y, int t) {
        int z = x + y + t;
        System.out.println("Sum =" + z);
    }

    void sum(int x, Double y) {
        double z = x + y;
        System.out.println("Sum =" + z);
    }

    public static void main(String[] args) {
        MethodOverloading c = new MethodOverloading();
        c.sum(1, 1, 1);
        c.sum(1, 1);
        c.sum(1, 1.5);
    }
}
