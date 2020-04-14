class Faizan {
    Faizan(String str) {
        System.out.println("This Is Parent Method::" + str);
    }
}

class Ashraf extends Faizan {
    Ashraf() {
        super("Faizan");
        System.out.println("This Is Child Method");

    }

}

class SuperCons {
    public static void main(String[] args) {
        Ashraf a = new Ashraf();

    }
}
