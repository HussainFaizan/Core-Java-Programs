abstract class A {
    abstract void Addition(int a, int b);

    abstract void Substraction(int a, int b);
}

class B extends A {
    void Addition(int a, int b) {
        System.out.println("Addition is :" + (a + b));
    }

    void Substraction(int a, int b) {
        System.out.println("Substraction:" + (a - b));
    }
}

class Abstraction {

    public static void main(String[] args) {
        B obj = new B();
        obj.Addition(10, 10);
        obj.Substraction(12, 10);
    }
}