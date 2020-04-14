class ParameterizedCons {
    ParameterizedCons(int p1, int p2) {
        System.out.println("Welcome to The Parameterized Constructor");

        System.out.println("Price is:::" + p1 + "P2 Value is::" + p2);

    }

    public static void main(String[] args) {
        ParameterizedCons c = new ParameterizedCons(900, 7000);

    }
}