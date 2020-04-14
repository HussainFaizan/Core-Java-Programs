class StaticVar {
    static int x = 90;

    StaticVar() {
        x++;
        System.out.println(x);
    }

    public static void main(String[] args) {
        StaticVar obj1 = new StaticVar();
        StaticVar obj2 = new StaticVar();
        StaticVar obj3 = new StaticVar();
        StaticVar obj4 = new StaticVar();
        StaticVar obj5 = new StaticVar();

    }
}