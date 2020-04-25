class Parent {
    void abc() {
        System.out.println("This Is Parent Method");
    }
}

class Child extends Parent {
    void abc() {
        System.out.println("This Is Child Method");
    }

    void Display() {
        super.abc();
        this.abc();

    }
}

class SuperMethod {
    public static void main(String[] args) {
        Child a = new Child();
        a.Display();
    }
}
