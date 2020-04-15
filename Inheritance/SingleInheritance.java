class Abc {
    void m1() {
        System.out.println("Parent class Method  M1");
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
        a.m1(); // Parent class method
        // a.m2(); // Parent Class Cannot Access The property of the child class.
        pqr p = new pqr(); // Child class Can Access the property of the parent class.
        p.m1(); // Parent class method
        p.m2(); // Child Class Method
    }
}