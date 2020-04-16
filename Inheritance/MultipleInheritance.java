interface Parent1 {
    void fun();

    int i = 10;
}

interface Parent2 {
    void fun();

    int i = 100;
}

class Child implements Parent1, Parent2 {

    public void fun() {
        System.out.println("Parent1:" + Parent1.i);
        System.out.println("Parent2:" + Parent2.i);
    }
}

class MultipleInheritance {

    public static void main(String args[]) {
        Child t = new Child();

        t.fun();
    }
}