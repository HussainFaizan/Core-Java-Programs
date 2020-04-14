interface A {
    void Addition(int x, int y);

    void Substraction(int x, int y);
}

class B implements A {
    public void Addition(int x, int y) {
        System.out.println("Addition is::" + (x + y));
    }

    public void Substraction(int x, int y) {
        System.out.println("Substraction is::" + (x - y));
    }
}

class Interface {
    public static void main(String[] args) {
        B obj = new B();
        obj.Addition(10, 10);
        obj.Substraction(12, 10);
    }
}
