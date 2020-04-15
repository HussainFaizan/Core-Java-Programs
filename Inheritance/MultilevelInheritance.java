class A {
    void m1() {
        System.out.println("Method::1 of Class A");
    }
}

class B extends A {
    void m2() {
        System.out.println("Method::2 of Class B");

    }
}

class C extends B {
    void m3() {
        System.out.println(" Method::3 of Class C");
    }
}

class MultilevelInheritance {
    public static void main(String[] args) {
        C c = new C();
        c.m1();
        c.m2();
        c.m3();

    }
}