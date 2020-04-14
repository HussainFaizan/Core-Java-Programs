class Faizan {
    int rollno = 101;
    String name = "Faizan";
}

class Ashraf extends Faizan {
    int rollno = 102;
    String name = "Ashraf";

    void Display() {
        System.out.println("The Name Is::" + super.name);
        System.out.println("The Name Is::" + name);
        System.out.println("The Roll No Is::" + super.rollno);
        System.out.println("The Roll No Is::" + rollno);

    }
}

class SuperVaribale {
    public static void main(String[] args) {
        Ashraf a = new Ashraf();
        a.Display();
    }
}
