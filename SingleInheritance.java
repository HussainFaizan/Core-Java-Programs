class Abc {
    void m1() {
        System.out.println("Super class Method  M1");
    }
}

class pqr extends Abc {
    void m2() {
        System.out.println("Child Class Method M2");

    }
}

class SingleInheritance {
    public static void main(String[] args) {
        Abc a = new Abc();
        a.m1();
        // a.m2();
        pqr p = new pqr();
        p.m1();
        p.m2();
    }
}