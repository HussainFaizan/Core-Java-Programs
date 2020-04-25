class Parent {
    Parent(String str) {
        System.out.println("This Is Parent Method::" + str);
    }
}

class Child extends Parent {
    Child() {
        super("Allen");
        System.out.println("This Is Child Method");

    }

}

class SuperCons {
    public static void main(String[] args) {
        new Child();

    }
}
