class Parent {
    int rollno = 101;
    String name = "Allen";
}

class Child extends Parent {
    int rollno = 102;
    String name = "Martin";

    void Display() {
        System.out.println("Parent Class Roll No::" + super.rollno);
        System.out.println("Parent Class Name::" + super.name);
        System.out.println("Child Class Roll No::" + rollno);
        System.out.println("Child Class Name::" + name);

    }
}

class SuperVaribale {
    public static void main(String[] args) {
        Child a = new Child();
        a.Display();
    }
}
