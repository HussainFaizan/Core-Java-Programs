class Test {
    void m1() {
        System.out.println("M1 Logic");
    }

    void m2() {
        System.out.println("M2 Logic");
    }

    void m3() {
        this.m1();
        this.m2();
        System.out.println("M3 Logic");
    }
}

class ThisDemo {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.m3();
    }
}