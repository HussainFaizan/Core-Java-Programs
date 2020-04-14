class Faizan {
    void abc() {
        System.out.println("This Is Parent Method");
    }
}

class Ashraf extends Faizan {
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
        Ashraf a = new Ashraf();
        a.Display();
    }
}
